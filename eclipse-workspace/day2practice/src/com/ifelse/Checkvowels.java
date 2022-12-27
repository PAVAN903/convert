/**
 * 
 */
package com.ifelse;

import java.util.Scanner;

public class Checkvowels {
	//program to check vowels or consonants

	public static void main(String[] args) {
		char c;
		Scanner sc=new Scanner(System.in);
		
		
		//giving as a input 
		System.out.println("enter characters:-");
		c=sc.next().charAt(0);
		
		//checking whether characters input vowels of this set
		
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u') {
        	System.out.println(c+ "is vowel");
        }
        else {
        	System.out.println(c+ "is consonants");
        	
        	
        }
	}

}
