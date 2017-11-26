package dailyprogram;

import java.util.Scanner;

public class Code_19 {

	public static void main(String[] args) {
		/*Write a simple Java program to print the Pascal triangle till N rows by using static function. 
		Ex. Input=5. Then the output should be.
		            1
		         1    1
		       1   2    1
		    1   3    3    1
		 1   4    6    4    1	*/
		int r, i, k, number=1, j;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Number of Rows : ");
		r = scan.nextInt();
		for(i=0;i<r;i++)
		{
			for(k=r; k>i; k--)
			{
				System.out.print(" ");
			}
            number = 1;
			for(j=0;j<=i;j++)
			{
				 System.out.print(number+ " ");
                 number = number * (i - j) / (j + 1);
			}
			System.out.println();
		}
	}

}
