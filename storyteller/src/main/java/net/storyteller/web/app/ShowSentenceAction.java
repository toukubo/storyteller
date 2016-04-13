package net.storyteller.web.app;

import static net.storyteller.web.util.HttpUtil.isAcceptJSON;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;

import net.enclosing.util.HibernateSession;
import net.storyteller.desktop.CopyProperties;
import net.storyteller.model.Attr;
import net.storyteller.model.AttrUse;
import net.storyteller.model.Noun;
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;
import net.storyteller.model.SentenceImpl;
import net.storyteller.model.ValidationRule;
import net.storyteller.model.crud.AttrValueObject;
import net.storyteller.web.util.JSONResponseUtil;


public class ShowSentenceAction extends Action{
	public ActionForward execute(
			ActionMapping mapping,
			ActionForm form,
			HttpServletRequest req,
			HttpServletResponse res) throws Exception{
		
		Session session = new HibernateSession().currentSession(this
				.getServlet().getServletContext());


		Sentence sentence = new SentenceImpl();
		Criteria criteria = session.createCriteria(Sentence.class);

		if (req.getParameter("id") != null
				&& !req.getParameter("id").equals("")) {
			criteria.add(Restrictions.idEq(Integer.valueOf(req
					.getParameter("id"))));
			sentence = (Sentence) criteria.uniqueResult();

		} else if (req.getAttribute("id") != null
				&& !req.getAttribute("id").equals("")) {
			criteria.add(Restrictions.idEq(req.getAttribute("id")));
			sentence = (Sentence) criteria.uniqueResult();
		}

		
//		List nouns = criteriaNoun.list();
//		req.setAttribute("Nouns", nouns);
		
		if ( isAcceptJSON(req)) {
//			writeResponseAsJSON(res,"hogehoge");
//			System.err.println(sentence.getName());
			NounUse nounUse = (NounUse)sentence.getFirstobjective().getOfuse().iterator().next();
			Noun noun = nounUse.getNoun();
			StringBuilder builder = new StringBuilder();
			builder.append("{");
			builder.append("\"name\":\""+ noun.getName() +"\",");
			builder.append("\"attrs\":[");
			List<Attr> attrs = new ArrayList<Attr>();
			
			if(nounUse.getAttrUses().size()>0){
				Iterator it = nounUse.getAttrUses().iterator();
				while (it.hasNext()) {
					AttrUse attrUse = (AttrUse)it.next();
					Attr attr = attrUse.getAttr();
//					AttrValueObject value = new AttrValueObject();
//					new CopyProperties(attr,value);
					attrs.add(attr);
				}
			}else{
				attrs.addAll(noun.getAttrs());
			}
			Iterator iterator = attrs.iterator();
			while (iterator.hasNext()) {
				Attr attr = (Attr) iterator.next();
				System.err.println(attr.getName());
				builder.append("{");
				builder.append("\"name\":\""+attr.getName()+"\",");
				builder.append("\"type\":\""+attr.getClasstype()+"\"");

				System.err.println("-------------------------------------------------------------------");
				builder.append("}");
				builder.append(",");
			}
			int index = builder.lastIndexOf(",");
			builder.deleteCharAt(index);
//			noun.setAttrs(attrs);
			builder.append("]");
			builder.append("}");
			builder.append("\r\n");
			res.setContentType(JSONResponseUtil.APPLICATION_JSON);
			res.setStatus(HttpServletResponse.SC_OK);
			res.getWriter().print(builder.toString());
			res.flushBuffer();
			return null;			
		}
		
		
		req.setAttribute("sentence",sentence);
		
		 
		Criteria criteria2 = session.createCriteria(ValidationRule.class);
		req.setAttribute("ValidationRules", criteria2.list());
		return mapping.findForward("success");
	}
	
	
}