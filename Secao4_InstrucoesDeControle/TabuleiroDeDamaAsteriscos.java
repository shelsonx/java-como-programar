package Secao4_InstrucoesDeControle;

/*
4.32 (Padrão de tabuleiro de damas de asteriscos) Escreva um aplicativo que utiliza apenas as instruções de saída
System.out.print("* ");
System.out.print(" ");
System.out.println();
para exibir o padrão de tabuleiro de damas a seguir. Uma chamada de método System.out.println sem argumentos faz com que o programa
gere saída de um único caractere de nova linha. [Dica: as instruções de repetição são requeridas.]
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
