package dailyprogram;

import java.util.Scanner;

public class Code_01 {

	public static void main(String[] args) {
		//Factorial 4!=24
		System.out.println("Enter the number for Factor:");
		Scanner var1=new Scanner(System.in);
		int n=var1.nextInt();
		int i,fact=1;
		for(i=1;i<=n;i++){    
			fact=fact*i;    
		}    
		System.out.println("Factorial of "+n+" is: "+fact);    
	}

}
