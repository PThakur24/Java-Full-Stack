import java.util.*;
public class Average {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			int num=sc.nextInt();
			arr[i]=num;
		}
		int sum=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
		}
		System.out.println("Average of Array is:"+ (double)sum/n);
	}
}
