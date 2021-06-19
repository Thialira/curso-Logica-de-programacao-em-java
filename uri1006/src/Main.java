import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale . setDefault ( Locale . US );
		Scanner sc = new Scanner(System.in);
		
		double NotaA, NotaB, NotaC, PesoA = 2, PesoB = 3, PesoC = 5, MediaP;
		
		NotaA = sc.nextDouble();
		NotaB = sc.nextDouble();
		NotaC = sc.nextDouble();
		
		MediaP = (NotaA * 2 + NotaB * 3 + NotaC * 5) / (PesoA + PesoB + PesoC);
		
		System.out.printf("MEDIA = %.1f%n",MediaP);	
		
		sc.close();

	}

}