package com.te.AssignmentQuestions;

public class Assignment13 {

	public static void main(String[] args) {
		 try {
			  int a[] = { 1, 2, 3, 4, 5 };
	   System.out.println(a[5]);
	 try {
	    int x = a[2] / 0;
	            }
	            catch (ArithmeticException ref1) {
	                System.out.println("division by zero is not possible");
	            }
	        }
	        catch (ArrayIndexOutOfBoundsException ref2) {
	            System.out.println("ArrayIndexOutOfBoundsException");
	           
	}

}

}
	


