package Secao3_1ClassesEObjetos;
import javax.swing.JOptionPane;

public class InvoiceTest {
	public static void main(String[] args) {
		
		Invoice invoice = new Invoice("", "", -10, 0.0);
		
		String nomeProduto = JOptionPane.showInputDialog(
				"Informe o nome do Produto:");
		invoice.setNome(nomeProduto);
		
		String descricaoProduto = JOptionPane.showInputDialog(
				"Informe a descrição do produto: ");
		invoice.setDescricao(descricaoProduto);
	
		int quantidadeProduto = Integer.parseInt(
				JOptionPane.showInputDialog("Informe a quantidade de produtos: "));
		invoice.setQuantidade(quantidadeProduto);
		
		double precoProduto = Double.parseDouble( 
				JOptionPane.showInputDialog("Informe o preço unitário do produto: "));
		invoice.setPreco(precoProduto);
		
		invoice.displayMessageGraphic();
	}
}
