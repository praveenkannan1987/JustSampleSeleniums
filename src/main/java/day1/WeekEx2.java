package day1;

public class WeekEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1,f=1;
		System.out.println("Fibnocci Series till 100+:"+i+"\n"+f);
		do {
			int f1=f+i;
			f=i;
			i=f1;
			System.out.println(f1);
		}while(i < 100);
	}

}
