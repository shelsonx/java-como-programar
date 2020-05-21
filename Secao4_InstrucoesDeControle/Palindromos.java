package Secao4_InstrucoesDeControle;

import java.util.Scanner;

/*
4.30 (Palíndromos) Um palíndromo é uma sequência de caracteres que é lida da esquerda para a direita ou da direita para a esquerda. Por
exemplo, cada um dos seguintes inteiros de cinco dígitos é um palíndromo: 12321, 55555, 45554 e 11611. Escreva um aplicativo que lê em
um inteiro de cinco dígitos e determina se ele é ou não um palíndromo. Se o número não for de cinco dígitos, exiba uma mensagem de
erro e permita que o usuário insira um novo valor.
*/

//OBS: Está solução se propoem a não usar recursos mais avançados do que os já aprendidos até o momento ou
// usar os recurso da linguagem como array, array.lenth e etc.
public class Palindromos {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int alga1, alga2, alga3, alga4, alga5;
		
		int contaDigitos = 0, valor = 0;
		
		System.out.println("Informe um inteiro de 5 dígitos: ");
		int inteiro = input.nextInt();
		valor = inteiro;
		
				
		if(valor == 0)
			contaDigitos = 1;
		
		while(valor != 0) {
			valor = valor / 10;
			contaDigitos++;
		}
		
		if(contaDigitos != 5) {
			System.out.println("Valor inválido!");
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
				System.out.println("É um palíndromo!");
			}
			else {
				System.out.println("Não é um palíndromo!");
			}
		}
		input.close();
	}
}
