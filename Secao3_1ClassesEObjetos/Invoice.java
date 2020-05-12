package Secao3_1ClassesEObjetos;

import javax.swing.JOptionPane;

public class Invoice {//classe fatura
	private String nome;
	private String descricao;
	private int quantidade;
	private double preco;
	
	public Invoice(String nome, String descricao, int quantidade, double preco) {
		this.nome = nome;
		this.descricao = descricao;
		setQuantidade(quantidade);
		setPreco(preco);		
	}
	
	public double getInvoiceAmount(){//obter valor da fatura
		double invoice = quantidade * preco;
		return invoice;
	}
	
	public void displayMessage() {
		System.out.printf("Nome: %s%n"
				+"Descrição do Produto: %s%n"
				+"Quantidade de produtos: %d%n"
				+"Preço unitário do produto: %.2f%n"
				+"Valor total da fatura: %.2f%n"
				,nome,descricao,quantidade,preco,getInvoiceAmount());
	}
	
	public void displayMessageGraphic() {
		String message = String.format("Nome: %s%n"
				+"Descrição do Produto: %s%n"
				+"Quantidade de produtos: %d%n"
				+"Preço unitário do produto: %.2f%n"
				+"Valor total da fatura: %.2f%n"
				,nome,descricao,quantidade,preco,getInvoiceAmount());
		JOptionPane.showMessageDialog(null, message);
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public void setQuantidade(int quantidade) {
		if(quantidade < 0) {
			this.quantidade = 0;
		}
		else {
			this.quantidade = quantidade;
		}
	}
	
	public void setPreco(double preco) {
		if(preco < 0.0) {
			this.preco = 0.0;
		}
		else {
			this.preco = preco;
		}
	}
}
