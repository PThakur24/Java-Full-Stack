import java.util.*;
public class LargerNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		
		if(x >= y)   
		{  
		if(x >= z)  
		System.out.println("The largest number is: "+x);  
		else  
		System.out.println("The largest number is: "+z);  
		}   
		else   
		{  
		if(y >= z) 
		System.out.println("The largest number is: "+y);  
		else  
		System.out.println("The largest number is: "+z);  
		}  
	}

}
