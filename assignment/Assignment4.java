package com.te.AssignmentQuestions;

import java.util.Scanner;

public class Assignment4 {

	public static void main(String[] args) {
	Scanner ref=new Scanner (System.in);
	System.out.println("Enter the number");
	int num=ref.nextInt();
	boolean flag=false;
	for (int i = 2; i <=num/2; i++) {
		if(num%i==0) {
			flag=true;
			break;
		}
	}
	String str=!flag?"prime":"Not a prime";
	System.out.println(str);
	}
}	


	

