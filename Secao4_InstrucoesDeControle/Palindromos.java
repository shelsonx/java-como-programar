package Secao4_InstrucoesDeControle;

import java.util.Scanner;

/*
4.30 (Pal�ndromos) Um pal�ndromo � uma sequ�ncia de caracteres que � lida da esquerda para a direita ou da direita para a esquerda. Por
exemplo, cada um dos seguintes inteiros de cinco d�gitos � um pal�ndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que l� em
um inteiro de cinco d�gitos e determina se ele � ou n�o um pal�ndromo. Se o n�mero n�o for de cinco d�gitos, exiba uma mensagem de
erro e permita que o usu�rio insira um novo valor.
*/

//OBS: Est� solu��o se propoem a n�o usar recursos mais avan�ados do que os j� aprendidos at� o momento ou
// usar os recurso da linguagem como array, array.lenth e etc.
public class Palindromos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int alga1, alga2, alga3, alga4, alga5;
		
		int contaDigitos = 0, valor = 0;
		
		System.out.println("Informe um inteiro de 5 d�gitos: ");
		int inteiro = input.nextInt();
		valor = inteiro;
		
				
		if(valor == 0)
			contaDigitos = 1;
		
		while(valor != 0) {
			valor = valor / 10;
			contaDigitos++;
		}
		
		if(contaDigitos != 5) {
			System.out.println("Valor inv�lido!");
			main(null);
		}
		else {
			alga5 = inteiro % 10;
			
			alga4 = inteiro / 10;
			alga4 = alga4 % 10;
			
			alga3 = inteiro / 100;
			alga3 = alga3 % 10;
			
			alga2 = inteiro / 1000;
			alga2 = alga2 % 10;
			
			alga1 = inteiro / 10000;
			alga1 = alga1 % 10;
			
			if(alga1 == alga5 && alga2 == alga4) {
				System.out.println("� um pal�ndromo!");
			}
			else {
				System.out.println("N�o � um pal�ndromo!");
			}
		}
		input.close();
	}
}
