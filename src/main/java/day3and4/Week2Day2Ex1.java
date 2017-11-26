package day3and4;

import java.util.Scanner;

public class Week2Day2Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter the Year to check Leap year or not:");
		Scanner var1=new Scanner(System.in);
		int n=var1.nextInt();
		if(((n%4==0)&&(n%100!=0)) || n%400 == 0){
			System.out.println("Given year is leap year");
		}else{
			System.out.println("Given year is not leap year");
		}

	}

}
