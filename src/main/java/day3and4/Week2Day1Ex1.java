package day3and4;

public class Week2Day1Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]={13,15,67,88,65,13,99,67,65,87};
		int n=a.length;
		for(int i=0;i<n;i++)
		{
			for(int j=n-1;j>i;j--)
			{
				if(a[j]==a[i])
				{
					System.out.println(a[i]+" is Duplicate No.");
				}
			}
		}
	}

}
