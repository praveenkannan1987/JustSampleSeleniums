package day11and12;

public class ClassEx5 {

	public static void main (String[]args){
		//   Scanner kb = new Scanner (System.in); 
		     String word = "";

		     System.out.println("Enter a word: ");
		     word = "Welcome to Chennai";

		     uniqueCharacters(word);
		     System.out.println(countUniqueCharacters(word));
		}
	 public static void uniqueCharacters(String test){
	      String temp = "";
	         for (int i = 0; i < test.length(); i++){
	            if (temp.indexOf(test.charAt(i)) == - 1){
	               temp = temp + test.charAt(i);
	         }
	      }

	    System.out.println(temp + " ");

	   }
	 public static int countUniqueCharacters(String input) {
		    boolean[] isItThere = new boolean[Character.MAX_VALUE];
		    for (int i = 0; i < input.length(); i++) {
		        isItThere[input.charAt(i)] = true;
		    }

		    int count = 0;
		    for (int i = 0; i < isItThere.length; i++) {
		        if (isItThere[i] == true){
		            count++;
		        }
		    }

		    return count;
		}

}
