package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many values will each vector have? ");
		int n = sc.nextInt();
		
		int[] vectA = new int[n];
		int[] vectB = new int[n];
		int[] vectC = new int[n];
		
		System.out.println("Enter vector A values: ");
		for (int i = 0; i < vectA.length; i++) {
			int num = sc.nextInt();
			
			vectA[i] = num; 
		}
		
		System.out.println("Enter vector B values: ");
		for (int i = 0; i < vectB.length; i++) {
			int num = sc.nextInt();
			
			vectB[i] = num; 
			
			vectC[i] = vectA[i] + vectB[i];
		}
		
		System.out.println("Resultant vector: ");
		for (int i = 0; i < vectC.length; i++) {
			System.out.println(vectC[i]);
		}
		
		sc.close();
	}

}
