package Secao3_1ClassesEObjetos;

import javax.swing.JOptionPane;

public class Date {
	private int dia;
	private int mes;
	private int ano;
	
	public Date(int dia, int mes, int ano) {
		setDia(dia);
		setMes(mes);
		setAno(ano);
	}
	
	public Date() {
		
	}
	
	public void displayDateFormated() {
		String date = String.format("%d/%d/%d", dia,mes,ano);
		JOptionPane.showMessageDialog(null, date);
	}
	
	public int getDia() {
		return dia;
	}
	
	public void setDia(int dia) {
		if(dia > 0 && dia <= 31) {
			this.dia = dia;
		}
		else {
			JOptionPane.showMessageDialog(null, "Dia inválido!");
		}
	}
	
	public int getMes() {
		return mes;
	}
	
	public void setMes(int mes) {
		if(mes > 0 && mes <= 12 ) {
			this.mes = mes;
		}
		else {
			JOptionPane.showMessageDialog(null, "Mês Inválido!");
		}
		
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int ano) {
		if(ano > 0) {
			this.ano = ano;
		}
		else {
			JOptionPane.showMessageDialog(null, "Ano inválido");
		}
		
	}
}
