package day1;

import java.util.Scanner;

public class Week1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Find given no prime or not
		int n,flag=1;
		System.out.println("Enter the number to verify Prime or Not:");
		Scanner scanner1 = new Scanner(System.in);
		n=scanner1.nextInt();
		for(int i=2;i<=(n/2)+1;i++)
		{
			if(n%i==0)
			{
				flag=1;
				break;
			}
			else
			{
				flag=0;
			}
		}
		if(flag==1)
		{
			System.out.println("Given input number "+n+" is not prime.");
		}
		else
			System.out.println("Given input number "+n+" is prime.");
	}

}
