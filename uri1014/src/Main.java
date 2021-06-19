import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault (Locale.US);
		Scanner sc = new Scanner(System.in);
	
		int Dist;
		double Tc, consumo;
		
		Dist = sc.nextInt();
		Tc = sc.nextDouble();
		
		consumo = Dist / Tc;
		
		System.out.printf("%.3f km/l%n",consumo);
			
		sc.close();
	
	}
}
