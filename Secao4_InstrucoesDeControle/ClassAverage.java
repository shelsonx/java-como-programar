package Secao4_InstrucoesDeControle;

import java.util.Scanner;

public class ClassAverage {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int contadorDeNotas=1;
		
		while(contadorDeNotas<=10) {
			System.out.print("Informe a média: ");
			int nota = input.nextInt();
			total = (int) intRangeCheck(total);
			total = total + nota;
			contadorDeNotas = contadorDeNotas + 1;
		}
		
		int average = total / 10;
		
		System.out.printf("Total de notas = %d%n",total);
		System.out.printf("Média das notas = %d%n",average);
	}
	
	public static long intRangeCheck(long value) {
		  if ((value < Integer.MIN_VALUE) || (value > Integer.MAX_VALUE)) {
		    throw new ArithmeticException("Integer overflow");
		  }
		  return value;
		}
}
