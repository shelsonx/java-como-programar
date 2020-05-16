package Secao4_InstrucoesDeControle;

/*
 (Encontre os dois n�meros maiores) Utilizando uma abordagem semelhante �quela do Exerc�cio 4.21,
 encontre os dois maiores valores entre os 10 valores inseridos. 
 
 [Observa��o: voc� s� pode inserir cada n�mero uma �nica vez.]
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
			System.out.println("Informe o "+contador+"� n�mero");
			numeroAtual = input.nextInt();
			
			if(contador == 1) {
				maiorNumero = numeroAtual; //seta maior numero com o primeiro valor informado
				maiorNumero2 = numeroAtual;//seta maiorNumero2 com o primeiro valor informado
			}
			
			if(numeroAtual > maiorNumero) { //depois compara com cada um inserido 
				maiorNumero2 = maiorNumero; //faz uma c�pia do maior at� o momento... (ou seja o segundo maior)
				maiorNumero = numeroAtual; //se for maior adiciona a maiorNumero.
			}
			else {
				
				if(numeroAtual > maiorNumero2) {//verifica se o numero atual � tbm maior anterior
					maiorNumero2 = numeroAtual; //se for, seta como o segundo maior numero
				}
			}
				
			contador++;
		}
		
		System.out.printf("O maior n�mero informado foi: %d%n"
						+ "O Segundo maior n�mero informado foi: %d%n"
				,maiorNumero
				,maiorNumero2);
		
	}
}
