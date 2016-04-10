package net.storyteller.web.app;

import java.io.File;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.Attr;
import net.storyteller.model.AttrImpl;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.Noun;
import net.storyteller.model.NounImpl;

import org.apache.commons.lang.StringUtils;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

public class SystemCreatesNonnsAndAttrsFromCoreJarOfJ2eeStorysAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext(),100);
		
		Criteria criteria = session.createCriteria(J2eeStory.class);
		if(StringUtils.isNotBlank(req.getParameter("j2eeStory"))){
			criteria.add(Restrictions.eq("name", req.getParameter("j2eeStory")));
			System.err.println("creat enouns for j2eeStory " + req.getParameter("j2eeStory"));
		} 
		String packageName = req.getParameter("packageName");
		System.err.println("packagename si " + packageName);
		System.err.println("mark -2");

		Vector vector = new Vector();
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			J2eeStory story = (J2eeStory) iter.next();
			File file = new File(this.getServlet().getServletContext().getRealPath(".") + "/jars/" + story.getName().toString() + ".jar");
			if(!file.exists()){ 
				file = new  File(this.getServlet().getServletContext().getRealPath(".") + "/jars/" + story.getName().toString() + "-core-1.0.jar");
			}
			System.err.println("mark -1");
			if(file.exists()){
				System.err.println("mark 0.5");

				JarFile jarFile = new JarFile(file);
				ClassLoader classLoader = new URLClassLoader(new URL[]{file.toURL()}, getClass().getClassLoader());
				Enumeration enumeration = jarFile.entries();
				java.util.Hashtable hashtable = new java.util.Hashtable();
				while (enumeration.hasMoreElements()) {
					JarEntry entry = (JarEntry) enumeration.nextElement();
					System.err.println("mark 0");
					if(isSuitablePojoClass(story, entry,packageName)){
						System.err.println("mark 2");

				        Class classl = classLoader.loadClass(entry.getName().replaceAll("\\.class","").replaceAll("/","."));
			        	hashtable.put("net."+story.getName() + ".model." + classl.getSimpleName().replaceAll("Impl",""),"aiueo");
					}
				}
				enumeration = jarFile.entries();
				while (enumeration.hasMoreElements()) {
					JarEntry entry = (JarEntry) enumeration.nextElement();
					System.err.println("mark 1");
					if(isSuitablePojoClass(story, entry, packageName)){
						System.err.println("mark 3");

				        Class classl = classLoader.loadClass(entry.getName().replaceAll("\\.class","").replaceAll("/","."));
				        Noun noun = new NounImpl();
				        Criteria criteria2 = session.createCriteria(Noun.class);
				        criteria2.add(Restrictions.eq("name", classl.getSimpleName().replaceAll("Impl","")));
				        criteria2.add(Restrictions.eq("j2eeStory", story));
				        if(criteria2.list().size() >0){
				        	noun = (Noun)criteria2.uniqueResult();
				        }else{
				        	noun.setName(classl.getSimpleName().replaceAll("Impl",""));
				        	noun.setValid(true);
				        	noun.setJ2eeStory(story);
				        	noun.setJapanese("");
				        	Transaction transaction = session.beginTransaction();
				        	session.save(noun);
				        	transaction.commit();
				        	session.flush();
				        }
						for (int i = 0; i < classl.getMethods().length; i++) {
							System.err.println("1." + classl.getMethods()[i].getName() + "is challenged....");
							if(classl.getMethods()[i].getParameterTypes().length == 1 && 
									(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.String") 
											|| classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.util.Date")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.Boolean")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.Integer")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().contains("int")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.Float")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().contains("float")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().contains("double")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().contains("Double")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().contains("boolean")
											|| classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.util.Collection")
											|| hashtable.get(classl.getMethods()[i].getParameterTypes()[0].getName())!=null
									) 
									&& classl.getMethods()[i].getName().startsWith("set")){
								try { 
					        		String simplename =classl.getMethods()[i].getName().substring(3);
					        		simplename = simplename.substring(0,1).toLowerCase() + simplename.substring(1);
					        		simplename = simplename.substring(0,1).toLowerCase() + simplename.substring(1);
					        		System.err.println("2. simple name is " + simplename + " of the class " + noun.getName());
						        	Criteria criteria3 = session.createCriteria(Attr.class);
						        	criteria3.add(Restrictions.eq("name",simplename));
						        	criteria3.add(Restrictions.eq("noun",noun));
						        	if(criteria3.list().size() == 0){
						        		System.err.println("3. and he is about to be saved");
						        		Attr attr = new AttrImpl();
						        		attr.setName(simplename);
						        		attr.setNoun(noun);
							        	if(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.String")){
							        		attr.setClasstype("String");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.util.Date")){
							        		attr.setClasstype("Date");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().contains("boolean")){
							        		attr.setClasstype("boolean");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.Boolean")){
							        		attr.setClasstype("Boolean");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.Integer")){
							        		attr.setClasstype("Integer");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().contains("int")){
							        		attr.setClasstype("int");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().contains("float")){
							        		attr.setClasstype("float");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.Float")){
							        		attr.setClasstype("Float");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().contains("double")){
							        		attr.setClasstype("double");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.Double")){
							        		attr.setClasstype("Double");
							        	}else if(classl.getMethods()[i].getParameterTypes()[0].getName().equals("java.util.Collection")){
							        		attr.setClasstype("Collection");
							        	}else{
							        		attr.setClasstype("noun");
							        	}
							        	attr.setJapanese("");
						        		Transaction transaction = session.beginTransaction();
						        		session.save(attr);
						        		transaction.commit();
						        		session.flush();
						        		System.err.println("4. and saved...");
						        	}
								} catch (Exception e) {
									e.printStackTrace();
								}
							}
						}

					}
				}
				
//				Enumeration enumeration2 = jarFile.getManifest().getEntries().values();
				
//				JarInputStream jis = new JarInputStream( new BufferedInputStream( new FileInputStream( file.getAbsolutePath() ) ) );
//				JarEntry je;
//		        while( ( je = jis.getNextJarEntry() ) != null ) {
//		            System.out.println( je.getName() );
//		            if( je.getName().equals( readentry ) ) {
//		                int len;
//		                int bufsize = 1024;
//		                byte[] buf = new byte[bufsize];
//		                ByteArrayOutputStream baos = new ByteArrayOutputStream();
//
//		                while( jis.available() > 0 && ( len = jis.read( buf, 0, bufsize ) ) != -1 ) {
//		                    baos.write( buf, 0, len );
//		                }
////		                System.out.println( baos.toString() );
//		            }
//		        }

			}
		}
		req.setAttribute("storys",vector);
		session.flush();
		
		
		return mapping.findForward("success");
	}

	private boolean isSuitablePojoClass(J2eeStory story, JarEntry entry,String packageName) {
		if(StringUtils.isNotEmpty(packageName) && entry.getName().endsWith(".class")){
			return true;
			
		}else{
			return entry.getName().startsWith("net/"+story.getName() + "/model/") 
					&& entry.getName().endsWith("Impl.class")
					&& !entry.getName().endsWith("DaoImpl.class");
			
		}
	}
	
	
}
