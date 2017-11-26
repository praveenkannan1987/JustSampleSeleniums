package dailyprogram;

public class Code_06 {

	public static void main(String[] args) {
		/*Find repeated numbers in an Array List of numbers.
		Declare an integer array like 
		int[] a = {13,15,67,88,65,13,99,67,65,87,13}. 
		The result should be – Duplicated numbers are 13 67 65*/
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
