import java.util.Scanner;//programa utiliza a classe Scanner
//programa que soma 2 numeros inteiros
public class Addition {
	//m�todo principal, inicia a execu��o do aplicativo java
	public static void main(String[] args){
		//cria um scanner para ler a entrada do sistema
		Scanner input = new Scanner(System.in);
		int primeiroNumero, //primeiro numero a ser digitado
			segundoNumero, // segundo numero a ser digitado
			soma; //a soma dos 2 numeros
		
		System.out.print("Digite o primeiro N�mero.: ");
		primeiroNumero = input.nextInt();
		
		System.out.print("Digite o segundo n�mero.: ");
		segundoNumero = input.nextInt();
		input.close();//fecha o scanner ap�s a �ltima leitura
		
		soma = primeiroNumero + segundoNumero;//soma os 2 numeros e armazena na  vari�vel soma
		System.out.printf("A soma � de.: %d \n",soma);
	}//fim do m�todo main
}//fim da classe addition
