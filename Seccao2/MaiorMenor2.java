import javax.swing.JOptionPane;

public class MaiorMenor2 {
	public static void main(String[] args) {
		int contador = 0, maior, menor;
		int[] numeros = new int[5];
		
		while(contador <= 4) {
			int numero = Integer.parseInt(JOptionPane.showInputDialog("Informe um numero.: "));
			numeros[contador] = numero; 
			contador++;
		}
		maior = numeros[0];
		menor = numeros[0];
		
		for(int i = 1; i<=4; i++) {
			
			if(numeros[i] >= maior) {
				maior = numeros [i];
			}
			
			if(numeros[i] <= menor) {
				menor = numeros [i];
			}
		}
		JOptionPane.showMessageDialog(null, "O maior numero digitado foi.: "+maior
											+"\nO menor numero digitado foi.: "+menor);	
	}
}
