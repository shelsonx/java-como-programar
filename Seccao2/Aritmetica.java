import java.util.Scanner;

public class Aritmetica {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		int soma, diferenca, produto, divisao;
		
		System.out.println("Informe um numero inteiro.: ");
		a = input.nextInt();
		
		System.out.println("Informe o segundo numero inteiro.: ");
		b = input.nextInt();
		
		soma = a + b;
		diferenca = a - b;
		produto = a * b;
		divisao = a / b;
		
		System.out.printf("%d + %d = %d\n", a, b, soma);
		System.out.printf("%d - %d = %d\n", a, b, diferenca);
		System.out.printf("%d * %d = %d\n", a, b, produto);
		System.out.printf("%d / %d = %d\n", a, b, divisao);
	}
}
