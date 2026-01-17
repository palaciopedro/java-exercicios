package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("How many people will you enter? ");
		int n = sc.nextInt();

		String[] vectName = new String[n];
		int[] vectAge = new int[n];

		for (int i = 0; i < vectName.length; i++) {
			System.out.printf("Person %d data:%n", i + 1);
			System.out.print("Name: ");
			String name = sc.next();
			System.out.print("Age: ");
			int age = sc.nextInt();

			vectName[i] = name;
			vectAge[i] = age;
		}

		int olderAge = vectAge[0];
		String olderName = vectName[0];

		for (int i = 0; i < vectAge.length; i++) {
			if (vectAge[i] > olderAge) {
				olderAge = vectAge[i];
				olderName = vectName[i];
			}
		}

		System.out.print("Older person: " + olderName);

		sc.close();
	}
}
