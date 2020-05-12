package Secao4_InstrucoesDeControle;

import java.util.Scanner;
/*
 4.19 (Calculador de comissão de vendas) Uma grande empresa paga seu pessoal de vendas com base em comissões. O pessoal de vendas
recebe R$ 200 por semana mais 9% de suas vendas brutas durante esse período. Por exemplo, um vendedor que realiza um total de vendas
Capítulo 4 Instruções de controle: parte 1; operadores de atribuição ++ e -- 115
de mercadorias de R$ 5.000 em uma semana recebe R$ 200 mais 9% de R$ 5.000, um total de R$ 650. Foi-lhe fornecida uma lista dos itens
vendidos por cada vendedor. Os valores desses itens são como segue:
Item Value
	1 239.99
	2 129.75
	3 99.95
	4 350.89
Desenvolva um aplicativo Java que recebe entrada de itens vendidos por um vendedor durante a última semana e calcula e exibe os rendimentos
do vendedor. Não existe nenhum limite para o número de itens que pode ser vendido.
 */
public class CalculadorDeComissaoDeVendas {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		double totalComissao = 0;
		double totalSalario = 0;
		int contadorDeVendas = 0;
		
		System.out.println("Informe seu nome: ");
		String nome = input.nextLine();
		
		System.out.println("Informe o código do item ou -1 para encerrar");
		int item = input.nextInt();
		
		while(item != -1) {
			totalComissao += retornaValorDaComissa(item);
			if(retornaValorDaComissa(item) != 0 ) {
				contadorDeVendas++;
			}
			System.out.println("Informe o código do item ou -1 para encerrar");
			item = input.nextInt();
		}
		
		totalSalario = totalComissao + 200;
		
		if(contadorDeVendas > 0)
			System.out.printf("Colaborador: %s recebeu o total de: %.2f %n por suas %d vendas",nome,totalSalario,contadorDeVendas);
		else
			System.out.println("Não houve vendas!");
		
	}
	
	private static double retornaValorDaComissa(int item) {
		double valor = 0;
		if(item  == 1){
			valor = 239.99;
		}
		else if(item == 2) {
			valor = 129.75;
		}
		else if(item == 3) {
			valor = 99.95;
		}
		else if (item == 4){
			valor = 350.89;
		}
		else {
			valor = 0;
		}
		return valor *= 0.09;
	}
}

