package net.storyteller.web.app;

import net.storyteller.model.NounClause;
import net.storyteller.model.NounUse;
import net.storyteller.model.Sentence;

public class SentenceUtil {
	public static String getSentenceString(Object sentenceObject){
		Sentence sentence = (Sentence)sentenceObject;
		StringBuilder builder = new StringBuilder();
		if(sentence!=null){
			builder.append(sentence.getVerb().getName());
			builder.append(((NounUse)sentence.getFirstobjective().getOfuse().iterator().next()).getNoun().getName());
			builder.append(sentence.getName());
		}
		return builder.toString();
	}
	public static String getSentenceStringJapanese(Object sentenceObject){
		Sentence sentence = (Sentence)sentenceObject;
		StringBuilder builder = new StringBuilder();
		if(sentence!=null){
			builder.append(sentence.getVerb().getJapanese());
			builder.append(((NounUse)sentence.getFirstobjective().getOfuse().iterator().next()).getNoun().getJapanese());
			builder.append(sentence.getName());
		}
		return builder.toString();
	}

}
