package com.displayunity;

import java.util.Scanner;

public class Uc2_wordtonumber {
	 static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub




	
	
	
	

	  

	
		
		System.out.println("enter the number");
		String n=sc.nextLine();
		
		
		
		if (n.length()==1) {
			System.out.println("unity");
		}
		else if (n.length()==2) {
			System.out.println("ten");
		}
		else if (n.length()==3) {
			System.out.println("hundred");
		}
		else if (n.length()==4) {
			System.out.println("thousand");
		}
		else {
			System.out.println("entered wrong number");
		}
		
		
			
			
		}

	



	}


