import java.util.Random;
import java.util.Scanner;

public class Cirks {
	public static void main(String[] args) {
		int skaitlis, reizes;
		Scanner scan = new Scanner(System.in);
		System.out.println("Cik reizes mest kauli�u?");
		reizes = scan.nextInt();
		Random rand = new Random();
		
		for(int i=1; i<=reizes; i++) {
		skaitlis = rand.nextInt(6)+1;
		System.out.println("Uzkrita skaitlis: "+skaitlis);
		}
	}

}
