package main;

import java.util.Scanner;

public class Converter {

	public static Scanner scan = new Scanner (System.in); 
	
	
	public static void main(String[] args) {
		int menuSelection = 0, holder = 0;
		Converter conv = new Converter();
		
		System.out.println("Please select an option:");
		System.out.println("1. Cups to Teaspoons");
		System.out.println("2. Miles to Kilometers");
		System.out.println("3. US Gallons to Imperial Gallons");
		System.out.println("4. Quit");


		while (menuSelection != 4) {
			menuSelection = scan.nextInt();


			if (menuSelection == 1) {
				System.out.println("Enter how many Cups you would like to convert: ");
				holder = scan.nextInt();
				System.out.println(holder + " Cups equals " +conv.cupsToTeaspoons(holder) +
						" Teaspoons");
			} else if (menuSelection == 2) {
				System.out.println("Enter how many miles you would like to convert: ");
				holder = scan.nextInt();
				System.out.println(holder + " Miles equals to " +conv.milesToKilometers(holder) +
						" Kilometers");
			} else if (menuSelection == 3) {
				System.out.println("Enter how many US Gallons you would like to convert: ");
				holder = scan.nextInt();
				System.out.println(holder + " US Gallons equals to " +conv.usGallonsToImperialGallons(holder) +
						" Imperial Gallons");
			}
				
		}
	}
	
	public int cupsToTeaspoons(int cups) {
		
		return cups * 48;
	}
	
	public double milesToKilometers (int miles) {
		return (double) (miles * 1.609);
	}

	public double usGallonsToImperialGallons (int usGallons) {
		return (double) (usGallons / 1.201);
	}
}
