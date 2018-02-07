package com.javaconceptoftheday;

import java.util.ArrayList;

public class DuplicateString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String arrString[] = { "one", "eon", "neo", "two", "owt","otw","ooo","ean"};
		
		for(int i=0;i<arrString.length;i++){
			char [] c1 = arrString[i].toCharArray();
			ArrayList<String> alist = new ArrayList<String>();
			alist.add(arrString[i]);
			for(int j=i+1;j<arrString.length;j++){
				char [] c2 = arrString[j].toCharArray();
				int count =0;
				for(int k=0;k<c1.length;k++){
					for(int l =0;l <c2.length;l++){

                    if(c1[k] == c2[l]){
                    	count++;
                    	
                    	}
                    }
			}
				
		   if(count == arrString[i].length()){
			   System.out.println("Array occurence is equal");
			   alist.add(arrString[j]);
			   System.out.println("*****" + alist + "*********");
		   } else {
			   System.out.println("Array occurence is not equal");
			   System.out.println("+++++++" + alist + "+++++++");
		   }
		   
		}

			/*for(String s: alist) {
				System.out.println(s);;
			}
			System.out.println("======"+arrString[i]+"========");*/
	}

}
}