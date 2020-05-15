/*
 (Calculador de sal�rios) Desenvolva um aplicativo Java que determina o sal�rio bruto de cada um de tr�s empregados. A empresa paga
as horas normais pelas primeiras 40 horas trabalhadas por cada funcion�rio e 50% a mais por todas as horas trabalhadas al�m das 40
horas. Voc� recebe uma lista de empregados, o n�mero de horas trabalhadas por eles na semana passada e o sal�rio-hora de cada um. Seu
programa deve aceitar a entrada dessas informa��es para cada empregado e, ent�o, determinar e exibir o sal�rio bruto do empregado.
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
		
		System.out.println("Sistema para calculo do sal�rio bruto dos funcion�rios");
		System.out.print("Informe a quantide de funcion�rios � calcular: ");
		int qtdFuncionarios = input.nextInt();
		
		while(contador <= qtdFuncionarios) {
			System.out.println("Informe o nome do "+contador+"� funcion�rio: ");
			String nome = input.next();
			
			System.out.println("Informe o n�mero de horas que "+nome+" trabalhou: ");
			int horasTrabalhadas = input.nextInt();
			
			System.out.println("Informe o valor do sal�rio/hora de "+nome + ":");
			double valorSalarioHora = input.nextDouble();
			
			Empregado empregado = new Empregado();
			empregado.setNome(nome);
			empregado.setHorasTrabalhadas(horasTrabalhadas);
			empregado.setValorSalarioHora(valorSalarioHora);
			
			empregados.add(empregado);
			System.out.println("Funcion�rio "+contador+" ok!");
			if(contador < qtdFuncionarios)
				System.out.println("Vamos para o pr�ximo!");
			contador++;
		}
		
		System.out.println();
		for(Empregado empregado : empregados) {
			System.out.printf("Nome: %s %nSal�rio Bruto: %.2f%n%n"
					,empregado.getNome()
					,empregado.retornaSalarioBruto());
		}
	}
}
