package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		
		double[] vect = new double[n];
		double sum = 0.0;
		
		for (int i=0; i<vect.length; i++) {
			System.out.print("Enter a number: ");
			double number = sc.nextDouble();
			
			vect[i] = number;
			sum += vect[i];
		}
		
		double average = sum / vect.length;
		
		System.out.println();
		System.out.print("Values: ");
		for (int i=0; i<vect.length; i++) {
			System.out.printf("%.2f ", vect[i]);
		}
		System.out.println();
		System.out.printf("Sum = %.2f%n", sum);
		System.out.printf("Average = %.2f", average);
		
		sc.close();
	}

}
