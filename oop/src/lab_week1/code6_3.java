package lab_week1;
import java.util.Scanner;


public class code6_3 {
	public static void main(String args[]) {
		Scanner kb= new Scanner(System.in);
		System.out.println("Enter n");
		int n;
		n=kb.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++)
				System.out.print(" ");
			for(int k=1;k<=2*i-1;k++)
				System.out.print("*");
			System.out.println();
			
			
		}
	}

}
