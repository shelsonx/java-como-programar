package Secao4_InstrucoesDeControle;

import java.util.Scanner;

public class QuadradoDeAsteriscos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 0;
		String espaco = "";
		
	
		System.out.println("Informe o tamanho do lado do quadrado: ");
		int lado = input.nextInt();
		
			
		 if(lado >=1 && lado <= 20) {
			int tamanhoEspaco = (lado * 2) - 3;			
			//espaco = espaco.repeat(tamanhoEspaco);
			while(contador < lado ) {
				System.out.print("* ");
				contador++;
			}
			
			contador = 2;
			
			while(contador < lado) {
				System.out.printf("%n*%"+tamanhoEspaco+"s*",espaco);
				contador++;
			}
			
			System.out.println();
			
			contador = 0;
			while(contador < lado ) {
				if(lado !=1)
					System.out.print("* ");
				contador++;
			}
		}
		else {
			System.out.printf("Valor inválido!%n...%n");
		}		
		input.close();
	}
}
