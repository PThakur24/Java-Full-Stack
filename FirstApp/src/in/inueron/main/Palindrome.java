package in.inueron.main;

public class Palindrome {

	public static void main(String[] args) {
		int n=25532;
		String s=Integer.toString(n);
		String res="";
			for(int j=s.length()-1;j>=0;j--)
			{
				res=res+s.charAt(j);
			}
		if (s.equals(res))
			System.out.println("Palindrom");
		else
			System.out.println("Not Palindrom");
	}
}
	