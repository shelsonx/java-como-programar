import javax.swing.JOptionPane;

public class DiametroCircuferenciaArea {
	public static void main(String[] args) {
		int r;
		r = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o valor do raio do c�rculo"));
		
		JOptionPane.showMessageDialog(null, 
			"�re � = " + Math.PI *(r*r));
		
		JOptionPane.showMessageDialog(null, 
				" A circunfer�ncia � = "+2 * Math.PI * r);
		
		JOptionPane.showMessageDialog(null, " O di�metro � = "+ 2 * r);
	}
}
