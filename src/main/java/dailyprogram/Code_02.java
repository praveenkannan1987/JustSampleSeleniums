package dailyprogram;

import java.util.Scanner;

public class Code_02 {

	public static void main(String[] args) {
		//Palindrome Number
		System.out.println("Enter the number for Palindrome:");
		Scanner var1=new Scanner(System.in);
		int n=var1.nextInt();
		int r,sum=0,temp;
		temp=n;    
		while(n>0){    
			r=n%10; 
			sum=(sum*10)+r;    
			n=n/10;    
		}    
		if(temp==sum)    
			System.out.println("Palindrome Number.");    
		else    
			System.out.println("Not Palindrome.");    
	}

}
