package Secao5_InstrucoesDeControleParte2;

public class ImpressaoTriangulosAsteriscosModificado {
	public static void main(String[] args) {
		
		int j = 10;
	
		for(int i = 1; i<=10; i++) {
			//imprime primeiro triangulo a)
			imprimeAsterisco(1,i);
			
			//imprime primeiro triangulo b)
			imprimeEspacos(j);
			imprimeAsterisco(1,j);
			
			//imprime primeiro triangulo c)
			imprimeEspacos(i);
			imprimeEspacos(i);
			imprimeAsterisco(1,j);
			
			//imprime primeiro triangulo d)
			imprimeEspacos(j);
			imprimeAsterisco(1,i);
			
			System.out.println();
			j--;
		}
	}//fim main
	
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
