package net.storyteller.web.app;

import net.storyteller.model.*;
import org.apache.commons.lang.StringUtils;

import java.util.Iterator;


public class DefaultInterpreter implements Interpreter {

	public String interpret(Sentence sentence, String templatename) {
		StringBuilder builder = new StringBuilder();
		NounUse nounUse = (NounUse) sentence.getFirstobjective().getOfuse()
				.iterator().next();
		Noun noun = this.getNoun(sentence);
		if (templatename.equals("modelclass")) {
			return nounUse.getNoun().getName();
		} else if (templatename.equals("modelobj")) {
			return getObjFromClass(noun.getName());
		} else if(templatename.equals("modelclassUp")){
			return getUpperCaseFromClass(noun.getName());
		} else if (templatename.equals("packagename")) {
			if (sentence.getVerb().getName().equals("ALL")) {
				return "net." + sentence.getJ2eeStory().getName() + ".web";
			} else {
				return getSpecialPackageName(sentence)!=null?getSpecialPackageName(sentence):"net." + sentence.getJ2eeStory().getName() + ".web.app";
			}
		} else if (templatename.equals("beanpackage")) {
			return "net." + sentence.getJ2eeStory().getName() + ".beans.*";
		} else if (templatename.equals("modelpackage")) {
			return "net." + sentence.getJ2eeStory().getName() + ".model.*";
		} else if (templatename.equals("modelcrudpackage")) {
			return "net." + sentence.getJ2eeStory().getName() + ".model.crud.*";
		} else if (templatename.equals("formcontent")) {
			// for (Iterator iter =
			// sentence.getFirstobjective().getOfuse().iterator();
			// iter.hasNext();) {
			// NounUse nounUse = (NounUse) iter.next();
			if (nounUse.getOforder() == 1) {
				if (nounUse.getAttrUses().size() == 0) {
					for (Iterator iterator = noun.getAttrs().iterator(); iterator
							.hasNext();) {
						Attr attr = (Attr) iterator.next();
						this.interpretform(attr, builder, nounUse, noun);
					}
				} else {
					for (Iterator iterator = nounUse.getAttrUses().iterator(); iterator
							.hasNext();) {
						AttrUse attrUse = (AttrUse) iterator.next();
						this.interpretform(attrUse.getAttr(), builder, nounUse,
								nounUse.getNoun());
					}
				}
			}
			// }
		} else if (templatename.equals("addingtoclass")) {
			return ((NounUse) sentence.getSecountobjective().getOfuse()
					.iterator().next()).getNoun().getName();
		} else if (templatename.equals("addingtoobj")) {
			return getObjFromClass(((NounUse) sentence.getSecountobjective().getOfuse()
					.iterator().next()).getNoun().getName());

		} else if (templatename.equals("displaycontent")) {
			if (nounUse.getOforder() == 1) {
				if (nounUse.getAttrUses().size() == 0) {
					for (Iterator iterator = noun.getAttrs().iterator(); iterator
							.hasNext();) {
						Attr attr = (Attr) iterator.next();
						this.interpretShowDisplayColumn(builder, attr, noun);
					}
				} else {
					for (Iterator iterator = nounUse.getAttrUses().iterator(); iterator
							.hasNext();) {
						AttrUse attrUse = (AttrUse) iterator.next();
						Attr attr = attrUse.getAttr();
						this.interpretShowDisplayColumn(builder, attr, noun);
					}
				}
			}
		} else if (templatename.equals("displayexportcontent")) {
			if (nounUse.getOforder() == 1) {
				if (nounUse.getAttrUses().size() == 0) {
					for (Iterator iterator = noun.getAttrs().iterator(); iterator
							.hasNext();) {
						Attr attr = (Attr) iterator.next();
						if (attr.getClasstype().equals("Date")) {
							builder
									.append("<display:column media=\"xml csv excel pdf\" property=\""
											+ attr.getName()
											+ "\" title=\""
											+ getJapaneseOrEnglish(attr) + "\"/>\r\n");
						} else {
							builder
									.append("<display:column media=\"xml csv excel pdf\" property=\""
											+ attr.getName()
											+ "\" title=\""
											+ getJapaneseOrEnglish(attr) + "\"/>\r\n");
						}
					}

				} else {
					for (Iterator iterator = nounUse.getAttrUses().iterator(); iterator
							.hasNext();) {
						AttrUse attrUse = (AttrUse) iterator.next();
						Attr attr = attrUse.getAttr();
						if (attr.getClasstype().equals("Date")) {
							builder
									.append("<display:column media=\"xml csv excel pdf\" property=\""
											+ attr.getName()
											+ "\" title=\""
											+ getJapaneseOrEnglish(attr) + "\"/>\r\n");

						} else {
							builder
									.append("<display:column media=\"xml csv excel pdf\" property=\""
											+ attr.getName()
											+ "\" title=\""
											+ attr.getName() + "\"/>\r\n");
						}
					}
				}
			}
		} else if (templatename.equals("relationvpsecoundcode")) {
			if (nounUse.getOforder() == 1) {
				if (nounUse.getAttrUses().size() != 0) {
					int ordernumofnounattr = 0;
					for (Iterator iterator = nounUse.getAttrUses().iterator(); iterator
							.hasNext();) {
						AttrUse attrUse = (AttrUse) iterator.next();

						if (attrUse.getAttr().getClasstype().equals("noun")) {
							ordernumofnounattr++;
							if (ordernumofnounattr > 1) {
								interpretvpcode(builder, attrUse.getAttr()
										.getName().substring(0, 1)
										.toUpperCase()
										+ attrUse.getAttr().getName()
												.substring(1), nounUse
										.getNoun(), false);
							} else {
								interpretvpcode(builder, attrUse.getAttr()
										.getName().substring(0, 1)
										.toUpperCase()
										+ attrUse.getAttr().getName()
												.substring(1), nounUse
										.getNoun(), true);

							}
						}
					}

				} else {
					int ordernumofnounattr = 0;
					for (Iterator iterator = noun.getAttrs().iterator(); iterator
							.hasNext();) {
						Attr attr = (Attr) iterator.next();
						if (attr.getClasstype().equals("noun")) {
							ordernumofnounattr++;
							if (ordernumofnounattr > 1) {
								interpretvpcode(builder, attr.getName()
										.substring(0, 1).toUpperCase()
										+ attr.getName().substring(1), noun,
										false);

							} else {
								interpretvpcode(builder, attr.getName()
										.substring(0, 1).toUpperCase()
										+ attr.getName().substring(1), noun,
										true);
							}

						}
					}
				}
			}
		} else if (templatename.equals("copyattrsatvp")) {

			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					this.interpretVpOfAtter(attr, builder, getObjFromClass(noun.getName()), noun.getName());
				}

			} else {
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter
						.hasNext();) {
					Attr attr = (Attr) iter.next();
					this.interpretVpOfAtter(attr, builder, getObjFromClass(noun.getName()), noun.getName());
				}
			}

		} else if (templatename.equals("relationvpcode")) {
					if (nounUse.getAttrUses().size() != 0) {
						for (Iterator iterator = nounUse.getAttrUses()
								.iterator(); iterator.hasNext();) {
							AttrUse attrUse = (AttrUse) iterator.next();
							if (attrUse.getAttr().getClasstype().equals("noun")) {
								interpretvpsecoundcode(builder, attrUse
										.getAttr().getName().substring(0, 1)
										+ attrUse.getAttr().getName()
												.substring(1), nounUse
										.getNoun());
							}
						}
					} else {
						for (Iterator iterator = nounUse.getNoun().getAttrs()
								.iterator(); iterator.hasNext();) {
							Attr attr = (Attr) iterator.next();
							if (attr.getClasstype().equals("noun")) {
								interpretvpsecoundcode(builder, attr.getName()
										.substring(0, 1)
										+ attr.getName().substring(1), nounUse
										.getNoun());
							}
						}

					}
//		} else if (templatename.equals("attr")) {
//
//		} else if (templatename.equals("Attr")) {

		} else if (templatename.equals("critlist")) {
			// builder.append("")

		} else if (templatename.equals("displayxmlcontent")) {
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					builder.append("<" + attrUse.getAttr().getName()
							+ ">${"+ getObjFromClass(noun.getName())+"." + attrUse.getAttr().getName() + "}</"
							+ attrUse.getAttr().getName() + ">");
					builder.append("\r\n");
				}
			} else {
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter
						.hasNext();) {
					Attr attr = (Attr) iter.next();
					builder.append("<" + attr.getName() + ">${"
							+ getObjFromClass(noun.getName()) + "."
							+ attr.getName() + "}</" + attr.getName() + ">");
					builder.append("\r\n");
				}

			}
		} else if (templatename.equals("japanese")) {
			builder.append(noun.getJapanese());
		} else if (templatename.equals("showattrs")
				|| templatename.equals("listcontent")) {

			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					interpretShowAttrJSP(builder, attr, noun, sentence
							.getName()
							+ ".do");
				}
			} else {
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter
						.hasNext();) {
					Attr attr = (Attr) iter.next();
					interpretShowAttrJSP(builder, attr, noun, sentence
							.getName()
							+ ".do");
				}

			}

		} else if (templatename.equals("relatedlistsjsp")) {

			builder.append("");

		} else if (templatename.equalsIgnoreCase("relatedpreperation")) {
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					if (attr.getClasstype().equalsIgnoreCase("noun")) {
						interprefCritlist(builder, attr.getName(), noun);
					}
				}
			} else {
				for (Iterator iter = noun.getAttrs().iterator(); iter.hasNext();) {
					Attr attr = (Attr) iter.next();
					if (attr.getClasstype().equalsIgnoreCase("noun")) {
						interprefCritlist(builder, attr.getName(), noun);
					}
				}
			}
		}else if (templatename.equalsIgnoreCase("attrsforpdf")) {
			int y = 350;
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					y = interpretShowAttrForPDF(builder, attr, noun, sentence.getName()+ ".do",y);
				}
			} else {
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter.hasNext();) {
					Attr attr = (Attr) iter.next();
					y = interpretShowAttrForPDF(builder, attr, noun, sentence.getName()+ ".do",y);
				}
			}
		}else if(templatename.equalsIgnoreCase("ajaxrequest")){
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					interpretAjaxRequest(builder, attr, noun);
				}
			}else{
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter.hasNext();) {
					Attr attr = (Attr) iter.next();
					interpretAjaxRequest(builder, attr, noun);
				}
					
			}
		}else if(templatename.equalsIgnoreCase("ajaxdisplaycontent")){
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					interpretAjaxDisplayContent(builder, attr, noun);
				}
			}else{
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter.hasNext();) {
					Attr attr = (Attr) iter.next();
					interpretAjaxDisplayContent(builder, attr, noun);
				}
			}
		}else if(templatename.equalsIgnoreCase("sentencename")){
			builder.append(sentence.getName());
		}else if(templatename.equalsIgnoreCase("xlslisttitles")){
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					interpretXlslisttitles(builder, attr, noun);
				}
			}else{
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter.hasNext();) {
					Attr attr = (Attr) iter.next();
					interpretXlslisttitles(builder, attr, noun);
				}
			}
			
		}else if(templatename.equalsIgnoreCase("xlslistattr")){
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
						.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					interpretXlslistattr(builder, attr, noun);
				}
			}else{
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter.hasNext();) {
					Attr attr = (Attr) iter.next();
					interpretXlslistattr(builder, attr, noun);
				}
			}
			
		}else if(templatename.equalsIgnoreCase("csvtitles")){
		if (nounUse.getAttrUses().size() > 0) {
			for (Iterator iter = nounUse.getAttrUses().iterator(); iter
					.hasNext();) {
				AttrUse attrUse = (AttrUse) iter.next();
				Attr attr = attrUse.getAttr();
				interpretCsvtitles(builder, attr, noun);
			}
		}else{
			for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter.hasNext();) {
				Attr attr = (Attr) iter.next();
				interpretCsvtitles(builder, attr, noun);
			}
		}
		
		}else if(templatename.equalsIgnoreCase("csvattr")){
			if (nounUse.getAttrUses().size() > 0) {
				for (Iterator iter = nounUse.getAttrUses().iterator(); iter
				.hasNext();) {
					AttrUse attrUse = (AttrUse) iter.next();
					Attr attr = attrUse.getAttr();
					interpretCsvattr(builder, attr, noun);
				}
			}else{
				for (Iterator iter = nounUse.getNoun().getAttrs().iterator(); iter.hasNext();) {
					Attr attr = (Attr) iter.next();
					interpretCsvattr(builder, attr, noun);
				}
			}

		}
		else if(templatename.equalsIgnoreCase("nameofj2eestory")){
			builder.append(sentence.getJ2eeStory().getName());
		}else if(templatename.equalsIgnoreCase("nameofsentence")){
			builder.append(sentence.getName());
		} else if(templatename.equals("attributes")){
			for (Iterator iterator = noun.getAttrs().iterator(); iterator
					.hasNext(); ) {
				Attr attr = (Attr) iterator.next();
				this.interpretLocalFields(attr, builder);
			}
		} else if(templatename.equals("attributes->")){
			for (Iterator iterator = noun.getAttrs().iterator(); iterator
					.hasNext();) {
				Attr attr = (Attr) iterator.next();
				this.interpretPostfix(attr, builder, getObjFromClass(noun.getName()));
			}
		} else if(templatename.equals("attributeslookup")){
			for (Iterator iterator = noun.getAttrs().iterator(); iterator
					.hasNext();) {
				Attr attr = (Attr) iterator.next();
				this.interpretLookUp(attr, builder, getObjFromClass(noun.getName()));
			}
		} else if(templatename.equals("attributesjsonnew")){
			for (Iterator iterator = noun.getAttrs().iterator(); iterator
					.hasNext();) {
				Attr attr = (Attr) iterator.next();
				this.interpretJsonNew(attr, builder, getObjFromClass(noun.getName()));
			}
		} else if(templatename.equals("attributesjsonadd")){
			for (Iterator iterator = noun.getAttrs().iterator(); iterator
					.hasNext();) {
				Attr attr = (Attr) iterator.next();
				this.interpretJsonAdd(attr, builder, getObjFromClass(noun.getName()));
			}
		} else if(templatename.equals("attributesfprintf")) {
			for (Iterator iterator = noun.getAttrs().iterator(); iterator
					.hasNext();) {
				Attr attr = (Attr) iterator.next();
				this.interpretfprintF(attr, builder, getObjFromClass(noun.getName()));
			}
		}
		return builder.toString();
	}
	
	private String getSpecialPackageName(Sentence sentence) {
		if(sentence.getJ2eeStory().getName().equals("nodepad")){
			return "com.theuniversalgraph";
		}
		return null;
	}

	private void interpretXlslistattr(StringBuilder builder, Attr attr,Noun noun){
		if (attr.getClasstype().equalsIgnoreCase("Collection")) {
//			y = this.interpretToCollectionForPDF(builder, attr, noun, requestURI,y);
		} else if (attr.getClasstype().equalsIgnoreCase("date")) {
			builder.append("        sheet.addCell(");
			builder.append("new DateTime(x++,y," + getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "()));" + "\r\n");
		} else if(attr.getClasstype().equalsIgnoreCase("String")){
			builder.append("        sheet.addCell(");
			builder.append("new Label(x++,y," + getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "()));" + "\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("float") || attr.getClasstype().equalsIgnoreCase("int") || attr.getClasstype().equalsIgnoreCase("double") ){
			builder.append("        sheet.addCell(");
			builder.append("new Number(x++,y," + getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "()));" + "\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("Integer")){
			builder.append("        sheet.addCell(");
			builder.append("new Label(x++,y," + getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "().toString()));" + "\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("noun")){
			builder.append("        sheet.addCell(");
			builder.append("new Label(x++,y," + getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "().getName()));" + "\r\n");
		}
		builder.append("\r\n");
	}
	private void interpretCsvtitles(StringBuilder builder, Attr attr,Noun noun){
		builder.append("        			rows[y][x] = \""+ getJapaneseOrEnglish(attr) + "\";\r\n");
		builder.append("x++;\r\n");
		
	}
	private void interpretCsvattr(StringBuilder builder, Attr attr,Noun noun){
		if (attr.getClasstype().equalsIgnoreCase("Collection")) {
//			y = this.interpretToCollectionForPDF(builder, attr, noun, requestURI,y);
		} else if (attr.getClasstype().equalsIgnoreCase("date")) {
			builder.append("        rows[y][x] = ");
			builder.append("dateFormat.format(" + getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "());" + "\r\n");
			builder.append("x++;\r\n");
		} else if(attr.getClasstype().equalsIgnoreCase("String")){
			builder.append("        rows[y][x] = ");
			builder.append(getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "();" + "\r\n");
			builder.append("x++;\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("float") || attr.getClasstype().equalsIgnoreCase("int") || attr.getClasstype().equalsIgnoreCase("double") ){
			builder.append("        rows[y][x] = ");
			builder.append("String.valueOf(" + getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "());" + "\r\n");
			builder.append("x++;\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("Integer")){
			builder.append("        rows[y][x] = ");
			builder.append(getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "().toString();" + "\r\n");
			builder.append("x++;\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("noun")){
			builder.append("        rows[y][x] = ");
			builder.append(getObjFromClass(noun.getName())+ ".get"
					+ StringUtils.capitalize(attr.getName()) + "().getName();" + "\r\n");
			builder.append("x++;\r\n");
		}
		builder.append("\r\n");
	}
	private void interpretXlslisttitles(StringBuilder builder, Attr attr,Noun noun){
		builder.append("        sheet.addCell(new Label(x++, 0, \""+ getJapaneseOrEnglish(attr) + "\"));");
		builder.append("\r\n");
	}
	
	private void interpretAjaxRequest(StringBuilder builder, Attr attr,Noun noun){
		if(!attr.getName().equalsIgnoreCase("id")){
			builder.append("		 		 ajaxRequest.addFormElementsById(num + '_"+ attr.getName()+"');\r\n");
		}
	}

	private void interprefCritlist(StringBuilder builder, String attrname,
			Noun noun) {
		Noun relatedNoun = this.getNounFromNounAttr(attrname, noun);
		if(relatedNoun!=null){
			builder.append("Criteria criteria" + relatedNoun.getName()
					+ "= session.createCriteria(" + relatedNoun.getName()
					+ ".class);\r\n");
			builder.append("			req.setAttribute(\"" + relatedNoun.getName()
					+ "s\", criteria" + relatedNoun.getName() + ".list());\r\n");
			builder.append("\r\n");
			
		}
	}

	private void interpretform(Attr attr, StringBuilder builder,
			NounUse nounUse, Noun noun) {

		if (!attr.getName().equals("id")
				&& !attr.getClasstype().equalsIgnoreCase("Collection")) {
			if (attr.getClasstype().equals("noun")) {

				builder.append("                                " + getJapaneseOrEnglish(attr));
				builder.append("<br />");
				builder.append("\r\n");
				builder.append("                                <c:choose>");
				builder.append("\r\n");
				builder.append("                                    <c:when test=\"${empty "
								+ StringUtils.capitalize(attr.getName())
								+ "s}\">");
				builder.append("\r\n");
				builder.append("                                         <select name=\""+ attr.getName() + "\" disabled=\"disabled\"/>");
				builder.append("\r\n");
				builder.append("                                    </c:when>");
				builder.append("\r\n");
				builder.append("                                    <c:otherwise>");
				builder.append("\r\n");
				builder.append("                                        <select name=\""+ attr.getName() + "\" >");
				builder.append("<option value=\"\"></option>");
				builder.append("\r\n");

				builder.append("                                            <c:forEach var=\"valueLabel\" items=\"${");
				builder.append(StringUtils.capitalize(attr.getName()));
				builder.append("s}\">");
				builder.append("\r\n");
				builder.append("                                                <c:choose>");
				builder.append("\r\n");
				builder.append("                                                    <c:when test=\"${valueLabel.id eq ");
				builder.append("model." + attr.getName() + ".id}\">");
				// builder.append(noun.getName() + "." + attr.getName() +
				// ".id}\">");
				builder.append("\r\n");
				builder.append("                                                        <option value=\"${valueLabel.id}\" selected=\"selected\">${valueLabel.name}</option>");
				builder.append("\r\n");
				builder.append("                                                    </c:when>");
				builder.append("\r\n");
				builder.append("                                                    <c:otherwise>");
				builder.append("\r\n");
				builder.append("                                                        <option value=\"${valueLabel.id}\">${valueLabel.name}</option>");
				builder.append("\r\n");
				builder.append("                                                    </c:otherwise>");
				builder.append("\r\n");
				builder.append("                                                </c:choose>");
				builder.append("\r\n");
				builder.append("                                            </c:forEach>");
				builder.append("\r\n");
				builder.append("                                        </select>");
				builder.append("\r\n");
				builder.append("                                    </c:otherwise>");
				builder.append("\r\n");
				builder.append("                                </c:choose>");
				builder.append("<br />\r\n");
				builder.append("\r\n");
				builder.append("\r\n");
			} else if (attr.getClasstype().equals("Date")) {
				builder.append(getJapaneseOrEnglish(attr));
				builder.append("<br />");
				builder.append("\r\n");
				builder.append("<input type=\"text\" name=\"");
				builder.append(attr.getName());
				builder.append("AsString");
				builder.append("\" value=\"<bean:write name=\"form");
				// builder.append(nounUse.getNoun().getName().toLowerCase());
				builder.append("\" property=\"");
				builder.append(attr.getName());
				builder.append("\" format=\"yyyy/MM/dd\" />");
				builder.append("\" />");
				builder.append("<br />");
				builder.append("\r\n");
			} else {
				builder.append(getJapaneseOrEnglish(attr));
				builder.append("<br />");
				builder.append("\r\n");
				if (attr.getClasstype().equals("boolean")
						|| attr.getClasstype().equals("Boolean")) {
					builder.append("<html:checkbox name=\"");
				} else {
					builder.append("<html:text name=\"");
				}
				// builder.append(nounUse.getNoun().getName().toLowerCase());
				builder.append("form");

				builder.append("\" property=\"");
				builder.append(attr.getName());
				builder.append("\" />");
				builder.append("<br />");
				builder.append("\r\n");
				builder.append("\r\n");
			}

		}

	}
	
	private int interpretToCollectionForPDF(StringBuilder builder, Attr attr,
			Noun noun, String requestURI,int y) {
		if (attr.getClasstype().equalsIgnoreCase("Collection")) {
			interprefCritlist(builder, attr.getName(), noun);
			Noun relatedNoun = this.getNounFromNounAttr(attr.getName()
					.substring(0, attr.getName().length() - 1), noun);
			builder.append("for (Iterator iter = criteria"+ relatedNoun.getName() +".list().iterator(); iter.hasNext();) {\r\n");
			builder.append(relatedNoun.getName() + " " + getObjFromClass(relatedNoun.getName()) + " = (" + relatedNoun.getName() + ") iter.next();\r\n");
			for (Iterator iter = relatedNoun.getAttrs().iterator(); iter
					.hasNext();) {
				Attr attr2 = (Attr) iter.next();
				y += 15;
				this.interpretShowAttrForPDF(builder, attr2, relatedNoun,requestURI,y);
			}
			builder.append("<br />\r\n");
			builder.append("    </logic:iterate>\r\n</div>");
		} else if (attr.getClasstype().equalsIgnoreCase("noun")) {

		}
		return y;
	}
	
	private int interpretShowAttrForPDF(StringBuilder builder, Attr attr,
			Noun noun, String requestURI,int y) {
		builder.append("cb.showTextAligned(PdfContentByte.ALIGN_LEFT, \""+getJapaneseOrEnglish(attr) +"\",this.xoffset + 103,this.max - (this.yoffset + " + y +"),0);" + "\r\n");
		if (attr.getClasstype().equalsIgnoreCase("Collection")) {
//			y = this.interpretToCollectionForPDF(builder, attr, noun, requestURI,y);
		} else if (attr.getClasstype().equalsIgnoreCase("date")) {
			builder.append("cb.showTextAligned(PdfContentByte.ALIGN_LEFT, dateFormat.format(" + noun.getName().toLowerCase() + ".get"
					+ StringUtils.capitalize(attr.getName()) + "()),this.xoffset + block,this.max - (this.yoffset + " + y +"),0);" + "\r\n");
		} else if(attr.getClasstype().equalsIgnoreCase("String")){
			builder.append("cb.showTextAligned(PdfContentByte.ALIGN_LEFT, " + noun.getName().toLowerCase() + ".get"
					+ StringUtils.capitalize(attr.getName()) + "(),this.xoffset + 103,this.max - (this.yoffset + " + y +"),0);" + "\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("float")){
			builder.append("cb.showTextAligned(PdfContentByte.ALIGN_LEFT, new Float(" + noun.getName().toLowerCase() + ".get"
					+ StringUtils.capitalize(attr.getName()) + "()).toString(),this.xoffset + 103,this.max - (this.yoffset + " + y +"),0);" + "\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("int")){
			builder.append("cb.showTextAligned(PdfContentByte.ALIGN_LEFT, new Integer(" + noun.getName().toLowerCase() + ".get"
					+ StringUtils.capitalize(attr.getName()) + "()).toString(),this.xoffset + 103,this.max - (this.yoffset + " + y +"),0);" + "\r\n");
		}else if(attr.getClasstype().equalsIgnoreCase("Integer")){
			builder.append("cb.showTextAligned(PdfContentByte.ALIGN_LEFT, " + noun.getName().toLowerCase() + ".get"
					+ StringUtils.capitalize(attr.getName()) + "().toString(),this.xoffset + 103,this.max - (this.yoffset + " + y +"),0);" + "\r\n");
		}
		
		y += 15;
		builder.append("\r\n");
		return y;
	}

	private void interpretShowAttrJSP(StringBuilder builder, Attr attr,
			Noun noun, String requestURI) {
		builder.append(getJapaneseOrEnglish(attr) + "\r\n");
		if (attr.getClasstype().equalsIgnoreCase("Collection")) {
//			this.interpretToCollectionJSP(builder, attr, noun, requestURI);
//			this.interpretToCollectionJSPDisplay(builder, attr, noun,
//					requestURI);
		} else if (attr.getClasstype().equalsIgnoreCase("date")) {
			builder.append("<bean:write name=\"" + noun.getName().toLowerCase()
					+ "\" property=\"");
			builder.append(attr.getName());
			builder.append("\" format=\"yyyy/MM/dd\" />\r\n");
		} else {
			builder.append("${" + noun.getName().toLowerCase() + "."
					+ attr.getName() + "}\r\n");
		}

		builder.append("<br/>\r\n");
	}
	
	private void interpretAjaxDisplayContent(StringBuilder builder, Attr attr,Noun noun) {
		if(!attr.getName().equalsIgnoreCase("id") && !attr.getClasstype().equalsIgnoreCase("Collection")){
			builder.append(" <display:column media=\"html\" sortable=\"true\"");
			if (attr.getClasstype().equals("Date")) {
				builder.append(" title=\"" + getJapaneseOrEnglish(attr)
						+ "\">");
				builder.append("<nobr><input size=\"8\" type=\"text\" name=\""+ attr.getName()+"AsString\" id=\"${row.id}_"+attr.getName()+"\" value=\"<st:date date=\"${row.basedeadline}\"></st:date>\" /></nobr>");

				
			} else if (attr.getClasstype().equalsIgnoreCase("Noun")) {
				Noun relatedNoun = this.getNounFromNounAttr(attr.getName(), noun);
				if (relatedNoun != null) {
					builder.append(" title=\"" + getJapaneseOrEnglish(attr) + "\">\r\n");
					
					builder.append("                                <c:choose>");
					builder.append("\r\n");
					builder.append("                                    <c:when test=\"${empty "
									+ StringUtils.capitalize(attr.getName())
									+ "s}\">");
					builder.append("\r\n");
					builder.append("                                         <select name=\""+ attr.getName() + "\" disabled=\"disabled\"/>");
					builder.append("\r\n");
					builder.append("                                    </c:when>");
					builder.append("\r\n");
					builder.append("                                    <c:otherwise>");
					builder.append("\r\n");
					builder.append("<select name=\""+attr.getName()+"\" id=\"${row.id}_"+attr.getName()+"\">");
					builder.append("<option value=\"\"></option>");
					builder.append("\r\n");

					builder.append("                                            <c:forEach var=\"valueLabel\" items=\"${");
					builder.append(StringUtils.capitalize(attr.getName()));
					builder.append("s}\">");
					builder.append("\r\n");
					builder.append("                                                <c:choose>");
					builder.append("\r\n");
					builder.append("                                                    <c:when test=\"${valueLabel.id eq ");
					builder.append("row." + attr.getName() + ".id}\">");
					// builder.append(noun.getName() + "." + attr.getName() +
					// ".id}\">");
					builder.append("\r\n");
					builder.append("                                                        <option value=\"${valueLabel.id}\" selected=\"selected\">${valueLabel.name}</option>");
					builder.append("\r\n");
					builder.append("                                                    </c:when>");
					builder.append("\r\n");
					builder.append("                                                    <c:otherwise>");
					builder.append("\r\n");
					builder.append("                                                        <option value=\"${valueLabel.id}\">${valueLabel.name}</option>");
					builder.append("\r\n");
					builder.append("                                                    </c:otherwise>");
					builder.append("\r\n");
					builder.append("                                                </c:choose>");
					builder.append("\r\n");
					builder.append("                                            </c:forEach>");
					builder.append("\r\n");
					builder.append("                                        </select>");
					builder.append("\r\n");
					builder.append("                                    </c:otherwise>");
					builder.append("\r\n");
					builder.append("                                </c:choose>");
				} else {
					builder.append(" title=\"" + getJapaneseOrEnglish(attr)
							+ "\">\r\n<nobr>\r\n${row." + attr.getName()
							+ "}\r\n</nobr>");
				}

			}else if(attr.getClasstype().equalsIgnoreCase("Collection")){
			}else{
				builder.append(" title=\"" + getJapaneseOrEnglish(attr) + "\">\r\n");
				builder.append("<nobr><input size=\"8\" type=\"text\" name=\""+ attr.getName()+"\" id=\"${row.id}_"+attr.getName()+"\" value=\"${row."+attr.getName()+"}\" /></nobr>");
			}
			builder.append("\r\n</display:column>\r\n");
		}
	}

	private void interpretShowDisplayColumn(StringBuilder builder, Attr attr,
			Noun noun) {
		builder.append(" <display:column media=\"html\" sortable=\"true\"");
		if (attr.getClasstype().equals("Date")) {
			builder.append(" title=\"" + getJapaneseOrEnglish(attr)
					+ "\"><nobr>\r\n<bean:write name=\"row\" property=\""
					+ attr.getName() + "\" format=\"yyyy/MM/dd\" /> </nobr>");
		} else if (attr.getClasstype().equalsIgnoreCase("Noun")) {
			Noun relatedNoun = this.getNounFromNounAttr(attr.getName(), noun);
			for (Iterator iteratorNoun = noun.getJ2eeStory().getNouns()
					.iterator(); iteratorNoun.hasNext();) {
				Noun possibleRelatedNoun = (Noun) iteratorNoun.next();
				if (possibleRelatedNoun.getName().equalsIgnoreCase(
						attr.getName())) {
					relatedNoun = possibleRelatedNoun;
				}
			}

			if (relatedNoun != null) {
				String displayingtitle = "";
				for (Iterator iteraterAttrs = relatedNoun.getAttrs().iterator(); iteraterAttrs
						.hasNext();) {
					Attr possibleDisplayingAttr = (Attr) iteraterAttrs.next();
					if (possibleDisplayingAttr.getName().equals("name")
							|| possibleDisplayingAttr.getName().equals("title")
							|| possibleDisplayingAttr.getName().equals("type")
							|| possibleDisplayingAttr.getName().equals("tag")
							|| possibleDisplayingAttr.getName().equals(
									"content")) {
						displayingtitle = "." + possibleDisplayingAttr.getName();
					}else{
						displayingtitle = ".id";
					}
				}
				builder.append(" title=\"" + getJapaneseOrEnglish(attr)
						+ "\">\r\n<nobr>\r\n${row." + attr.getName() + displayingtitle + "}\r\n</nobr>");

			} else {
				builder.append(" title=\"" + getJapaneseOrEnglish(attr)
						+ "\">\r\n<nobr>\r\n${row." + attr.getName()
						+ "}\r\n</nobr>");
			}
		} else {
			if (attr.getName().equals("id")) {
				builder.append(" title=\"ID\" property=\"id\" >\r\n");

			} else {
				builder.append(" title=\"" + getJapaneseOrEnglish(attr)
						+ "\">\r\n<nobr>\r\n${row." + attr.getName()
						+ "}\r\n</nobr>");
			}
		}
		builder.append("\r\n</display:column>\r\n");

	}

	public  void interpretvpcode(StringBuilder builder,
			String secoundmodelname, Noun noun, boolean first) {
		if (first) {
			builder.append("		Criteria criteria2 = session.createCriteria("
					+ secoundmodelname + ".class);\r\n");
		} else {
			builder.append("		criteria2 = session.createCriteria("
					+ secoundmodelname + ".class);\r\n");
		}
		builder.append("		criteria2.add(Restrictions.idEq("
				+ secoundmodelname.substring(0, 1).toLowerCase()
				+ secoundmodelname.substring(1) + "Int));\r\n");
		builder.append("		" + secoundmodelname + " "
				+ secoundmodelname.toLowerCase() + " = (" + secoundmodelname
				+ ") criteria2.uniqueResult();\r\n");
		builder.append("		" + getObjFromClass(noun.getName()) + ".set"
				+ secoundmodelname + "(" + secoundmodelname.toLowerCase()
				+ ");\r\n");

	}

	public  void interpretvpsecoundcode(StringBuilder builder,
			String secoundmodelname, Noun noun) {
		builder.append("		Integer " + secoundmodelname + "Int = "
				+ getObjFromClass(noun.getName()) + "form.get"
				+ secoundmodelname.substring(0, 1).toUpperCase()
				+ secoundmodelname.substring(1) + "();\r\n");
		builder.append("		" +getObjFromClass( noun.getName())+ "form.set"
				+ secoundmodelname.substring(0, 1).toUpperCase()
				+ secoundmodelname.substring(1) + "(null);\r\n");
	}

	public   Noun getNoun(Sentence sentence) {
		NounUse nounUse = (NounUse) sentence.getFirstobjective().getOfuse()
				.iterator().next();
		return nounUse.getNoun();

	}

	public  void interpretToCollectionJSP(StringBuilder builder, Attr attr,
			Noun noun, String requestURI) {
		if (attr.getClasstype().equalsIgnoreCase("Collection")) {
			Noun relatedNoun = this.getNounFromNounAttr(attr.getName()
					.substring(0, attr.getName().length() - 1), noun);
			if(relatedNoun!=null){
				builder.append("<div>\r\n<logic:iterate id=\""
						+ this.getSingleOfMultiple(attr.getName()) + "\" name=\""
						+ noun.getName().toLowerCase() + "\" property=\""
						+ attr.getName() + "\">");
				if(relatedNoun.getAttrs()!=null){
					for (Iterator iter = relatedNoun.getAttrs().iterator(); iter
					.hasNext();) {
						Attr attr2 = (Attr) iter.next();
						this.interpretShowAttrJSP(builder, attr2, relatedNoun,
						requestURI);
					}
					
				}
				builder.append("<br />\r\n");
				builder.append("    </logic:iterate>\r\n</div>");
			
			}
		} else if (attr.getClasstype().equalsIgnoreCase("noun")) {

		}
	}

	public  void interpretToCollectionJSPDisplay(StringBuilder builder,
			Attr attr, Noun noun, String requestURI) {
		if (attr.getClasstype().equalsIgnoreCase("Collection")) {
			Noun relatedNoun = this.getNounFromNounAttr(attr.getName()
					.substring(0, attr.getName().length() - 1), noun);
			builder.append("				<display:table name=\""
					+ noun.getName().toLowerCase() + "." + attr.getName()
					+ "\" id=\"row\" requestURI=\"" + requestURI
					+ "\" pagesize=\"0\" \r\n");
			builder.append(" requestURIcontext=\"false\"");
			builder.append(" sort=\"list\"");
			builder.append(" export=\"false\"");
			builder.append(" >\r\n");
			if(relatedNoun!=null){
				for (Iterator iter = relatedNoun.getAttrs().iterator(); iter
				.hasNext();) {
					Attr attr2 = (Attr) iter.next();
					this.interpretShowDisplayColumn(builder, attr2, relatedNoun);
				}
			}

			builder.append("                        </display:table>\r\n");
		} else if (attr.getClasstype().equalsIgnoreCase("noun")) {

		}
	}
	
	
	
	
	

	public  static Noun getNounFromNounAttr(String attrname, Noun noun) {
		for (Iterator iter = noun.getJ2eeStory().getNouns().iterator(); iter
				.hasNext();) {
			Noun possibleNoun = (Noun) iter.next();
			if (possibleNoun.getName().equalsIgnoreCase(attrname)) {
				return possibleNoun;
			}
		}
		return null;
	}

	public  String getSingleOfMultiple(String multiple) {
		return multiple.substring(0, multiple.length() - 1);

	}

	public  void interpretVpOfAtter(Attr attr, StringBuilder builder,
			String objname, String nounname) {
		if (!attr.getClasstype().equals("noun") && !attr.getName().equals("id")
				&& !attr.getClasstype().equalsIgnoreCase("Collection")) {
			// lowerattrname = attr.getAttr().getName().toLowerCase();
			String capiterizedattrname = attr.getName().substring(0, 1)
					.toUpperCase()
					+ attr.getName().substring(1);
			builder.append("		");
			builder.append(objname + ".set" + capiterizedattrname + "(");
			if (attr.getClasstype().equals("boolean")) {

				builder.append(objname + "form.is" + capiterizedattrname
						+ "());\r\n");
			} else {
				builder.append(objname + "form.get" + capiterizedattrname
						+ "());\r\n");

			}
		}

	}

	public void interpretLocalFields(Attr attr, StringBuilder builder){
		builder.append(attr.getClasstype() + " " + attr.getName() + ";" + "\r\n");
	}

	public void interpretPostfix(Attr attr, StringBuilder builder, String objname){
		builder.append(objname + "->" + attr.getName() + " = ");
		String attrType = attr.getClasstype();
		if("boolean".equals(attrType)){
			builder.append("false");
		} else if("int32_t".equals(attrType)){
			builder.append("0");
		} else if("USTRING".equals(attrType)){
			builder.append(attr.getName());
		} else {
			builder.append("NULL");
		}

		builder.append(";\r\n");
	}

	public void interpretLookUp(Attr attr, StringBuilder builder, String objname){
		String attrName = attr.getName();
		if(!(objname + "ID").equals(attrName)) {
			builder.append("value = json_lookup_value(" + objname + "_tree, \"" + attr.getName() + "\");\n");
			builder.append("if (value != NULL)\n");
			String attrType = attr.getClasstype();
			String type = "";
			if ("boolean".equals(attrType)) {
				type = "is_true";
			} else if ("int32_t".equals(attrType)) {
				type = "get_integer";
			}
			if (!"STRING".equals(attrType)) {
				builder.append(objname + "->" + attrName + " = json_" + type + "(value);\n");
			} else {
				String objAndAttr =  objname + "->" + attrName;
				builder.append("{\n      if (" + objAndAttr + " != NULL)\n" +
						"      free(" + objAndAttr + ");\n" + objAndAttr + " = strdup(json_get_string(value));\n" +
						"  }\r\n");

			}
		}
	}

	public void interpretJsonNew(Attr attr, StringBuilder builder, String objname){
		String attrType = attr.getClasstype();
		String attrName = attr.getName();
		builder.append("JSONTree* " + attrName + " = json_new_");
		if("boolean".equals(attrType)){
			builder.append("boolean");
		} else if("int32_t".equals(attrType)){
			builder.append("integer");
		} else if("USTRING".equals(attrType) || "STRING".equals(attrType)){
			builder.append("string");
		}
		builder.append("(" + objname + "->" + attrName + ");\r\n");
	}

	public void interpretJsonAdd(Attr attr, StringBuilder builder, String objname){
		String attrName = attr.getName();
		builder.append("json_add_value(" + objname + "_tree, " + "\"" + (attrName.contains("ID") ? "id" : attrName) +
				"\", " +
				attrName +
				");\r\n");
	}

	public void interpretfprintF(Attr attr, StringBuilder builder, String objname){
		String attrName = attr.getName();
		String attrType = attr.getClasstype();
		boolean isStringType = "STRING".equals(attrType);
		if(isStringType) {
			builder.append("if(" + objname + "->" + attrName + "!= NULL)\r\n");
		}
		builder.append("fprintf(f, " + "\"%s  " + attrName + "= ");
		if("boolean".equals(attrType)){
			builder.append("%s" + "\\" + "n\", margin, boolean_to_string(" + objname + "->" + attrName + "));\r\n");
		} else if("int32_t".equals(attrType)){
			builder.append("%d\\n\", margin, " + objname + "->" + attrName + ");\r\n");
		} else if("USTRING".equals(attrType) || isStringType){
			builder.append("\\\"%s\\\"\\n\", margin, " + objname + "->" + attrName + ");\r\n");
		}

		if(isStringType){
			builder.append("else fprintf(f, \"%s  " + attrName + " = NULL\\n\", margin);\r\n");
		}

	}

	public static String getJapaneseOrEnglish(Attr attr){
		if(StringUtils.isNotBlank(attr.getJapanese())){
			return attr.getJapanese();
		}else{
			return attr.getName();
		}
		
	}
	public static String getObjFromClass(String string){
		return string.substring(0, 1).toLowerCase() + string.substring(1);
	}

	public static String getUpperCaseFromClass(String string){
		return string.toUpperCase();
	}


	
	
	
}
