package dailyprogram;

import java.util.Scanner;

public class Code_09 {

	public static void main(String[] args) {
		/*Write a Java program to print Floyd triangle by getting the number of rows.
		Ex:- Enter the No. of rows: 4
			1
			2 3
			4 5 6
			7 8 9 10*/
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
