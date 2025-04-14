package taxes;

import java.util.Scanner;

public class Main {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		
		
		int option;
		
		do {
			System.out.println("Choose the type of product you want to consult the tax amount:");
			System.out.println("Enter 1 - Feeding");
			System.out.println("Enter 2 - Health and well-being");
			System.out.println("Enter 3 - Clothing");
			System.out.println("Enter 4 - Culture");
			System.out.println("Enter 0 - Exit");
			option = sc.nextInt();
			sc.nextLine();
			
			switch(option) {
				case 1 -> feedingTax().amountOfTaxes();
				case 2 -> healthWellBeingTax().amountOfTaxes();
				case 3 -> clothingTax().amountOfTaxes();
				case 4 -> cultureTax().amountOfTaxes();
				case 0 -> System.out.println("Leaving");
			    default -> System.out.println("Invalid option.");
			}
		}while(option!=0);
		
		sc.close();
	}
	
	public static Products feedingTax() {
		System.out.println("Enter value of product: ");
		double valueFeeding = sc.nextDouble();
		return new Feeding(valueFeeding);
	}
	
	public static Products healthWellBeingTax() {
		System.out.println("Enter value of product: ");
		double valuehealthWellBeing = sc.nextDouble();
		return new HealthWellBeing(valuehealthWellBeing);
	}
	
	public static Products clothingTax() {
		System.out.println("Enter value of product: ");
		double valueclothing = sc.nextDouble();
		return new Clothing(valueclothing);
	}
	
	public static Products cultureTax() {
		System.out.println("Enter value of product: ");
		double valueculture = sc.nextDouble();
		return new Culture(valueculture);
	}


}
