package Secao4_InstrucoesDeControle;

import java.util.Scanner;

public class Analysis {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int aprovados = 0;
		int reprovados = 0;
		int contador=1;
		
		while(contador <= 10) {
			System.out.print("Insira 1 = aprovado 2 = reprovado: ");
			int resultado = input.nextInt();
			if(resultado == 1) {
				aprovados++;
				contador++;
			}
			else if (resultado == 2) {
				reprovados++;
				contador++;
			}
			else {
				System.out.println("Valor incorreto!\nTente Novamente!");
			}
		}
		
		System.out.printf("Total de aprovados: %d%n Total de reprovados: %d%n",aprovados, reprovados);
		if(aprovados > 8 ) {
			System.out.println("Bônus para o instrutor!");
		}
	}
}
