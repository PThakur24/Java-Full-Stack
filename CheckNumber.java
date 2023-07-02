import java.util.*;
public class checkNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Integer: ");
		int num=sc.nextInt();
		
		if(num<0) {
			System.out.println("Number is Negative");
		}
		else {
			System.out.println("Number is Positive");
		}
	}

}
