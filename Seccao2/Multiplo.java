import javax.swing.JOptionPane;

public class Multiplo {
	public static void main(String[] args) {
		int num1, num2;
		num1 = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o primeiro n�mero.: "));
		
		num2 = Integer.parseInt(JOptionPane.showInputDialog(
				"Informe o segundo n�mero.: "));
		
		if(num1 % num2 == 0) {
			JOptionPane.showMessageDialog(null, num1+" � m�ltiplo de: "+num2);
		}
		
		if(num1 % num2 != 0) {
			JOptionPane.showMessageDialog(null, num1+" N�O � m�ltiplo de: "+num2);
		}
	}
}
