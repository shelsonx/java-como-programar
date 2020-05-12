package Secao4_InstrucoesDeControle;

import java.util.Scanner;

public class QuilometragemDeCombustivel {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int contadorDeViagens = 0;
		double totalConsumoMedio = 0.0;
		int totalQuilometros = 0;
		int totalLitrosGasolina = 0;
		
		System.out.println("Informe a quilometragem percorrida ou "
				+ "-1 para encerrar");
		int quilometros = input.nextInt();
		
		while(quilometros != -1) {
			System.out.println("Informe a quantidade de litros gastos na viagem:");
			int litros = input.nextInt();
			totalQuilometros += quilometros;
			totalLitrosGasolina+= litros;
			contadorDeViagens += 1;
			double consumoMedio = quilometros / litros;
			System.out.printf("Consumo médio dessa viagem %.0f%s%n",consumoMedio,"Km/L");
			System.out.printf("Total de quilometros até aqui %d%n",totalQuilometros);
			System.out.printf("Total de Litros gastos até aqui %d%n",totalLitrosGasolina);
			System.out.println("Informe a quilometragem percorrida ou "
					+ "-1 para encerrar");
			quilometros = input.nextInt();
		}
		System.out.println("Fim das viagens!");
		System.out.printf("Você fez %d Viagens%n",contadorDeViagens);
		totalConsumoMedio += totalQuilometros / totalLitrosGasolina;
		System.out.printf("Consumo médio total das viagens %.2fKm/L%n",totalConsumoMedio);
	}
}
