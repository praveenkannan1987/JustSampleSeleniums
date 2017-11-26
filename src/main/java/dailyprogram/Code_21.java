package dailyprogram;

public class Code_21 {

	public static void main(String[] args) {
		/*Recursive functions are the functions that calls itself repeatedly until a specific condition is met.*/
		p();
	}
	static int count=0;  
	static void p(){  
	count++;  
	if(count<=5){  
	System.out.println("hello "+count);  
	p();  
	}  
	}  

}
