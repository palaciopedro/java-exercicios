package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Program {

	public static void main(String[] args) {
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow that's awesome!");
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		LocalDateTime moment1 = LocalDateTime.parse("26/01/2026 11:00:10", fmt);
		
		Post p1 = new Post(moment1, "Traveling to New Zealand", "I'm going to visit this wonderful country!", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.out.println(p1);
	}

}
