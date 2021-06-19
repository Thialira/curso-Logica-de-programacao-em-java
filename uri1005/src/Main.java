import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale . setDefault ( Locale . US );
		Scanner sc = new Scanner(System.in);
		
		double NotaA, NotaB, PesoA = 3.5, PesoB = 7.5, MediaP;
		
		NotaA = sc.nextDouble();
		NotaB = sc.nextDouble();
		
		MediaP = (PesoA * NotaA + PesoB * NotaB) / (PesoA + PesoB);
			
		System.out.printf("MEDIA = %.5f%n",MediaP);
				
		sc.close();		
	}

}