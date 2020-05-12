import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um numero.: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O número é Par!");
		}
		
		if(numero % 2 !=0) {
			System.out.println("O número é Ímpar!");
		}
		
		System.out.println("Resto da divisão por 2 é "+numero % 2);
	}
}
