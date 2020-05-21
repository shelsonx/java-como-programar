package Secao4_InstrucoesDeControle;

import java.util.Scanner;

/*
 4.31 (Imprimindo o equivalente decimal de um n�mero bin�rio) Escreva um aplicativo que insere um n�mero inteiro que cont�m somente
0s e 1s (isto �, um n�mero inteiro bin�rio) e imprime seu equivalente decimal. [Dica: utilize os operadores de resto e divis�o para
pegar os d�gitos do n�mero bin�rio um de cada vez da direita para a esquerda. No sistema de n�meros decimais, o d�gito mais � direita
tem um valor posicional de 1 e o pr�ximo d�gito � esquerda um valor posicional de 10, depois 100, depois 1.000 e assim por diante. O
n�mero decimal 234 pode ser interpretado como 4 * 1 + 3 * 10 + 2 * 100. No sistema de n�mero bin�rio, o d�gito mais � direita tem um
valor posicional de 1, o pr�ximo d�gito � esquerda um valor posicional de 2, depois 4, depois 8 e assim por diante. O equivalente decimal
do bin�rio 1.101 � 1 * 1 + 0 * 2 + 1 * 4 + 1 * 8 ou 1 + 0 + 4 + 8 ou 13.]
 * */
public class EquivalenteDecimalDeBinario {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int valor = 0;
		int contaDigitos = 0;
		
		System.out.println("Informe um n�mero bin�rio: ");
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
				System.out.println("N�o � um n�mero bin�rio!");
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
