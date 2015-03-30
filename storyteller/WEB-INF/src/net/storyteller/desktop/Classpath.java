package net.storyteller.desktop;

import java.util.List;

public class Classpath {
	private List classpathentrys;

	public List getClasspathentrys() {
		return classpathentrys;
	}

	public void setClasspathentrys(List classpathentrys) {
		this.classpathentrys = classpathentrys;
	}
	public void addChild(Classpathentry classpathentry){
		classpathentrys.add(classpathentry);
	}
	
	
}
