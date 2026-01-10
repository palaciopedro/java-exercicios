import java.util.Scanner;

public class ex001 {
	
	public static void main(String[] args) {
		
		int x, y, z;
		
		Scanner sc = new Scanner(System.in);
		
		x = sc.nextInt();
		y = sc.nextInt();
		z = x + y;
		
		System.out.println("SUM = " + z);
		
		sc.close();
	}
}
