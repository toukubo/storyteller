package net.storyteller.web.util;

import javax.servlet.http.HttpServletRequest;

public class HttpUtil {

	public static boolean isAcceptJSON(HttpServletRequest req) {
		String accept = req.getHeader("Accept");
		if ( accept != null ) {
			return accept.contains("application/json");			
		} else {
			return false;
		}
	}


}
