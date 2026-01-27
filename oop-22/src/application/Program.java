package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		List<Product> products = new ArrayList<>();
 		
		System.out.print("Enter the number of products: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Product #" + (i + 1) + " data:");
			System.out.print("Common, used or imported (c/u/i)? ");
			char tag = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			
			System.out.print("Price: ");
			double price = sc.nextDouble();
			
			Product product;
			
			if (tag == 'c') {
				product = new Product(name, price);
				
				products.add(product);
			}
			else if (tag == 'u') {
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				String dt = sc.next();
				
				LocalDate date = LocalDate.parse(dt, fmt);
		
				product = new UsedProduct(name, price, date);
				
				products.add(product);
			}
			else {
				System.out.print("Custom fee: ");
				double customsFee = sc.nextDouble();
				product = new ImportedProduct(name, price, customsFee);
				
				products.add(product);
			}
		}
		System.out.println();
		
		System.out.println("PRICE TAGS:");
		for (Product p : products) {
			System.out.println(p.priceTag());
		}
		
		sc.close();
	}

}
