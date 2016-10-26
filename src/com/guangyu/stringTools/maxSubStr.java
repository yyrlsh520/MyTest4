package com.guangyu.stringTools;

import java.util.HashMap;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class maxSubStr {
	public static int maxSubStr(String string){
		HashMap<Character, Integer> hm1=new HashMap<Character, Integer>();
		int startIndex=-1,maxLen=0,oriStartIndex=0;
		StringBuilder maxSubString = new StringBuilder("");
		if(string==null)
		return 0;
		for(int i=0;i<string.length();i++){
			char c=string.charAt(i);
			
			if(hm1.containsKey(c)){  
	                int oriIndex = hm1.get(c);  
	                if(oriIndex > startIndex){  
	                    startIndex = oriIndex;  
	                }  
	            }  
	            if(i - startIndex > maxLen) {  
	                maxLen = i - startIndex;  
	                oriStartIndex = startIndex;  
	            }  
	            hm1.put(c, i);  
	        }  
		return maxLen;
			}
		
	}

