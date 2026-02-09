package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.LogEntry;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter file full path: ");
		String path = sc.nextLine();
		
		Set<LogEntry> set = new HashSet<>();

		try (BufferedReader br = new BufferedReader(new FileReader(path))){
			
			String line = br.readLine();
			
			while (line != null) {
				String[] fields = line.split(" ");
				
				LogEntry logEntry = new LogEntry(fields[0], Instant.parse(fields[1]));
				
				set.add(logEntry);
				
				line = br.readLine();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Total users: " + set.size());
		
		sc.close();
	}

}
