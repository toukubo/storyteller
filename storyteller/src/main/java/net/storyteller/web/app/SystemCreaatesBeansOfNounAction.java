package net.storyteller.web.app;

import java.io.File;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Vector;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.enclosing.util.HibernateSession;
import net.storyteller.model.Attr;
import net.storyteller.model.J2eeStory;
import net.storyteller.model.Noun;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;

public class SystemCreaatesBeansOfNounAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext(),200);
		Criteria criteria = session.createCriteria(J2eeStory.class);
		Vector vector = new Vector();
		for (Iterator iter = criteria.list().iterator(); iter.hasNext();) {
			J2eeStory j2eeStory = (J2eeStory) iter.next();
			for (Iterator iterator = j2eeStory.getNouns().iterator(); iterator.hasNext();) {
				Noun noun = (Noun) iterator.next();
				File dir = new File(this.getServlet().getServletContext().getRealPath("output/" +j2eeStory.getName() + "/"+j2eeStory.getName().replaceAll(".","/") + "beans/"));
				if(!dir.exists()){
					dir.mkdirs();
//					dir.createNewFile();
				}
				String filename = noun.getName() + "Form.java";
				
				StringBuilder builder = new StringBuilder();
				builder.append("package ");
				builder.append("net."+j2eeStory.getName()+".beans;\r\n");
				
				builder.append("import org.apache.struts.upload.FormFile;\r\n");
				builder.append("import java.util.Date;\r\n");
				builder.append("import org.apache.commons.lang.StringUtils;\r\n");
				
				builder.append("public class "+noun.getName()+"Form\r\n"
						+"    extends org.apache.struts.validator.ValidatorForm\r\n"
						+"    implements java.io.Serializable\r\n"
						+"{\r\n");
				builder.append("private static final java.text.DateFormat format = new java.text.SimpleDateFormat(\"yyyy/MM/dd\");");
				builder.append("static { format.setLenient(true); }");
				
				for (Iterator iterator2 = noun.getAttrs().iterator(); iterator2.hasNext();) {
					Attr attr = (Attr) iterator2.next();
					if(!attr.getClasstype().equalsIgnoreCase("Collection")){

						builder.append("private ");
						String classtype = "";
						if(attr.getClasstype().equals("noun")){
							classtype = "Integer";
						}else{
							classtype = attr.getClasstype();
						}
						builder.append(classtype);
						builder.append(" ");
						builder.append(attr.getName());
						builder.append(";\r\n");
						
						//setter
						builder.append("public void set" + attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1) + "(");
						builder.append(classtype + " " +attr.getName() +"){\r\n");
						builder.append("this." + attr.getName() + " = " + attr.getName() + ";\r\n");
						builder.append("}\r\n");
						
						//getter
						if(attr.getClasstype().equals("boolean")){
							builder.append("public " + classtype + " is" + attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1)+ "(){\r\n");
						}else{
							builder.append("public " + classtype + " get" + attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1)+ "(){\r\n");
						}
						builder.append("return this." + attr.getName() + ";\r\n");
						builder.append("}\r\n");
						
						if(classtype.equals("Date")){
							builder.append("private boolean "+ attr.getName()+"IsValid = false;\r\n");
							//setter
							builder.append("public void set" + attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1) + "IsValid(");
							builder.append("boolean " +attr.getName() +"IsValid){\r\n");
							builder.append("this." + attr.getName() + "IsValid = " + attr.getName() + "IsValid;\r\n");
							builder.append("}\r\n");
							//getter
							builder.append("public boolean is" + attr.getName().substring(0,1).toUpperCase() + attr.getName().substring(1)+ "IsValid(){\r\n");
							builder.append("return this." + attr.getName() + "IsValid;\r\n");
							builder.append("}\r\n");
							
							builder.append("private java.lang.String "+attr.getName()+"AsRawString =\"\";\r\n");
							builder.append("public java.lang.String get"+attr.getName().substring(0,1).toUpperCase()+attr.getName().substring(1)+"AsString(){\r\n");
							builder.append("    return ("+attr.getName() +"== null) ? null : format.format("+attr.getName() + ");\r\n");
							builder.append("}\r\n");
							builder.append("public void set"+attr.getName().substring(0,1).toUpperCase()+attr.getName().substring(1) + "AsString(java.lang.String "+attr.getName() + "){\r\n");
							builder.append("	this."+attr.getName()+"IsValid = true;\r\n");
							builder.append("	this."+attr.getName()+"AsRawString = "+attr.getName()+";\r\n");
							builder.append("try{\r\n");
							builder.append("		if(StringUtils.isNotBlank("+attr.getName()+")){ format.parse("+attr.getName()+");}\r\n");
							builder.append("}catch (java.text.ParseException pe){\r\n");
							builder.append("this."+attr.getName()+"IsValid = false;\r\n");
							builder.append("}\r\n");
							builder.append("	if("+attr.getName()+"IsValid){\r\n");
							builder.append("		try {\r\n");
							builder.append("			this."+attr.getName()+" = (org.apache.commons.lang.StringUtils.isBlank("+attr.getName()+")) ? null : format.parse("+attr.getName()+");\r\n");
							builder.append("		} catch (Exception e) {\r\n");
							builder.append("			e.printStackTrace();\r\n");
							builder.append("		}\r\n");
							builder.append("	}\r\n");
							builder.append("}\r\n");
							builder.append("public void set"+attr.getName().substring(0,1).toUpperCase()+attr.getName().substring(1)+"AsRawString(java.lang.String "+attr.getName() + "){\r\n");
							builder.append("	this."+attr.getName()+"AsRawString = "+attr.getName()+";\r\n");
							builder.append("}\r\n\r\n");
							builder.append("public String get" +attr.getName().substring(0,1).toUpperCase()+attr.getName().substring(1)+"AsRawString(){\r\n" );
							builder.append("return this."+ attr.getName() + "AsRawString;\r\n");
							builder.append("}\r\n");
						}
						
					}
				}
				
				// for FormFile 
				builder.append("FormFile formFile = null;\r\n");
				builder.append("public void setFormFile(FormFile formFile){\r\n");
				builder.append("this.formFile = formFile;\r\n");
				builder.append("}\r\n");
				
				builder.append("public FormFile getFormFile(){\r\n");
				builder.append("return this.formFile;\r\n");
				builder.append("}\r\n");
				
				
				builder.append("public void reset(org.apache.struts.action.ActionMapping mapping, javax.servlet.http.HttpServletRequest request){");
				for (Iterator iterator3 = noun.getAttrs().iterator(); iterator3.hasNext();) {
					Attr attr = (Attr) iterator3.next();
					if(attr.getClasstype().equals("boolean")){
						builder.append("	" + attr.getName() + " =false;\r\n");
					}
				}
				
				builder.append("}\r\n");
				builder.append("}\r\n");
				
				
				
				File file = new File(dir.getAbsolutePath() + "/" + filename);
				file.getParentFile().mkdirs();
				
				PrintWriter writer = new PrintWriter(file);
				writer.write(builder.toString());
				writer.flush();
				writer.close();
				
			}
		}
//		req.setAttribute("j2eeStorys",vector);
		session.flush();
		
		
		
		return mapping.findForward("success");
	}
	
	
}
