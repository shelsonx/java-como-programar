import java.util.Scanner;

public class ImparPar {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;
		
		System.out.println("Informe um numero.: ");
		numero = entrada.nextInt();
		
		if(numero % 2 == 0) {
			System.out.println("O n�mero � Par!");
		}
		
		if(numero % 2 !=0) {
			System.out.println("O n�mero � �mpar!");
		}
		
		System.out.println("Resto da divis�o por 2 � "+numero % 2);
	}
}
