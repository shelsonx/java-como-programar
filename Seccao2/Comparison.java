import java.util.Scanner;//Utiliza a classe Scanner
public class Comparison {
	//M�todo principal que inicia a execu��o do aplicativo java
	public static void main(String[] args) {
		//Cria um Scanner para ler a entrada da janela de comando
		Scanner input = new Scanner(System.in);
		int primeiroNumero, //primeiro numero a compar
			segundoNumero;//segundo numero a compar
		
		System.out.println("Informe o primeiro n�mero Inteiro.: ");
		primeiroNumero = input.nextInt();//armazena o primeiro numero informado pelo usuario
		System.out.println("Informe o segundo n�mero inteiro");
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
		
	}//fim do m�todo main
}//fim da classe Comparison
