package day11and12;

public class ClassEx4 {

	public static void main (String[]args){
		String word = "";
		word = "Integer";
		int n=word.length();
		ClassEx4 permutation = new ClassEx4();
		permutation.permute(word, 0, n-1);
	}
	public void permute(String str, int l, int r)
	{
		if (l == r){
			System.out.println(str);
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r);
				str = swap(str,l,i);
			}
		}
	}
	public String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}
