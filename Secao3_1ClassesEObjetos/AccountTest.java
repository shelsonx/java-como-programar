package Secao3_1ClassesEObjetos;

import javax.swing.JOptionPane;

public class AccountTest {
	public static void main(String[] args) {
		double depositAmount = 0.0;
		double debitAmount = 0.0;
		
		Account account1 = new Account("Doriane Alves",50.00);
		Account account2 = new Account("Shelson Alves",-7.53);
		
		//exibe o saldo inicial de cada objeto
		displayAccount(account1);
		displayAccount(account2);
		
		depositAmount = Double.parseDouble(
				JOptionPane.showInputDialog("Enter deposit amount for " +account1.getName()));
		
		JOptionPane.showMessageDialog(null,"adding account "+ account1.getName() +" "+ depositAmount +" balance");
		account1.deposit(depositAmount);//adiciona o saldo de account 1
		
		//exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
		
		depositAmount = Double.parseDouble( 
				JOptionPane.showInputDialog("Enter deposit amount for "+account2.getName()));
		
		JOptionPane.showMessageDialog(null,"adding account "+ account2.getName() +depositAmount + " balance");
		account2.deposit(depositAmount);
		
		//exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
		
		debitAmount = Double.parseDouble(
				JOptionPane.showInputDialog("Enter debit amount for "+account1.getName()));
		
		JOptionPane.showMessageDialog(null,"pulling "+debitAmount+ " out to balance");
		account1.withDraw(debitAmount);
		
		//exibe os saldos
		displayAccount(account1);
		displayAccount(account2);
	}
	
	public static void displayAccount(Account account) {
		String message = String.format("%s balance: $ %.2f %n",
						account.getName(),account.getBalance());
		JOptionPane.showMessageDialog(null, message);
	}
}
