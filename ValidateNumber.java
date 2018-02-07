package com.javaconceptoftheday;

import java.util.ArrayList;
import java.util.List;

public class ValidateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arrInteger[] = { 123,431,213,413,321,314};
		
		for(int i=0;i<arrInteger.length;i++){
		
			//System.out.println(arrInteger[i]);
			String l1 = arrInteger[i].toString();	
			char [] c1 = l1.toCharArray();
			ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(arrInteger[i]);
			for(int j=i+1;j<arrInteger.length;j++){
				//System.out.println(arrInteger[j]);
				String l2 = arrInteger[j].toString();
				char [] c2 = l2.toCharArray();
				int count = 0;
				for(int k=0;k<c1.length;k++){
					for(int l=0;l<c2.length;l++){
						if(c1[k] == c2[l]){
							count++;
						}
					}
			}
				if (count == l1.length()) {
					System.out.println("Array occurence is equal");
					al.add(arrInteger[j]);
					System.out.println("******" + al + "******");
					System.out.println("======"+arrInteger[i]+"========");

				} /*else {
					System.out.println("Array occurence is not equal");
					System.out.println("+++++++" + al + "++++++++");

				}*/
		}

			/*for(Integer s: al) {
				System.out.println(s);
			}*/
			//System.out.println("======"+arrInteger[i]+"========");
}
}
	}
