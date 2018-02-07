package com.javaconceptoftheday;

import java.util.Scanner;

class CountTheWords
{
    public static void main(String[] args)
    {
    	
    	String s = "Java is java again java again";
     
        //Scanner sc = new Scanner(s);
      
        //String s1=sc.nextLine();
 
        String[] words = s.split(" ");
 
        System.out.println("Number of words in the string = "+words.length);
    }
}