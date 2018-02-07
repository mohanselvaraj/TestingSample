package com.javaconceptoftheday;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;

public class ValidateString {
	
	public Map<Character,Integer> getMapFromCharArray(char[] charArr) {
		
		Map<Character,Integer> cmp = new HashMap<Character,Integer>();
		
		for(Character chr : charArr){
       	 
       		 if(cmp.containsKey(chr)){
       			 
       	        cmp.put(chr,cmp.get(chr) +1);
       	
       		 } else {
       			 
       			 cmp.put(chr,1);
       		 }
       	 
        }
		return cmp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String s1 = "check";
         String s2 = "khecc1";
         boolean allAreSame = false;
         ValidateString obj = new ValidateString();
         char [] chr1 = s1.toCharArray();
         char [] chr2 = s2.toCharArray();
         Map<Character,Integer> map1 = obj.getMapFromCharArray(chr1);
         Map<Character,Integer> map2 = obj.getMapFromCharArray(chr2);
         
         for ( Character  key: map1.keySet()) {
        	 Integer value1 = map1.get(key);
        	 System.out.println("key1:"+ key +" -> Value1:"+ value1);
        	 Integer value2 = map2.get(key);
        	 System.out.println("key2:"+ key +" -> Value2:"+ value2);
        		if(value1 == value2) {
        			allAreSame = true;
        		} else {
        			allAreSame = false;
        			break;
        		}
         }
         
         if (allAreSame) {
        	 System.out.println("both are same");
         } else {
        	 System.out.println("both are not same");
         }
         
	}

}
