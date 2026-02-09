package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();

		System.out.print("How many students for course A? ");
		int courseAStudents = sc.nextInt();

		for (int i = 0; i < courseAStudents; i++) {
			a.add(sc.nextInt());
		}

		System.out.print("How many students for course B? ");
		int courseBStudents = sc.nextInt();

		for (int i = 0; i < courseBStudents; i++) {
			b.add(sc.nextInt());
		}

		System.out.print("How many students for course C? ");
		int courseCStudents = sc.nextInt();

		for (int i = 0; i < courseCStudents; i++) {
			c.add(sc.nextInt());
		}
		
		Set<Integer> total = a;
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("Total students: " + total.size());

		sc.close();
	}

}
