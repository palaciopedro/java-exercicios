package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.LegalPerson;
import entities.NaturalPerson;
import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of tax payers: ");
		int n = sc.nextInt();
		
		List<Person> taxPayers = new ArrayList<>();
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.println("Tax payer #" + (i + 1) + " data:");
			System.out.print("Individual or Company? (i/c) ");
			char type = sc.next().charAt(0);
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Annual income: ");
			double annualIncome = sc.nextDouble();
			
			Person person;
			
			if (type == 'i') {
				System.out.print("Helthcare expenses: ");
				double healthExpenses = sc.nextDouble();
				
				person = new NaturalPerson(name, annualIncome, healthExpenses);
			}
			else {
				System.out.print("Number of employees: ");
				int employeesNumber = sc.nextInt();
				
				person = new LegalPerson(name, annualIncome, employeesNumber);
			}
			
			taxPayers.add(person);
		}
		
		System.out.println();
		
		double totalTaxes = 0.0;
		
		System.out.println("TAXES PAID: ");
		for (Person p : taxPayers) {
			System.out.println(p);
			totalTaxes += p.incomeTax();
		}
		System.out.println();
		
		System.out.print("TOTAL TAXES: $" + String.format("%,.2f", totalTaxes));
		
		sc.close();
	}

}
