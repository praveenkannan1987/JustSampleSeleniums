package day3and4;

import java.util.Scanner;

public class Week2Day5Ex1 {

	 public static void main(String[] args) {  
	        Scanner input = new Scanner(System.in);  
	        System.out.print("Please enter a Password: ");  
	        String password1 = input.next();  
	        if (isValid(password1)) {  
	            System.out.println("Valid Password");  
	        } else {  
	            System.out.println("Invalid Password");  
	        }  
	    }  

	    public static boolean isValid(String password) {  
	    	char c;  
	        int count1 = 1,count2=1,count3=1;  
	        if (password.length() < 10) 
	        { 
	        	System.out.println("Password length should be atleast 10 characters");
	            return false;  
	        } else 
	        {      
	            
	            for (int i = 0; i < password.length() - 1; i++) {  
	                c = password.charAt(i);  
	                if (!Character.isLetterOrDigit(c)) {    
	                	System.out.println("Password length should not have special characters.");
	                    return false;  
	                } 
	                if (Character.isDigit(c)) 
	                {  
	                    count1++; 
	                } 
	                if(Character.isLetter(c))
	                {
	                	count2++;
	                }
	                if(Character.isUpperCase(c)){
	                    count3++;
	                    
	                }
	                System.out.println(count1+" "+count2+" "+count3);
			        if (count1 >= 3 && count2 >= 3 && count3 >= 2)   {     
		                return true;  
		            } 
	            }  
	            
	        }  
	        if(count1<3) System.out.println("Password must contain atleast 2 digits");
	        if(count2<3) System.out.println("Password must contain atleast 2 letters");
	        if(count3<2) System.out.println("Password must contain atleast 1 captial letter");
	        return false;
	    }  
	    

}
