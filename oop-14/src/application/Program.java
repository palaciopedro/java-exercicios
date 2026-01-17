package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many people will be registered? ");
		int n = sc.nextInt();
		
		Person[] vect = new Person[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Person %d height: ", i + 1);
			double height = sc.nextDouble();
			System.out.printf("Person %d gender: ", i + 1);
			char gender = sc.next().charAt(0);
			
			vect[i] = new Person(height, gender);
		}
	
		double shortHeight = vect[0].getHeight();
		double bigHeight = vect[0].getHeight();
		double sumFemHeight = 0.0;
		int femNumber = 0;
		int manNumber = 0;
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i].getHeight() < shortHeight) {
				shortHeight = vect[i].getHeight();
			}
			
			if (vect[i].getHeight() > bigHeight) {
				bigHeight = vect[i].getHeight();
			}
			
			if (vect[i].getGender() == 'F') {
				sumFemHeight += vect[i].getHeight();
				femNumber += 1;
			}
			
			if (vect[i].getGender() == 'M') {
				manNumber += 1;
			}
		}
		
		double averageFemHeight = sumFemHeight / femNumber;
		
		System.out.println();
		System.out.println("Shortest height = " + shortHeight);
		System.out.println("Biggest height = " + bigHeight);
		System.out.printf("Average female height = %.2f%n", averageFemHeight);
		System.out.println("Number of men = " + manNumber);
		
		sc.close();
	}

}
