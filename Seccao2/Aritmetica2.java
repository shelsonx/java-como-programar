import java.util.Scanner;
/*
 *Programa l� 3 inteiros e exibe a soma, media, produto e o maior e menor numero 
 * */
public class Aritmetica2 {
	public static void main(String[] args) {
		//Cria um Scanner para l� a entrada do usu�rio
		Scanner input = new Scanner(System.in);
		int a, b, c;//3 numero inteiros
		int soma, media, produto, maior, menor;// armazenar os resultados de cada opeca��o
		
		System.out.println("Infome o primeiro numero inteiro");
		a = input.nextInt();
		
		maior = a;//inicializa maior com o primeiro numero digitado pelo usuario
		menor = a;//inicializa menor com o primeiro numero digitado pelo usuario
		
		System.out.println("Infome o segundo numero inteiro");
		b = input.nextInt();
		
			if(b >= maior) { //verifica se o segundo numero digitado � maior q o primeiro
				maior = b; // se for verdadeiro troca o valor de maior
			}
			
			if(b <= menor) {
				menor = b;
			}
		
		System.out.println("Infome o terceiro numero inteiro");
		c = input.nextInt();
		
			if(c >= maior) {
				maior = c;
			}
			
			if(c <= menor) {
				menor = c;
			}
		
		soma = a + b + c;
		produto = a * b * c;
		media = soma / 3;
		
		
		//System.out.printf("Soma.: %d\n",soma);
		//System.out.printf("Produto.: %d\n",produto);
		//System.out.printf("M�dia.: %d\n",media);
		System.out.printf("Maior.: %d\n",maior);
		System.out.printf("Menor.: %d\n",menor);
		
	}//fime do m�todo main
}//fim do programa
