package Secao3_1ClassesEObjetos;

import javax.swing.JOptionPane;

public class FrequenciaCardiacaTest {
	public static void main(String[] args) {
		String nome;
		String sobrenome;
		int dia;
		int mes;
		int ano;
		
		Date dataNascimento = new Date();
		FrequenciaCardiaca frequenciaCardiaca = 
				new FrequenciaCardiaca("","",dataNascimento);
		
		
		nome = JOptionPane.showInputDialog("Informe seu nome: ");
		sobrenome = JOptionPane.showInputDialog("Informe seu Sobrenome: ");
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Informe o dia do seu nascimento.: "));
		mes = Integer.parseInt(JOptionPane.showInputDialog("Informe mes(em número) do seu nascimento.: "));
		ano = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano do seu nascimento.: "));
		dataNascimento.setDia(dia);
		dataNascimento.setMes(mes);
		dataNascimento.setAno(ano);
		
		frequenciaCardiaca.setNome(nome);
		frequenciaCardiaca.setSobrenome(sobrenome);
		frequenciaCardiaca.setDataNascimento(dataNascimento);
		
		displayMessage(frequenciaCardiaca);
	}
	
	public static void displayMessage(FrequenciaCardiaca frequenciaCardiaca) {
		String message = String.format("Nome: %s %s%nIdade:%d%nFrequencia Cardiaca Alvo..:%.0f ", 
				frequenciaCardiaca.getNome(),
				frequenciaCardiaca.getSobrenome(),
				frequenciaCardiaca.getIdade(),
				frequenciaCardiaca.frequenciaCardiacaAlvo());
		JOptionPane.showMessageDialog(null, message);
	}
}
