package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student std = new Student();
		
		std.name = sc.nextLine();
		std.score1 = sc.nextDouble();
		std.score2 = sc.nextDouble();
		std.score3 = sc.nextDouble();
		
		System.out.printf("Final grade = %.2f%n", std.finalScore());
		
		if (std.finalScore() >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			System.out.printf("Missing %.2f points", std.missingPoints());
		}
		
		sc.close();
	}

}
