import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner myObj = new Scanner(System.in);  
        System.out.println("Enter n");
        String n1 = myObj.nextLine(); 
        int n = Integer.parseInt(n1);
        System.out.println("Enter m");
        String m1 = myObj.nextLine(); 
        int m = Integer.parseInt(m1);
		int ans = 1;
        for(int i = m+n;i>n;i--)
        ans = ans * i;
        int ans1 = 1;
        for(int j = m;j>=1;j--)
        ans1 = ans1 * j;
        ans = ans / ans1;
		System.out.println(ans);
	}
}