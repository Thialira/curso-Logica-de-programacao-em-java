import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B,C;
		double Triangulo, Circulo, Trapezio, Quadrado, Retangulo;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		
		Triangulo = A * C / 2;
		Circulo = 3.14159 * Math.pow(C, 2.0);
		Trapezio = C * (B + A) / 2;
		Quadrado = Math.pow(B, 2.0);
		Retangulo = A * B;
		
		System.out.printf("TRIANGULO: %.3f%n",Triangulo);
		System.out.printf("CIRCULO: %.3f%n",Circulo);
		System.out.printf("TRAPEZIO: %.3f%n",Trapezio);
		System.out.printf("QUADRADO: %.3f%n",Quadrado);
		System.out.printf("RETANGULO: %.3f%n",Retangulo);
		
		sc.close();		

	}

}
