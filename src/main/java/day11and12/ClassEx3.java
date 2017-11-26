package day11and12;

public class ClassEx3 {

	public static void main(String[] args) {
		String s="Amazn India Development Center",k="";
		int a=s.length();
		for(int i=a-1;i>=0;i--){
			k=k+s.charAt(i);
		}
		System.out.println("reverse of the string: "+s+" is :"+k);
		StringBuffer s1=new StringBuffer(s);
		System.out.println("reverse of the string: "+s1.reverse());
		/*int j=a-1;
		char t,c[]=s.toCharArray();
		for(int i=0;i<=a/2;i++){
			if(j>=a/2){
				t=s.charAt(i);
				s.charAt(i)=s.charAt(j);
				s.charAt(j)=t;
			}
		}*/
	}

}
