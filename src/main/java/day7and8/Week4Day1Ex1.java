package day7and8;

import java.util.Scanner;

public class Week4Day1Ex1 {

	public static void main(String[] args) {
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
