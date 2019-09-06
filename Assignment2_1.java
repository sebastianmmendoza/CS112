import java.util.Scanner;

public class Assignment2_1
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Double n, r, guess;

		System.out.println("Please enter a positive number to compute it's square root: ");
		n = input.nextDouble();

		guess = n/2;

		r = n / guess;
		guess = (guess + r) / 2.0;

		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;
		
		r = n / guess;			
		guess = (guess + r) / 2.0;

		System.out.printf("The square root of %.2f is approximately: %.2f\n", n, guess);
	}
}
