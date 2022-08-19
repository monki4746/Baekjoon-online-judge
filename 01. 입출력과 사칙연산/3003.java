import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int king = 1 - sc.nextInt();
		int queen = 1 - sc.nextInt();
		int rook = 2 - sc.nextInt();
		int bishop = 2 - sc.nextInt();
		int night = 2 - sc.nextInt();
		int pawn= 8 - sc.nextInt();
		
		
		sc.close();
		
		System.out.println(king + " " + queen + " "+ rook + " "+ bishop + " " + night + " "+ pawn );
		
	}
}
