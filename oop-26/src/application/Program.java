package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Product> products = new ArrayList<>();
		
		System.out.print("Enter file path: ");
		File inputPath = new File(sc.nextLine());
		
		String originPath = inputPath.getParent() + "\\out";
		
		boolean outFolder = new File(originPath).mkdir();
		if (outFolder) {
			System.out.println("Directory '" + (originPath) + "' successfully created!");
		}
		
		try (BufferedReader br = new BufferedReader(new FileReader(inputPath))){
			String line = br.readLine();
			
			while (line != null) {
				String[] item = line.split(",");
				String name = item[0];
				double price = Double.parseDouble(item[1]);
				int quantity = Integer.parseInt(item[2]);
				
				Product product = new Product(name, price, quantity);
				products.add(product);
				
				line = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		String summaryPath = originPath + "\\summary.csv";
		
		try (BufferedWriter bw = new BufferedWriter(new FileWriter(summaryPath))){
			for (Product p : products) {
				bw.write(p.toString() + "\n");
			}
			
			System.out.println("Products added to '" + (summaryPath) + "' successfully!");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
