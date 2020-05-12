import javax.swing.JOptionPane;

public class Multiplo {
	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o primeiro número.: "));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o segundo número.: "));
		
		if(num1 % num2 == 0) {
			JOptionPane.showMessageDialog(null, num1+" é múltiplo de: "+num2);
		}
		
		if(num1 % num2 != 0) {
			JOptionPane.showMessageDialog(null, num1+" NÃO é múltiplo de: "+num2);
		}
	}
}
