package Secao3_1ClassesEObjetos;

//Classe Account que contém uma variável de instância name
//e métodos para configurar e obter seu valor
public class Account {
	private String name; //variável de instância
	private double balance;//variável de instância
	
	//construtor inicializa name com nome do parametro
	public Account(String name, double initialBalance) {//nome do construtor é o mesmo nome da classe
		this.name = name; //
		
		//valida se saldo (balance) é maior que 0.0
		//se não for balance fica com seu valor inicial 0.0
		if(initialBalance > 0.0)//verifica se saldo é válido
			balance = initialBalance;
	}
	
	public void withDraw(double debitAmount) {//recebi valor do débito
		if(debitAmount < balance) {
			balance = balance - debitAmount;
		}
		else {
			System.out.println("Withdrawal amount exceeded account balance ");
			System.out.println("Valor do débito excedeu o saldo da conta ");
		}
				
	}
	
	//método que deposita (adiciona) apenas uma quantia válida no saldo
	public void deposit(double depositAmount) {
		if(depositAmount > 0.0)//se depositAmount for válido
			balance  = balance + depositAmount;//adiciona o saldo
	}
	
	//método para retornar o saldo da conta
	public double getBalance() {
		return balance;
	}
	
	//método para recuperar o nome do objeto
	public String getName() {
		return name;	//retorna o valor do nome para o chamador
	}
	
	//método para definir o nome do objeto
	public void setName(String name) {
		this.name = name;	//armazena o nome
	}
}
