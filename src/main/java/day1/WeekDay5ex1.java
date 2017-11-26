package day1;

import java.util.Scanner;

public class WeekDay5ex1 {

	public static void main(String[] args) {
		// Swap two number without using additional variable
		Scanner scanner1 = new Scanner(System.in);
		System.out.println("Enter the variable a:");
		int a=scanner1.nextInt();
		System.out.println("Enter the variable b:");
		int b=scanner1.nextInt();
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("swap of two numbers: a= "+a+"; b= "+b);
	}

}
