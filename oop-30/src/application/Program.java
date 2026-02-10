package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the file path: ");
		String path = sc.nextLine();

		Map<String, Integer> votes = new LinkedHashMap<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();

			while (line != null) {
				String[] fields = line.split(",");

				if (!votes.containsKey(fields[0])) {
					votes.put(fields[0], Integer.parseInt(fields[1]));
				} else {
					int votesNumber = votes.get(fields[0]) + Integer.parseInt(fields[1]);
					
					votes.put(fields[0], votesNumber);
				}

				line = br.readLine();
			}

			for (String name : votes.keySet()) {
				System.out.println(name + ": " + votes.get(name));
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}


		sc.close();
	}

}
