package day1;

public class WeekDay5 {

	public static void main(String[] args) {
		//java program to print Armstrong no
		for(int i=100;i<1000;i++)
		{
			int n=i,sum=0;
			while(n>0)
			{
				int r=n%10;
				sum=sum+(r*r*r);
				n=n/10;
			}
			if (i==sum)
			{
				System.out.println(i+" is Amstrong number");
			}
		}
	}

}
