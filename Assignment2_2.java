import java.util.Scanner;

public class Assignment2_2
{
	public static void main(String[]args)
	{
		Scanner input = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		Scanner input3 = new Scanner(System.in);

		System.out.println("Please enter in your first item: ");
		String item1 = input.nextLine();
		System.out.println("Please enter the quantity for this item: ");
		int quantity1 = input.nextInt();
		System.out.println("Please enter the price of your first item: ");
		float price1 = input.nextFloat();
		float total1 = quantity1*price1;

		// This asks for the inputs of the first item

		System.out.println("Please enter in your second item: ");
		String item2 = input2.nextLine();
		System.out.println("Please enter the quantity for this item: ");
		int quantity2 = input2.nextInt();
		System.out.println("Please enter the price of your second item: ");
		float price2 = input2.nextFloat();
		float total2=quantity2*price2;


		//This asks for the inputs of the second item

		System.out.println("Please enter in your third item: ");
		String item3 = input3.nextLine();
		System.out.println("Please enter the quantity for this item: ");
		int quantity3 = input3.nextInt();
		System.out.println("Please enter the price of your third item: ");
		float price3 = input3.nextFloat();
		float total3=quantity3*price3;

		double total=total1+total2+total3;
		double tax = total*(.0625);
		double totaltax = total+tax;

		System.out.printf("\nYour Bill");
		System.out.printf("\n\nItem");
		System.out.printf("%28s %11s %11s", "Quantity","Price","Total");
		
		System.out.printf("\n%-30s", item1);
		System.out.printf("%-10d", quantity1);
    	System.out.printf("%-10.2f", price1);
    	System.out.printf("  " + "%-10.2f", total1);

    	System.out.printf("\n%-30s", item2);
    	System.out.printf("%-10d", quantity2);
    	System.out.printf("%-10.2f", price2);
    	System.out.printf("  " + "%-10.2f", total2);

    	System.out.printf("\n%-30s", item3);
    	System.out.printf("%-10d", quantity3);
    	System.out.printf("%-10.2f", price3);
    	System.out.printf("  " + "%-10.2f", total3);

    	System.out.printf("\n\n\nSubtotal %47.2f", total);
    	System.out.printf("\n6.25 %s sales tax %39.2f", "%", tax);
    	System.out.printf("\nTotal %50.2f", totaltax);

    	System.out.printf("\n");



		

	}
}