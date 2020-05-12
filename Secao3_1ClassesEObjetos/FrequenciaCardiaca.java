package Secao3_1ClassesEObjetos;

import java.util.Calendar;

public class FrequenciaCardiaca {
	private String nome;
	private String sobrenome;
	private Date dataNascimento;
	private final int FREQUENCIA_MAXIMA = 220;
	
	public FrequenciaCardiaca() {
		
	}
	
	public FrequenciaCardiaca(String nome, String sobreNome, Date dataNascimento) {
		this.nome = nome;
		this.sobrenome = sobreNome;
		this.dataNascimento = dataNascimento;
	}
	
	public int getIdade() {
		Calendar c = Calendar.getInstance();
		int idade = c.get(Calendar.YEAR) - dataNascimento.getAno() - 1;
		int mesAtual = c.get(Calendar.MONTH) + 1;
	
		if(dataNascimento.getMes() < mesAtual) {
			idade += 1;
		}
		
		if(dataNascimento.getMes() == mesAtual) {
			if(dataNascimento.getDia() >= c.get(Calendar.DAY_OF_MONTH)) {
				idade += 1;
			}
		}		
		
		return idade;
	}
	
	public double frequenciaCardiacaAlvo() {
		double alvo=0;		
		alvo = (FREQUENCIA_MAXIMA - getIdade()) * 0.67;
		
		return alvo;
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
		return dataNascimento;
	}
	
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
