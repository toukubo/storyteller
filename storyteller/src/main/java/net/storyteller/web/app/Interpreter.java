package net.storyteller.web.app;

import net.storyteller.model.Sentence;

public interface Interpreter {
	
	public String interpret(Sentence sentence,String templatename);

}
