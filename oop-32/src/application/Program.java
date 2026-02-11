package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter full file path: ");
		String path = sc.nextLine();
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			List<Employee> employees = new ArrayList<>();
		
			while (line != null) {
				
				String[] fields = line.split(",");
				
				employees.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				
				line = br.readLine();
			}
			
			System.out.print("Enter salary: ");
			double minSalary = sc.nextDouble();
			System.out.println("Email of people whose salary is more than " + String.format("%.2f", minSalary) + ":");
			
			List<String> emails = employees.stream()
					.filter(e -> e.getSalary() > minSalary)
					.map(e -> e.getEmail())
					.sorted((e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase()))
					.toList();
			
			emails.forEach(System.out::println);
			
			double salarySum = employees.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0, (x, y) -> x + y);
			
			System.out.print("Sum of salary of people whose name starts with 'M': " + String.format("%,.2f", salarySum));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		sc.close();
	}

}
