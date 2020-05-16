package Secao4_InstrucoesDeControle;

/*
 (Encontre os dois números maiores) Utilizando uma abordagem semelhante àquela do Exercício 4.21,
 encontre os dois maiores valores entre os 10 valores inseridos. 
 
 [Observação: você só pode inserir cada número uma única vez.]
 * */

import java.util.Scanner;
public class EncontraOsDoisNumerosMaiores {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maiorNumero = 0;
		int maiorNumero2 = 0;
		int contador = 1;
		int numeroAtual = 0;
	
		while(contador <=10 ) {
			System.out.println("Informe o "+contador+"º número");
			numeroAtual = input.nextInt();
			
			if(contador == 1) {
				maiorNumero = numeroAtual; //seta maior numero com o primeiro valor informado
				maiorNumero2 = numeroAtual;//seta maiorNumero2 com o primeiro valor informado
			}
			
			if(numeroAtual > maiorNumero) { //depois compara com cada um inserido 
				maiorNumero2 = maiorNumero; //faz uma cópia do maior até o momento... (ou seja o segundo maior)
				maiorNumero = numeroAtual; //se for maior adiciona a maiorNumero.
			}
			else {
				
				if(numeroAtual > maiorNumero2) {//verifica se o numero atual é tbm maior anterior
					maiorNumero2 = numeroAtual; //se for, seta como o segundo maior numero
				}
			}
				
			contador++;
		}
		
		System.out.printf("O maior número informado foi: %d%n"
						+ "O Segundo maior número informado foi: %d%n"
				,maiorNumero
				,maiorNumero2);
		
	}
}
