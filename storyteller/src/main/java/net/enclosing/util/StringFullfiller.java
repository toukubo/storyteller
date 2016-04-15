package net.enclosing.util;

import java.lang.reflect.Method;
import java.util.Date;

public class StringFullfiller {
	public static void fullfil(Object object){
		Class class1 = object.getClass();
		System.err.println(object.getClass().getName());
		for (int i = 0; i < class1.getMethods().length; i++) {
			if(class1.getMethods()[i].getParameterTypes().length == 1 && 
					(class1.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.String") 
							|| class1.getMethods()[i].getParameterTypes()[0].getName().equals("java.util.Date")  ) 
					&& class1.getMethods()[i].getName().startsWith("set")){
				try {
					Method method = class1.getMethod("get" + class1.getMethods()[i].getName().substring(3),null);
					if(method.invoke(object,null) == null){
						if(class1.getMethods()[i].getParameterTypes()[0].getName().equals("java.lang.String")){
							class1.getMethods()[i].invoke(object,new Object[]{new String("")});
						}else if(class1.getMethods()[i].getParameterTypes()[0].getName().equals("java.util.Date")){
							class1.getMethods()[i].invoke(object,new Object[]{new Date()});
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		
	}

}
