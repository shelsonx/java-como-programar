package Secao4_InstrucoesDeControle;

/*
4.32 (Padr�o de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instru��es de sa�da
System.out.print("* ");
System.out.print(" ");
System.out.println();
para exibir o padr�o de tabuleiro de damas a seguir. Uma chamada de m�todo System.out.println sem argumentos faz com que o programa
gere sa�da de um �nico caractere de nova linha. [Dica: as instru��es de repeti��o s�o requeridas.]
 * */
public class TabuleiroDeDamaAsteriscos {
	public static void main(String[] args) {
		int linha = 1;
		int multiplo = 8;
		int multiplo2 = 8;
		
		while(linha <= 64) {
			System.out.print("* ");	
			
			if(linha == multiplo) {
				System.out.println();
				multiplo +=  8;
			}
			
			if(linha == multiplo2) {
				System.out.print(" ");
				multiplo2 += 16;
			}
			linha++;
		}
	}
}
