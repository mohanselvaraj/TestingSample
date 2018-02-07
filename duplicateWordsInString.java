package com.javaconceptoftheday;

import java.util.HashMap;
import java.util.Set;

public class duplicateWordsInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		duplicateWords("bread butter and butter bread");
		 
        duplicateWords("java is java again java");
 
        duplicateWords("Super Man Bat Man Spider Man");

	}

	public static void duplicateWords(String str) {
		// TODO Auto-generated method stub
		
		String ArrayStr [] = str.split("\\s");
		HashMap<String,Integer> words = new HashMap<String, Integer>();
		for(String word:ArrayStr){
			if(words.containsKey(word)){
				words.put(word,words.get(word)+1);
			} else {
				words.put(word, 1);
			}
		}
		Set<String> dup = words.keySet();
		
		for( String dupkey: dup){
			if(words.get(dupkey) >=1){
				 System.out.println(dupkey+" : "+words.get(dupkey));
			}
		}
	}

}