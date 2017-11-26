package dailyprogram;

public class Code_08 {

	public static void main(String[] args) {
		/*Write a Java program to find the second maximum number in an integer array.
		int[] intArray = {20, 340, 21, 879, 92, 21,474,83647,-200};
		The second largest number is 879.
		Your code should work even when all the integers of the array is negative numbers.*/
		int a[]={13,15,67,88,65,13,99,67,65,87};
		int n=a.length,i,j=0,big,secondbig;
		big=a[0];
		for(i=1;i<n;i++){
			if(big<a[i]){
				big=a[i];
				j = i;
			}
		}
		secondbig=a[n-j-1];
		for(i=1;i<n;i++){
			if(secondbig <a[i] && j != i)
				secondbig =a[i];
		}
		System.out.println(secondbig+" is the second largest number.");
	}
}
