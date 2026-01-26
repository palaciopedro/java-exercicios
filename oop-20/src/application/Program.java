package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Email: ");
		String email = sc.next();
		
		System.out.print("Date of birth (DD/MM/YYYY): ");
		String db = sc.next(); 
		LocalDate dateBirth = LocalDate.parse(db, fmt);
		
		System.out.println();
		System.out.println("Enter order data:");
		System.out.print("Status: ");
		String status = sc.next();
		
		System.out.print("How many items to this order? ");
		int n = sc.nextInt();
		
		Order order = new Order(LocalDateTime.now(), OrderStatus.valueOf(status), new Client(name, email, dateBirth));
		
		System.out.println();
		for (int i = 0; i  < n; i++) {
			System.out.println("Enter the #" + (i + 1) + " item data:");
			
			System.out.print("Product name: ");
			String productName = sc.next();
			
			System.out.print("Product price: ");
			double productPrice = sc.nextDouble();
			
			System.out.print("Quantity: ");
			int quantity = sc.nextInt();
			
			OrderItem item = new OrderItem(quantity, productPrice, new Product(productName));
			
			order.addItem(item);
		}
		System.out.println();
		
		System.out.println("ORDER SUMMARY: ");
		System.out.println(order);
		
		sc.close();
	}

}
