import javax.swing.JOptionPane;

public class DiametroCircuferenciaArea {
	public static void main(String[] args) {
		int r;
		r = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o valor do raio do círculo"));
		
		JOptionPane.showMessageDialog(null, 
			"Áre é = " + Math.PI *(r*r));
		
		JOptionPane.showMessageDialog(null, 
				" A circunferência é = "+2 * Math.PI * r);
		
		JOptionPane.showMessageDialog(null, " O diâmetro é = "+ 2 * r);
	}
}
