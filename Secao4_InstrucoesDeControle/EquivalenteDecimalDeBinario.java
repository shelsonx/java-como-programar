package Secao4_InstrucoesDeControle;

import java.util.Scanner;

/*
 4.31 (Imprimindo o equivalente decimal de um número binário) Escreva um aplicativo que insere um número inteiro que contém somente
0s e 1s (isto é, um número inteiro binário) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divisão para
pegar os dígitos do número binário um de cada vez da direita para a esquerda. No sistema de números decimais, o dígito mais à direita
tem um valor posicional de 1 e o próximo dígito à esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
número decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de número binário, o dígito mais à direita tem um
valor posicional de 1, o próximo dígito à esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
do binário 1.101 é 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
 * */
public class EquivalenteDecimalDeBinario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor = 0;
		int contaDigitos = 0;
		
		System.out.println("Informe um número binário: ");
		int numeroBinario = input.nextInt();
			
		valor = numeroBinario;
		
		if(valor == 0)
			contaDigitos = 1;
		
		while(valor != 0) {
			valor = valor / 10;
			contaDigitos++;
		}
		
		int valorDecimal = 0;
		int contador = 0;
		int incrementaDecimal = 1;
		int incrementaBinario = 1;
		int numeroAtual = 0;
		
		while(contador <= contaDigitos) {
			
			numeroAtual = numeroBinario / incrementaDecimal;
			numeroAtual  = numeroAtual % 10;
			
			if(numeroAtual != 0 && numeroAtual != 1) {
				System.out.println("Não é um número binário!");
				System.out.close();
			}
			valorDecimal += numeroAtual * incrementaBinario;
			
			incrementaDecimal *= 10;
			incrementaBinario *= 2;
			contador++;	
		}
		System.out.println("Equivalente decimal = "+valorDecimal);		
		input.close();
	}
}
