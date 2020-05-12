import java.util.Scanner;

public class SeparaDigito {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String inteiro = "";
		
		System.out.println("Informe um inteiro com 5 dígitos.: ");
		inteiro = input.nextLine();
		
		if(inteiro.toCharArray().length == 5) {//verifica se foi informado exatamento 5 digitos
			for(int i=0; i<=4; i++) {// repete a instrução 5 vezes
				System.out.print(inteiro.toCharArray()[i]+"   ");//imprimi cada caracter separado po 3 espaçoes em branco 
			}
		}
		
		if(inteiro.toCharArray().length !=5) {//se não for exatamente 5 digitos...
			System.out.println("Erro: Informe exatamente 5 dígitos:");//...informa o erro
			SeparaDigito.main(null);//chama novamente o programa
		}
		
	}
}
