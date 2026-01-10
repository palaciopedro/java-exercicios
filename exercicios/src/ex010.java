import java.util.Scanner;

public class ex010 {

	public static void main(String[] args) {
		
		int h1, h2, gd;
		
		Scanner sc = new Scanner(System.in);
		
		h1 = sc.nextInt();
		h2 = sc.nextInt();
		
		if (h1 < h2) {
			gd = h2 - h1;
		}
		else {
			gd = (24 - h1) + h2;
		}
		
		System.out.println("The game lasted " + gd + " hour(s)");
		
		sc.close();
	}
}
