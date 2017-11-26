package day3and4;

public class Week2Day3Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
