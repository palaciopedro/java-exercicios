import java.util.Scanner;

public class ex016 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		while (x != 0 && y != 0) {
			if (x > 0) {
				if (y > 0) {
					System.out.println("first");
				}
				else {
					System.out.println("fourth");
				}
			}
			else {
				if (y > 0) {
					System.out.println("second");
				}
				else {
					System.out.println("third");
				}
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		
		sc.close();
	}
}
