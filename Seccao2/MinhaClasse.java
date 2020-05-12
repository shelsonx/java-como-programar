import java.util.Scanner;

import javax.swing.JOptionPane;
public class MinhaClasse {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int soma;
		
		//System.out.println("Informe o primeiro numero inteiro");
		a = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro numero.:"));
		//a = input.nextInt();
		
		//System.out.println("Informe o segundo numero inteiro");
		b = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo  numero"));
		//b = input.nextInt();
		soma = a + b;
		
		JOptionPane.showMessageDialog(null, "A soma é de.: "+soma);
		//System.out.println("A soma é de.: "+soma);
	}
}
