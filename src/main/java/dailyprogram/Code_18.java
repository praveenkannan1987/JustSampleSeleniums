package dailyprogram;

public class Code_18 {

	public static void main(String[] args) {
		/*Write a simple Java program to identify and form a string with unique characters. 
		Ex. Input=Good Looking. 
			Output should be = godlkin.*/
		String a="good looking";
		char b[]=a.toCharArray();
		System.out.println("Input:"+a);
		for (int i=0;i<a.length()-1;i++)
		{
			for(int j=i+1;j<a.length();j++)
			if(b[i]==b[j])
				b[j]='*';
		}
		String c=new String(b);
		c=c.replace("*", "");
		c=c.replace(" ", "");
		System.out.println("Output:"+c);
	}

}
