package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("How many users will be created? ");
		int n = sc.nextInt();
		sc.nextLine();

		Person[] vect = new Person[n];

		for (int i = 0; i < vect.length; i++) {
			System.out.printf("User %d data:%n", i + 1);

			System.out.print("Name: ");
			String name = sc.nextLine();

			System.out.print("Age: ");
			int age = sc.nextInt();

			System.out.print("Height: ");
			double height = sc.nextDouble();
			sc.nextLine();

			vect[i] = new Person(name, age, height);
		}

		double sum = 0.0;
		int under16 = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				under16 += 1;
			}

			sum += vect[i].getHeight();
		}
		double averageHeight = sum / vect.length;

		double underPercentage = (double) under16 / vect.length * 100;
		
		System.out.println();
		System.out.printf("Average height: %.2f%n", averageHeight);
		System.out.println("People under 16 years old: " + String.format("%.1f", underPercentage) + "%");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}
}
