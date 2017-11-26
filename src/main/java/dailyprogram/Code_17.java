package dailyprogram;

import java.util.Scanner;

public class Code_17 {

	public static void main(String[] args) {
		/*Write a simple Java program to print the numbers which has the greatest sum across the diagonal. 
		 * Code must be generic for NxN matrix.
		Ex -  1      2     3     4
			  5      6     7     8
			  9      10    11    12
			  13     14    15    16
		The diagonal is 4,7,10,13.  
		The numbers across the diagonal are 1,2,3,5,6,9 and 8,11,12,14,15,16. 
		Their sum is 22 and 76. So the output should be 8,11,12,14,15,16.*/
		System.out.println("Enter the Number:");
		int numb=new Scanner(System.in).nextInt();
		int matrix[][]=new int[numb][numb];
		int numb1[]=new int[(numb+numb)];
		int numb2[]=new int[(numb+numb)];
		int sum1=0,sum2=0,pos1=0,pos2=numb,k=0,l=0;
		for(int i=0;i<numb;i++){
			for(int j=0;j<numb;j++){
				System.out.print("Enter the matrix["+(i+1)+"]["+(j+1)+"]:");
				matrix[i][j]=new Scanner(System.in).nextInt();
			}
		}
		for(int i=0;i<numb;i++){
			for(int j=0;j<numb;j++){
				if(matrix[i][j]!=matrix[pos1][pos2]){
					if(j<pos2){
						sum1=sum1+matrix[i][j];
						numb1[k]=matrix[i][j];
						k++;
					}
					if(j>pos2){
						sum2=sum2+matrix[i][j];
						numb2[l]=matrix[i][j];
						l++;
					}
				}

			}
			pos1=pos1+1;
			pos2=pos2-1;
		}
		System.out.println("sum of 1st half:"+sum1);
		System.out.println("sum of 2st half:"+sum2);
		System.out.println("half which is greater");
		if(sum1>sum2){
			for(int i=0;i<k;i++)
				System.out.print(numb1[i]+",");
		}else{
			for(int i=0;i<l;i++)
				System.out.print(numb2[i]+",");
		}
	}
}

