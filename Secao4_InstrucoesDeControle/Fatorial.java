package Secao4_InstrucoesDeControle;

import java.util.Scanner;

public class Fatorial {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um inteiro positivo: ");
		int numero  = input.nextInt();
		if(numero < 0) {
			System.err.println("Valor negativo incorreto!");
			System.out.close();
		}
		int cont = numero - 1;
		
		double fatorial = numero;
		
		while(cont > 1) {
			fatorial = fatorial * cont;
			System.out.println(cont);
			cont--;
		}
		
		System.out.println(numero+"! é = "+fatorial);
		input.close();
	}
}
