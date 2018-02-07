package com.javaconceptoftheday;

import java.util.Scanner;

public class SwapTwoStrings 
{  
    public static void main(String[] args) 
    {    
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Enter First String :");
         
        String s1 = "akil";
         
        System.out.println("Enter Second String :");
         
        String s2 = "mohan";
         
        System.out.println("Before Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
         
        //Swapping starts
         
        s1 = s1 + s2;
        System.out.println("step 1 s1 : "+s1);
         
        s2 = s1.substring(0, s1.length()-s2.length());
        System.out.println("step2 s2 : "+s2);
         
        s1 = s1.substring(s2.length());
        System.out.println("step3 s1 : "+s1);
         
        //Swapping ends
         
        System.out.println("After Swapping :");
         
        System.out.println("s1 : "+s1);
         
        System.out.println("s2 : "+s2);
    }    
}
