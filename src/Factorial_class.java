import java.util.Scanner;

public class Factorial_class {

			public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Enter your input:");
				int n;
				n=input.nextInt();
				int f=1;
				for (int i=0; i<n; i++)
				{
				int j=n-i;
				f=f*j;

			}
				System.out.println("Factorial Value is:"+""+f);
			}
	}