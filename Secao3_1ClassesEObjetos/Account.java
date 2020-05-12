package Secao3_1ClassesEObjetos;

//Classe Account que cont�m uma vari�vel de inst�ncia name
//e m�todos para configurar e obter seu valor
public class Account {
	private String name; //vari�vel de inst�ncia
	private double balance;//vari�vel de inst�ncia
	
	//construtor inicializa name com nome do parametro
	public Account(String name, double initialBalance) {//nome do construtor � o mesmo nome da classe
		this.name = name; //
		
		//valida se saldo (balance) � maior que 0.0
		//se n�o for balance fica com seu valor inicial 0.0
		if(initialBalance > 0.0)//verifica se saldo � v�lido
			balance = initialBalance;
	}
	
	public void withDraw(double debitAmount) {//recebi valor do d�bito
		if(debitAmount < balance) {
			balance = balance - debitAmount;
		}
		else {
			System.out.println("Withdrawal amount exceeded account balance ");
			System.out.println("Valor do d�bito excedeu o saldo da conta ");
		}
				
	}
	
	//m�todo que deposita (adiciona) apenas uma quantia v�lida no saldo
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0)//se depositAmount for v�lido
			balance  = balance + depositAmount;//adiciona o saldo
	}
	
	//m�todo para retornar o saldo da conta
	public double getBalance() {
		return balance;
	}
	
	//m�todo para recuperar o nome do objeto
	public String getName() {
		return name;	//retorna o valor do nome para o chamador
	}
	
	//m�todo para definir o nome do objeto
	public void setName(String name) {
		this.name = name;	//armazena o nome
	}
}
