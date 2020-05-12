package Secao4_InstrucoesDeControle;

import java.util.Scanner;

public class ClassAverageSentinela {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contador = 0;
		int total=0;
		
		
		System.out.print("Informe a nota ou -1 para finalizar: ");
		int nota = input.nextInt();
		
		while(nota != -1) {
			total = total + nota;
			contador = contador + 1;
			System.out.print("Informe a nota ou -1 para finalizar: ");
			nota = input.nextInt();
		}
		
		if(contador > 0) {
			double media = (double) total / contador;
			System.out.printf("Total das notas: %d%n"
							+"Média das notas: %.2f%n"	
					,total,media);
		}
		else 
			System.out.println("Nenhuma nota foi inserida!");
	}
}
