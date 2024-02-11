import java.util.Scanner;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
Scanner sc = new Scanner (System.in);
	
	Double pi = 3.14159;



	System.out.println("Informe o raio do círculo: ");
	Double raio = sc.nextDouble();
	Double RaioQuadrado;
	RaioQuadrado = Math.pow(raio, 2);
	Double area = pi*RaioQuadrado;
	System.out.printf("A Area do círculo é %.4f", area);
	}

}
