package Secao3_1ClassesEObjetos;

public class Employee {
	private String nome;
	private String sobrenome;
	private double salarioMensal;
		
	public Employee(String nome, String sobrenome, double salarioMensal) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		setSalarioMensal(salarioMensal);
	}
	
	public void setAumento(int aumento) {
		salarioMensal = salarioMensal + ((salarioMensal * aumento) / 100);
	}
	
	public double getSalarioAnual(){
		return salarioMensal * 12;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public double getSalarioMensal() {
		return salarioMensal;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public void setSalarioMensal(double salarioMensal) {
		if(salarioMensal > 0.0) {
			this.salarioMensal = salarioMensal;
		}
	}
	
}
