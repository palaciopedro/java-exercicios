package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many numbers will you enter? ");
		int n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um número: ");
			int num = sc.nextInt();
			
			vect[i] = num;
		}
		System.out.println();
		
		int counter = 0;
		
		System.out.println("Even numbers: ");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] % 2 == 0) {
				counter += 1;
				System.out.print(vect[i] + " ");
			}
		}
		System.out.println();
		System.out.println();
		
		System.out.println("Quantity of even numbers = " + counter);
		
		sc.close();
	}

}
