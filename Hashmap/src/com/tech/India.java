package com.tech;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class India {
	
	public static void main(String[] args) {
		  
		List<String>  mh=new ArrayList();
		              mh.add("pune");
		              mh.add("mumbai");
		  List<String>  gj=new ArrayList();
		              gj.add("c1");
		              gj.add("c2");
		    Map<String,List<String>> India=new  HashMap();
		    India.put("maharastra",mh);
		    India.put("gujrat",gj);
		    
		    System.out.println(India);
		    
		    Set<String> keySet = India.keySet();
//		    
//		   		    System.out.println(keySet);
		       Iterator<String> itr = keySet.iterator();
		   while(itr.hasNext()) {
			      String key = itr.next();
	        List<String> list = India.get(key);
	                    Iterator<String> or = list.iterator();
	                    System.out.println(key);
	                    while(or.hasNext()) {
	    	  String t = or.next();
	    	
	    	  System.out.println(t);
	    	 
	      }
			      
		   }
		    
		          
		            	  
		        
		
	}

}
