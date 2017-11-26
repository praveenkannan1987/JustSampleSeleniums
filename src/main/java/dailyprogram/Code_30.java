package dailyprogram;

import java.util.Scanner;

public class Code_30 {

private static Scanner sc;
	
	public static void main(String[] args) {
		//perfect number
		String s;
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Text: ");
		s = sc.nextLine();
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if(Character.isDigit(c)||Character.isLetter(c))
				System.out.print(c);
			else if(c=='*')
				System.out.print(" ");
		}
	}

}
