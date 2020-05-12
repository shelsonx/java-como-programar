import java.util.Scanner;//Utiliza a classe Scanner
public class Comparison {
	//Método principal que inicia a execução do aplicativo java
	public static void main(String[] args) {
		//Cria um Scanner para ler a entrada da janela de comando
		Scanner input = new Scanner(System.in);
		int primeiroNumero, //primeiro numero a compar
			segundoNumero;//segundo numero a compar
		
		System.out.println("Informe o primeiro número Inteiro.: ");
		primeiroNumero = input.nextInt();//armazena o primeiro numero informado pelo usuario
		System.out.println("Informe o segundo número inteiro");
		segundoNumero = input.nextInt();//armazena o segundo numero informado pelo usuario
		
		if(primeiroNumero == segundoNumero) {
			System.out.printf("%d == %d\n", primeiroNumero, segundoNumero);
		}
		
		if(primeiroNumero != segundoNumero) {
			System.out.printf("%d != %d\n",primeiroNumero,segundoNumero);
		}
		
		if(primeiroNumero < segundoNumero) {
			System.out.printf("%d < %d\n",primeiroNumero,segundoNumero);
		}
		
		if(primeiroNumero > segundoNumero) {
			System.out.printf("%d > %d\n",primeiroNumero,segundoNumero);
		}
		
		if(primeiroNumero <= segundoNumero) {
			System.out.printf("%d <= %d\n",primeiroNumero,segundoNumero);
		}
		
		if(primeiroNumero >= segundoNumero) {
			System.out.printf("%d >= %d\n",primeiroNumero,segundoNumero);
		}
		
	}//fim do método main
}//fim da classe Comparison
