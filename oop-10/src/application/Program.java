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
		double biggest = 0.0;
		int position = 0;
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Enter a number: ");
			double num = sc.nextDouble();	
			vect[i] = num;
			
			if (vect[i] > biggest) {
				biggest = vect[i];
				position = i;
			}
		}
		System.out.println();
		
		System.out.printf("Biggest number = %.1f%n", biggest);
		System.out.println("Biggest number position = " + position);
		
		sc.close();
	}

}
