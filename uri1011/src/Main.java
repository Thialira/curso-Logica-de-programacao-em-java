import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double volume,raio;
		double pi = 3.14159;
		
		raio = sc.nextDouble();
				
		volume = (double) 4 / 3 * pi * Math.pow(raio, 3);
		
		System.out.printf("VOLUME = %.3f%n",volume);		
		
		sc.close();

	}

}
