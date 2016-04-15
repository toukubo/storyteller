package net.storyteller.desktop;

import java.lang.reflect.Method;
import java.util.Iterator;


public class CopyProperties {
	public CopyProperties(Object from,Object to){
		for (Iterator iter = PojoUtils.getSetMethodsAboutNative(from.getClass()).iterator(); iter.hasNext();) {
			try {
				Method setmethod = (Method) iter.next();
				if(setmethod != null){
					Method getmethod = PojoUtils.getGetMethodOfSetMethod(setmethod);
					if(getmethod != null){
						Method setMethodOfTo = to.getClass().getMethod(setmethod.getName(),setmethod.getParameterTypes());
						Object object = getmethod.invoke(from,new Object[]{});
						setMethodOfTo.invoke(to,new Object[]{object});
					}
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}

}
