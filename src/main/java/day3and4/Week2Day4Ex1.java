package day3and4;

import java.util.Scanner;

public class Week2Day4Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the number for folyd triangle:");
		Scanner var1=new Scanner(System.in);
		int n=var1.nextInt(),j=1;
		for(int i=1;i<=n;i++)
		{
			int k=1;
			while(k<=i){
				System.out.print(j+" ");
				j++;
				k++;
			}
			System.out.println();
		}
	}

}
