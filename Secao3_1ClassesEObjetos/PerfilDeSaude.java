package Secao3_1ClassesEObjetos;

import java.util.Calendar;

public class PerfilDeSaude {
	private String nome;
	private String sobrenome;
	private Date dataDeNascimento;
	private String sexo;
	private double altura;
	private double peso;
	private final int FREQUENCIA_CARDIACA_MAX = 220;
	
	public PerfilDeSaude(String nome, String sobrenome, Date dataDeNascimento, String sexo, double altura, double peso) {
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dataDeNascimento = dataDeNascimento;
		this.sexo = sexo;
		
		if(altura > 0) {
			this.altura = altura;
		}
		if(peso > 0) {
			this.peso = peso;
		}
	}
	
	public double getIMC() {
		double imc=0;
		imc = peso / (altura*altura);
		return imc;
	}
	
	public double frequenciaCardiacaAlvo() {
		double alvo=0;		
		alvo = (FREQUENCIA_CARDIACA_MAX - idadeEmAnos()) * 0.65;
		return alvo;
	}
	
	public double frequenciaCardiacaMaxima() {
		double maxima=0;		
		maxima = FREQUENCIA_CARDIACA_MAX - idadeEmAnos();
		return maxima;
	}
	
	
	public double idadeEmAnos() {
		Calendar c = Calendar.getInstance();
		double idade=0;
		int mesAtual = c.get(Calendar.MONTH) + 1;
		idade =  (c.get(Calendar.YEAR) - dataDeNascimento.getAno()) - 1;
		
		if(mesAtual > getDataNascimento().getMes()) {
			idade += 1;
		}
		
		if(mesAtual == getDataNascimento().getMes()) {
			if(c.get(Calendar.DAY_OF_MONTH) <= getDataNascimento().getDia()) {
				idade += 1;
			}
		}
		
		return idade;
	}
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobrenome;
	}
	
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
	public Date getDataNascimento() {
		return dataDeNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataDeNascimento = dataNascimento;
	}
	
	public String getSexo() {
		return sexo;
	}
	
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	
	public double getAltura() {
		return altura;
	}
	
	public void setAltura(double altura) {
		if(altura > 0) {
			this.altura = altura;
		}
		
	}
	
	public double getPeso() {
		return peso;
	}
	
	public void setPeso(double peso) {
		if(peso > 0) {
			this.peso = peso;
		}
	}
}
