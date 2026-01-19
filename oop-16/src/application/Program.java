package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("How many employees will be registered? ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.printf("Employee #%d:%n", i + 1);
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			while (hasId(list, id)) {
				System.out.print("Already exists an employee with this Id! Try again: ");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			
			System.out.print("Salary: ");
			Double salary = sc.nextDouble();

			Employee employee = new Employee(id, name, salary);
			
			list.add(employee);
			System.out.println();
		}
		
		System.out.print("Enter the employee id that will have a salary increase: ");
		int increaseId = sc.nextInt();
		
		Employee emp = list.stream().filter(employee -> employee.getId() == increaseId).findFirst().orElse(null);
		
		if (hasId(list, increaseId)) {
			System.out.print("Enter the percentage: ");
			double percentage = sc.nextDouble();
			emp.increaseSalary(percentage);
		} else {
			System.out.println("This Id doesn't exist!");
		}
		
		System.out.println();
		System.out.println("List of employees: ");
		for (Employee x : list) {
			System.out.println(x);
		}
		
		sc.close();
	}

	public static boolean hasId(List<Employee> list, int id) {
		Employee emp = list.stream().filter(employee -> employee.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
	
}
