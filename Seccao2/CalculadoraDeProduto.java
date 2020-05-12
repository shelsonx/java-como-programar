import java.util.Scanner;
//Exercicio 2.6 Product Java
//calcula o produto de 3 inteiros
public class CalculadoraDeProduto {
	public static void main(String[] args) {
		//Cria um Scanner para obter a entrada apartir da janela de comando
		Scanner input = new Scanner(System.in);
		int x;//primeiro numero inserido pelo usuário
		int y;//segundo numero inserido pelo usuário
		int z; //terceiro numero inserido pelo usuario
		int result;//produto dos 3 inteiros
		
		//solicita o primeiro interio para o usuario
		System.out.println("Informe o primeiro numero inteiro.: ");
		x = input.nextInt();//lê o numero digitado pelo usuario
		
		//solicita o segundo inteiro para o usuario
		System.out.println("Informe o segundo numero inteiro.: ");
		y = input.nextInt();//lê o numero digitado pelo usuario
		
		//solicitado o terceiro inteiro para o usuario
		System.out.println("Informe o terceiro numero inteiro.: ");
		z = input.nextInt();//lê o numero digitado pelo usuario
		
		//calcula o produto e armazena o resultado em result
		result = x * y * z;
		
		//exibe o resultado no prompt
		System.out.printf("Product is.: %d", result);		
	}
}
