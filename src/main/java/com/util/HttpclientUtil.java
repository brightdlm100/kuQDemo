package com.util;


import java.io.IOException;
import java.util.HashMap;
import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.Connection.Response;
import org.jsoup.nodes.Document;
import com.util.StringUtil;



public class HttpclientUtil {
	
	public static Response requestUrl(int retry,String method,String url, HashMap<String, String> cookies,HashMap<String, String> data) {
		Connection con = Jsoup.connect(url);
		String userAgent="Mozilla/4.0 (compatible; MSIE 7.0; Windows NT 10.0; WOW64; Trident/7.0; .NET4.0C; .NET4.0E)" ;
		if(data!=null) {
		    con.header("User-Agent", userAgent).cookies(cookies).data(data);
		}
		else {
			con.header("User-Agent", userAgent).cookies(cookies);
		}
		Response res = null;
	    	 for(int i=1;i<=retry;i++) {
	    		 if(res==null) {
	    			 try {
				    		 if (method.equals("get")) {
				    			 res= con.ignoreContentType(true).timeout(3000).execute();
							} else if(method.equals("post")) {
								res=con.ignoreContentType(true).timeout(2000).execute();
							}
	    			 } catch (IOException e) {
	    				   e.printStackTrace();
	    				   res=null;
	    				   System.err.println("第"+i+"次请求过程中出错.."+url);
	    				   continue;
	    				  }

	    		 }
	    		 if(res!=null) {
	    			 //System.out.println("=====================================================================第"+i+"次请求成功!"+url);
	    			 return res;
	    		 }
	    	 }
	     return res;
	 }	

}
