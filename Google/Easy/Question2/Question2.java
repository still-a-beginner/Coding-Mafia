import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter number of numbers");
        String n1 = myObj.nextLine(); 
        int n = Integer.parseInt(n1);
		int[] A = new int[n];
		int sum = 0;
		int ssum = 0;
		for(int i = 0;i<n;i++)
		{
		    A[i] = Integer.parseInt(myObj.nextLine());
		    sum = sum + A[i];
		    ssum = ssum + A[i]*A[i];
		}
		sum = sum * sum;
		int ans = (sum - ssum) / 2;
		System.out.println(ans);
	}
}
