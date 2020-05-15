/*
 (Calculador de salários) Desenvolva um aplicativo Java que determina o salário bruto de cada um de três empregados. A empresa paga
as horas normais pelas primeiras 40 horas trabalhadas por cada funcionário e 50% a mais por todas as horas trabalhadas além das 40
horas. Você recebe uma lista de empregados, o número de horas trabalhadas por eles na semana passada e o salário-hora de cada um. Seu
programa deve aceitar a entrada dessas informações para cada empregado e, então, determinar e exibir o salário bruto do empregado.
Utilize a classe Scanner para inserir os dados.
 * */

package Secao4_InstrucoesDeControle;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculadorDeSalariosEmpregados {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Empregado> empregados = new ArrayList<>();
		int contador = 1;
		
		System.out.println("Sistema para calculo do salário bruto dos funcionários");
		System.out.print("Informe a quantide de funcionários à calcular: ");
		int qtdFuncionarios = input.nextInt();
		
		while(contador <= qtdFuncionarios) {
			System.out.println("Informe o nome do "+contador+"º funcionário: ");
			String nome = input.next();
			
			System.out.println("Informe o número de horas que "+nome+" trabalhou: ");
			int horasTrabalhadas = input.nextInt();
			
			System.out.println("Informe o valor do salário/hora de "+nome + ":");
			double valorSalarioHora = input.nextDouble();
			
			Empregado empregado = new Empregado();
			empregado.setNome(nome);
			empregado.setHorasTrabalhadas(horasTrabalhadas);
			empregado.setValorSalarioHora(valorSalarioHora);
			
			empregados.add(empregado);
			System.out.println("Funcionário "+contador+" ok!");
			if(contador < qtdFuncionarios)
				System.out.println("Vamos para o próximo!");
			contador++;
		}
		
		System.out.println();
		for(Empregado empregado : empregados) {
			System.out.printf("Nome: %s %nSalário Bruto: %.2f%n%n"
					,empregado.getNome()
					,empregado.retornaSalarioBruto());
		}
	}
}
