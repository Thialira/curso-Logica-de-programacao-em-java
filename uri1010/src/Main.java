import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Locale.setDefault ( Locale . US );
		Scanner sc = new Scanner(System.in);
		
		int CodProduto1, CodProduto2, qte1, qte2;
		double PrecoUni1, PrecoUni2, valorpago;
		
		CodProduto1 = sc.nextInt();
		qte1 = sc.nextInt();
		PrecoUni1 = sc.nextDouble();
		
		CodProduto2 = sc.nextInt();
		qte2 = sc.nextInt();
		PrecoUni2 = sc.nextDouble();
		
		valorpago = PrecoUni1 * qte1 + PrecoUni2 * qte2;	
				
		System.out.printf("VALOR A PAGAR: R$ %.2f%n",valorpago);		
		
		sc.close();

	}

}
