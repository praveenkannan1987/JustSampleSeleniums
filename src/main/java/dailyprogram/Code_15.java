package dailyprogram;

import java.util.Scanner;

public class Code_15 {

	public static void main(String[] args) {
		/* Write a simple Java program to print all factors of number 
		 * using non-static method and print all prime factors of number using static method.
		 * 	2 | 24  
			2 | 12  
			2 | 6    
			3 | 3  
		   	  | 1

		the Prime Factors using the above method would come as 2, 2, 2, 3 for 24.*/
		System.out.println("Enter the number to find prime factors");
		int numb=new Scanner(System.in).nextInt();
		Code_15 obj= new Code_15();
        obj.primeFactors(numb);
	}
	public void primeFactors(int n)
    {
        // Print the number of 2s that divide n
        while (n%2==0)
        {
            System.out.print(2 + " ");
            n /= 2;
        }
 
        // n must be odd at this point.  So we can
        // skip one element (Note i = i +2)
        for (int i = 3; i <= Math.sqrt(n); i+= 2)
        {
            // While i divides n, print i and divide n
            while (n%i == 0)
            {
                System.out.print(i + " ");
                n /= i;
            }
        }
 
        // This condition is to handle the case whien
        // n is a prime number greater than 2
        if (n > 2)
            System.out.print(n);
    }

}
