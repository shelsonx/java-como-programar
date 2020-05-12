import java.util.Scanner;//programa utiliza a classe Scanner
//programa que soma 2 numeros inteiros
public class Addition {
	//método principal, inicia a execução do aplicativo java
	public static void main(String[] args){
		//cria um scanner para ler a entrada do sistema
		Scanner input = new Scanner(System.in);
		int primeiroNumero, //primeiro numero a ser digitado
			segundoNumero, // segundo numero a ser digitado
			soma; //a soma dos 2 numeros
		
		System.out.print("Digite o primeiro Número.: ");
		primeiroNumero = input.nextInt();
		
		System.out.print("Digite o segundo número.: ");
		segundoNumero = input.nextInt();
		input.close();//fecha o scanner após a última leitura
		
		soma = primeiroNumero + segundoNumero;//soma os 2 numeros e armazena na  variável soma
		System.out.printf("A soma é de.: %d \n",soma);
	}//fim do método main
}//fim da classe addition
