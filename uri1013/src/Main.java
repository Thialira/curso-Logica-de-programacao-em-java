import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, k,t;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		
		k = (A + B + Math.abs(A - B)) / 2;
		
		t = (k + C + Math.abs(k - C)) / 2;
		
		System.out.println(t + " eh o maior");
		
		sc.close();

	}

}
