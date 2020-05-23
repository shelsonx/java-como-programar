package Secao4_InstrucoesDeControle;

import java.util.Scanner;

public class Euler {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Informe um inteiro positivo: ");
		int numero  = input.nextInt();
		if(numero < 0) {
			System.err.println("Valor negativo incorreto!");
			System.out.close();
		}
		
		double euler = equacaoEuler(numero);
		
		System.out.println("Euler = "+euler);
		input.close();
	}
	
	public static final double equacaoEuler(int n_val) {
		double somatorio = 0;
		while(n_val >= 0) {
			somatorio += (1.0 / fatorial(n_val));
			n_val--;
		}
		return somatorio;
	}
	
	public static final double fatorial(int valor) {
		double fat = 1.0;
		while(valor > 0) {
			fat = fat * valor;
			valor--;
		}
		return fat;
	}
}
