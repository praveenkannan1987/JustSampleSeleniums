package day1;

import java.util.Scanner;

public class Week1Day3 {

	public static void main(String[] args) {
		
		//declaration of variables
		int var1,var2;
		Scanner getinput=new Scanner(System.in);
		//get input for var1
		System.out.println("Enter the First number:");
		var1=getinput.nextInt();
		//get input for var2
		System.out.println("Enter the Second number:");
		var2=getinput.nextInt();
		//get input for operation
		System.out.println("Enter the Operation:Add/Subtract/Multiply/Divide:");
		String oper1=getinput.next();
		switch(oper1)
		{
		case "Add": System.out.println("Addition of "+var1+"+"+var2+"="+(var1+var2)); break;
		case "Subtract": System.out.println("Addition of "+var1+"-"+var2+"="+(var1-var2));break;
		case "Multiply": System.out.println("Addition of "+var1+"*"+var2+"="+(var1*var2));break;
		case "Divide": System.out.println("Addition of "+var1+"/"+var2+"="+(var1/var2));break;
		}
		
		
	}

}
