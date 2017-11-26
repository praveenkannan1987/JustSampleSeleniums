package dailyprogram;

import java.util.Scanner;

public class Code_20 {
	private static Scanner sc;
	public static void main(String[] args) {
		/*Write a simple Java program to display the digits of the number in ascending order. 

		Ex.  Input = 186553. 
			Output = 13568.*/
		//getting input
		int number,i; 
		sc = new Scanner(System.in);		
		System.out.println("\n Please Enter any Number: ");
		String s= sc.next();
		i=s.length();
		int a[]=new int[i];
		i=0;
		number=Integer.parseInt(s);
		
		//Dividing the number in to an array
		while(number>0){
			int temp=number%10;
			a[i]=temp;
			number=number/10;
			i++;
		}
		
		//removing duplicates
		int current = a[0],b[]=new int[i],n=0,temp=0;
		boolean found = false;
		for (int j = 0; j < a.length; j++) {
		    if (current == a[j] && !found) {
		        found = true;
		    } else if (current != a[j]) {
		        b[n]=current;
		        n++;
		        current = a[j];
		        found = false;
		    }
		}
		b[n]=current;
        n++;
		
       //Sorting the array
		for (int i1 = 0; i1 < n; i1++) 
        {
            for (int j = i1 + 1; j < n; j++) 
            {
                if (b[i1] > b[j]) 
                {
                    temp = b[i1];
                    b[i1] = b[j];
                    b[j] = temp;
                }
            }
        }
        System.out.print("Ascending Order:");
        for (int i1 = 0; i1 < n - 1; i1++) 
        {
            System.out.print(b[i1]);
        }
        System.out.print(b[n - 1]);
	}

}
