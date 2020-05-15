package Secao4_InstrucoesDeControle;

public class Empregado {
	private String nome;
	private int horasTrabalhadas;
	private double valorSalarioHora;
	
	public double retornaSalarioBruto() {
		double salarioTotal = this.valorSalarioHora * 40;
		int horasExtras = retornaHorasExtras(horasTrabalhadas);
		
		if (horasExtras > 0) {
			double valorHoraExtra = (valorSalarioHora * 0.5) + valorSalarioHora;
			double valorHorasExtras = valorHoraExtra * horasExtras;
			salarioTotal += valorHorasExtras;
		}
		
		return salarioTotal;
	}
	
	
	private int retornaHorasExtras(int horasTrabalhadas) {
		int horasExtras = 0;
		if(horasTrabalhadas > 40) {
			horasExtras = horasTrabalhadas - 40;
		}
		return horasExtras;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

	public double getValorSalarioHora() {
		return valorSalarioHora;
	}

	public void setValorSalarioHora(double valorSalarioHora) {
		this.valorSalarioHora = valorSalarioHora;
	}
}
