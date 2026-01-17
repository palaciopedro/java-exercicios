package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many students will be registered? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		Student[] vect = new Student[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.printf("Enter the name, first and second grade of the %d student:%n", i + 1);
			String name = sc.nextLine();
			double grade1 = sc.nextDouble();
			double grade2 = sc.nextDouble();
			sc.nextLine();
			
			vect[i] = new Student(name, grade1, grade2);
		}
		System.out.println();
		
		System.out.println("Approved students: ");
		for (int i = 0; i < vect.length; i++) {
			double averageGrade = (vect[i].getGrade1() + vect[i].getGrade2()) / 2;
			if (averageGrade >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}
		
		sc.close();
	}

}
