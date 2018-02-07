package com.javaconceptoftheday;

public class ReverseWord {


	
	
			public void reverseWords(char[] s) {
		int i=0;
		for(int j=0; j<s.length; j++){
			if(s[j]==' '){
				//reverse(s, i, j-1);        
				i=j+1;
			}
		}
		//reverse(s, i, s.length-1);
	
		//reverse(s, 0, s.length-1);
	}

	public void reverse1(char[] s, int i, int j){
		while(i<j){
			char temp = s[i];
			s[i]=s[j];
			s[j]=temp;
			i++;
			j--;
		}
	}

	public static void main(String[] args) {
		ReverseWord revword = new ReverseWord();
		String str = "the sky is blue";
		char [] s = str.toCharArray();
		System.out.println(s);
		String [] st = str.split("\\s ");
	
		//revword.reverse1(s, i, j);
		
	}

}
