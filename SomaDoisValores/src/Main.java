import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
Scanner sc = new Scanner (System.in);

System.out.println("Digite dois valores para realizar a soma: ");
double a = sc.nextDouble();
double b = sc.nextDouble();
double c = a + b;

System.out.printf("O valor da soma é: %.0f",c);
	}

}
