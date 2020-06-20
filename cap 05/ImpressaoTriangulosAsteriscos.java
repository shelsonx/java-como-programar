package Secao5_InstrucoesDeControleParte2;

public class ImpressaoTriangulosAsteriscos {
	public static void main(String[] args) {
		
		for(int i = 1; i<=10; i++) {
			imprimeAsterisco(1,i);
			System.out.println();
		}
		System.out.println();
		
		for(int i = 10; i>=1; i--) {
			imprimeAsterisco(1,i);
			System.out.println();
		}
		
		int j = 1;
		System.out.println();
		for(int i = 10; i >= 1; i--) {
			
			imprimeAsterisco(1,i);
			System.out.println();
			imprimeEspacos(j);
			j++;
		}
		
		j = 9;
		System.out.println();
		for(int i = 1; i <= 10; i++) {
			imprimeEspacos(j);
			imprimeAsterisco(1,i);
			System.out.println();
			j--;
		}
			
	}
	
	private static void imprimeEspacos(int espaco) {
		for(int i = 1; i <= espaco; ++i) {
			System.out.print(' ');
		}
	}
	
	private static void imprimeAsterisco(int inicio, int numero) {
		for(int i = inicio; i <= numero; i++ ) {
			System.out.print("*");
		}
	}
}
