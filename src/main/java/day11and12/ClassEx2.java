package day11and12;

public class ClassEx2 {

	public static void main(String[] args) {
		String s="Hexaware";
		int a=s.length(),k=0;
		for(int i=0;i<a;i++){
			if(s.charAt(i)=='e'){
				k++;
			}
		}
		System.out.println("Number of e in Hexaware is "+k);
	}

}
