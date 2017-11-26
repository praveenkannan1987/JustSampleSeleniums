package day5and6;

import java.util.Scanner;

public class Week3Day2Ex1 {

	public static void main(String[] args) {
		System.out.println("Enter the Number:");
		int numb=new Scanner(System.in).nextInt();
		System.out.println("Enter the digit 1-9:");
		int digi=new Scanner(System.in).nextInt();
		while(Integer.toString(numb).contains(Integer.toString(digi))== true){
			numb--;
		}
		System.out.println("Largest number:"+numb);
	}

}
