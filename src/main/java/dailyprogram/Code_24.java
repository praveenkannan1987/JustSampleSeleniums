package dailyprogram;

public class Code_24 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=0,t=0,k=0;
		int []a={10,9,8,-7,6,5,4,2,-3,-2,1};
		if(a[0]>0)
		{
			c=1;
			t=1;
		}
		for(int i=1;i<a.length;i++)
			if(a[i]>0)
			{				
					if(a[i-1]>0)
					{
						c++;
						if(t<c)
						{
							k=i;
							t=c;
						}
					}
					else
					{
						c=1;
						if(t<c)
						{	
							k=i;
							t=c;
						}
					}				
			}else
				c=0;
		for(int i=k-t+1;i<=k;i++)
		{
			System.out.println(a[i]);
		}
	}

}
