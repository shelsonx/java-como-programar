package Secao4_InstrucoesDeControle;

import java.util.Scanner;

/*
 	(Localize o maior n�mero) O processo de localizar o maior valor � muito utilizado em aplicativos de computador. Por exemplo, um
programa que determina o vencedor de uma competi��o de vendas inseriria o n�mero de unidades vendidas por cada vendedor. O vendedor
que vende mais unidades ganha a competi��o. Escreva um programa em pseudoc�digo e, ent�o, um aplicativo Java que aceita como entrada
uma s�rie de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as tr�s vari�veis a seguir:
a) counter: um contador para contar at� 10 (isto �, monitorar quantos n�meros foram inseridos e determinar quando todos os 10 n�meros
foram processados).
b) number: o inteiro mais recentemente inserido pelo usu�rio.
c) largest: o maior n�mero encontrado at� agora.
 * */
public class LocalizaMaiorNumero {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = 0;
		int contador = 1;
		int numeroAtual = 0;
	
		while(contador <=10 ) {
			System.out.println("Informe o "+contador+"� n�mero");
			numeroAtual = input.nextInt();
			
			if(contador == 1)
				maiorNumero = numeroAtual; //seta maior numero com o primeiro valor informado
			
			if(numeroAtual >= maiorNumero) { //depois compara com cada um inserido 
				maiorNumero = numeroAtual; //se for maior adiciona a maiorNumero.
			}
			contador++;
		}
		
		System.out.printf("O maior n�mero informado foi: %d%n",maiorNumero);
	}
}
