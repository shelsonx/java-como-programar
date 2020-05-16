package Secao4_InstrucoesDeControle;

import java.util.Scanner;

/*
 	(Localize o maior número) O processo de localizar o maior valor é muito utilizado em aplicativos de computador. Por exemplo, um
programa que determina o vencedor de uma competição de vendas inseriria o número de unidades vendidas por cada vendedor. O vendedor
que vende mais unidades ganha a competição. Escreva um programa em pseudocódigo e, então, um aplicativo Java que aceita como entrada
uma série de 10 inteiros e determina e imprime o maior dos inteiros. Seu programa deve utilizar pelo menos as três variáveis a seguir:
a) counter: um contador para contar até 10 (isto é, monitorar quantos números foram inseridos e determinar quando todos os 10 números
foram processados).
b) number: o inteiro mais recentemente inserido pelo usuário.
c) largest: o maior número encontrado até agora.
 * */
public class LocalizaMaiorNumero {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = 0;
		int contador = 1;
		int numeroAtual = 0;
	
		while(contador <=10 ) {
			System.out.println("Informe o "+contador+"º número");
			numeroAtual = input.nextInt();
			
			if(contador == 1)
				maiorNumero = numeroAtual; //seta maior numero com o primeiro valor informado
			
			if(numeroAtual >= maiorNumero) { //depois compara com cada um inserido 
				maiorNumero = numeroAtual; //se for maior adiciona a maiorNumero.
			}
			contador++;
		}
		
		System.out.printf("O maior número informado foi: %d%n",maiorNumero);
	}
}
