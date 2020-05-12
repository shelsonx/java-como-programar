import java.util.Scanner;

public class MaiorMenor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int num1, num2, num3, num4, num5; // p/ armezanar os numeros do usuario
		int maior, menor; //guardar o valor do maior e do menor
		
		System.out.println("Informe o 1° Numero");
		num1 = input.nextInt();//lê um inteiro informado pelo usuário
		
		maior = num1;//inicializa maior com o primeiro numero informado
		menor = num1;//incializa o menor com o primeiro numero informado
		
		System.out.println("Informe o 2° Numero");
		num2 = input.nextInt();
		
		System.out.println("Informe o 3° Numero");
		num3 = input.nextInt();

		System.out.println("Informe o 4° Numero");
		num4 = input.nextInt();
		
		System.out.println("Informe o 5° Numero");
		num5 = input.nextInt();
		
		//verifica o maior numero informado
		if(num2 >= maior) {
			maior = num2;
		}
		
		if(num3 >= maior) {
			maior = num3;
		}
		
		if(num4 >= maior) {
			maior = num4;
		}
		
		if(num5 >= maior) {
			maior = num5;
		}
		
		//verfica o menor numero informado
		if(num2 <= menor) {
			menor = num2;
		}
		
		if(num3 <= menor) {
			menor = num3;
		}
		
		if(num4 <= menor) {
			menor = num4;
		}
		
		if(num4 <= menor) {
			menor = num4;
		}
		
		System.out.println("O menor número é: "+menor);
		System.out.println("O maior número é.: "+maior);
	}
}
