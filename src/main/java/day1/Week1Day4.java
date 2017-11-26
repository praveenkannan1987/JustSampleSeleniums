package day1;

import java.util.Scanner;

public class Week1Day4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get input for var1
		System.out.println("Enter the Text to determine palindrome or not");
		Scanner getinput=new Scanner(System.in);
		String orginal,reverse="";
		orginal=getinput.next();
		int n=orginal.length();
		for(int i=n-1;i>=0;i--)
		{
			reverse=reverse+orginal.charAt(i);
		}
		if (orginal.equalsIgnoreCase(reverse))
	         System.out.println("Entered string is a palindrome.");
	      else
	         System.out.println("Entered string is not a palindrome.");
	}

}
