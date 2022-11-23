package in.inueron.main;
import java.util.Scanner;

public class StringRemove {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str =sc.next();
		String res="";
		for(int i=0;i<str.length();i++)
		{
			for(int j=0;j<res.length();j++)
			{
				if (str.charAt(i) != res.charAt(j))
				{
					res=res+str.charAt(i);
				}
			}
		}
		System.out.println(res);

	}

}
