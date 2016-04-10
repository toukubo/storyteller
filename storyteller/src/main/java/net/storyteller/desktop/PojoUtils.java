package net.storyteller.desktop;

import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Vector;

public class PojoUtils {
	public static boolean isThisMethodAboutNative(Method method){
		return (method.getParameterTypes().length == 1 &&
				(method.getParameterTypes()[0].getName().equals(int.class.getName())
		|| method.getParameterTypes()[0].getName().equals(Integer.class.getName())
		|| method.getParameterTypes()[0].getName().equals(Date.class.getName())
		|| method.getParameterTypes()[0].getName().equals(boolean.class.getName())
		|| method.getParameterTypes()[0].getName().equals(String.class.getName())
		)
		&& method.getName().startsWith("set"));
	}
	public static Collection getSetMethodsAboutNative(Class class1){
		Vector vector = new Vector();
		for (int i = 0; i < class1.getMethods().length; i++) {
			Method method = class1.getMethods()[i];
			if(isThisMethodAboutNative(method)){
				vector.add(method);
			}
		}
		return vector;
	}
	public static String getAttributeNameOf(Method method){
		if(isThisMethodAboutNative(method)){
			return method.getName().substring(3);
		}
		return null;
	}
	public static Method getGetMethodOfSetMethod(Method setMethod){
		try {
			if(isThisMethodAboutNative(setMethod)){
				if(setMethod.getParameterTypes()[0].getName().equals(boolean.class.getName())){
					return setMethod.getDeclaringClass().getMethod("is" + getAttributeNameOf(setMethod));
				}else{
					return setMethod.getDeclaringClass().getMethod("get" + getAttributeNameOf(setMethod));
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
