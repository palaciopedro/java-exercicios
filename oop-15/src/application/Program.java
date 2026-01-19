package application;

import java.util.Scanner;

import util.Rooms;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rooms[] vect = new Rooms[10];
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.printf("Rent #%d%n", i + 1);
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.next();
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			System.out.println();
			sc.nextLine();
			
			vect[roomNumber] = new Rooms(name, email);
		}
		
		System.out.println("Busy rooms:");
		
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d: %s, %s%n", i, vect[i].getName(), vect[i].getEmail());
			}
		}
			
		sc.close();
	}

}
