package Secao3_1ClassesEObjetos;

import javax.swing.JOptionPane;

public class PerfilDeSaudeTest {
	public static void main(String[] args) {
		Date dataNascimento = new Date();
		PerfilDeSaude perfilDeSaude = new PerfilDeSaude("", "", dataNascimento, "", 0, 0);
		
		solicitaEntrada(perfilDeSaude, dataNascimento);
		exibeMensagens(perfilDeSaude);
	}
	
	public static void solicitaEntrada(PerfilDeSaude perfilDeSaude, Date dataNascimento) {
		String nome = JOptionPane.showInputDialog("Qual seu nome? ");
		perfilDeSaude.setNome(nome);
		
		String sobrenome = JOptionPane.showInputDialog("Qual seu sobrenome? ");
		perfilDeSaude.setSobrenome(sobrenome);
	
		
		int dia = Integer.parseInt( 
				JOptionPane.showInputDialog("Qual o DIA do seu aniversário? "));
		dataNascimento.setDia(dia);
		
		int mes = Integer.parseInt( 
				JOptionPane.showInputDialog("Qual o MÊS do seu aniversário? "));
		dataNascimento.setMes(mes);
		
		int ano = Integer.parseInt( 
				JOptionPane.showInputDialog("Qual o ANO do seu aniversário? "));
		dataNascimento.setAno(ano);
		
		perfilDeSaude.setDataNascimento(dataNascimento);
		
		String sexo = JOptionPane.showInputDialog("Qual seu sexo? ");
		perfilDeSaude.setSexo(sexo);
		
		double altura = Double.parseDouble(
				JOptionPane.showInputDialog("Qual sua altura em metros? "));
		perfilDeSaude.setAltura(altura);
		
		double peso = Double.parseDouble(
				JOptionPane.showInputDialog("Qual seu peso em Quilograma? "));
		perfilDeSaude.setPeso(peso);
	}
	
	public static void exibeMensagens(PerfilDeSaude perfilDeSaude) {
		String message1 = String.format("Nome completo: %s %s %nSexo: %s %nAltura: %.2f %nPeso: %.2f %nVocê tem %.0f anos", 
				perfilDeSaude.getNome(),
				perfilDeSaude.getSobrenome(),
				perfilDeSaude.getSexo(),
				perfilDeSaude.getAltura(),
				perfilDeSaude.getPeso(),
				perfilDeSaude.idadeEmAnos());
		
		String message2 = String.format("Sua Frequência Cardíaca Alvo é de: %.0f"
										+"%nSua Frequência Cardíaca Máxima é de: %.0f"
										+"%nSeu IMC é de: %.2f"
										+"%nIMC                             CLASSIFICAÇÃO            OBESIDADE(grau)"
										+"%nMENOR QUE 18,5                 MAGREZA                   0"			
										+"%nENTRE 18,5 E 24,9               NORMAL                     0"
										+"%nENTRE 25,0 E 29,9               SOBREPESO               1"
										+"%nENTRE 30,0 E 39,9               OBESIDADE                 2"
										+"%nMAIOR QUE 40,0                  OBESIDADE GRAVE    3",
						perfilDeSaude.frequenciaCardiacaAlvo(),
						perfilDeSaude.frequenciaCardiacaMaxima(),
						perfilDeSaude.getIMC());
		
		
		JOptionPane.showMessageDialog(null, message1);
		JOptionPane.showMessageDialog(null, message2);
		
	}
}
