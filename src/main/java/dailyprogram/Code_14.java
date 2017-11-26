package dailyprogram;

public class Code_14 {

	public static void main(String[] args) {
		int sum=0;
		sum=sum+multi(3);
		sum=sum+multi(5);
		System.out.println("So their sum is "+sum);
	}

	private static int multi(int numb) {
		int sum=0,i=1,t=0;
		System.out.print("The multiples of "+numb+" less than 100 are :");
		while(t<100){
			sum=sum+t;
			if(t!=0)
				System.out.print(t+",");
			t=numb*i;
			i++;
		}
		System.out.println();
		return sum;
	}

}
