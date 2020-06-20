package Secao5_InstrucoesDeControleParte2;

import java.util.Scanner;

//calculo de juros composto com for
public class CalculoJurosComposto {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.printf("%s%n%s","Calculadora de juros composto."
				,"Informe o valor para calcular: ");
		
		double principal = input.nextDouble();
		
		double taxa = 0.05;
		for(int i = 1; i <= 6; i++) {
			calculaJurosComposto(taxa,principal);
			taxa += 0.01;
			System.out.println();
		}
		
		input.close();
	}
	
	public static void calculaJurosComposto(double taxa,double principal) {
		double quantia;// quantia em deposito ao fim de cada ano
		
		//exibe cabeçalhos
		System.out.printf("%s%30s%20s %n","Ano","Quantia em depósito","Taxa de juros");
		//calcula a quantidade de depósito para cada 1 dos 10 anos
		for(int ano = 1; ano <= 10; ++ano) {
			//calcula a quantidade de depósito a cada ano
			quantia = principal * Math.pow(1.0 + taxa, ano);
			//exibe a quantiade de depósito a cada ano
			System.out.printf("%2d%,25.2f%20.2f%n",ano,quantia,taxa);
		}
	}
}
