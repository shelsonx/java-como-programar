package Secao4_InstrucoesDeControle;

public class Exe4_5 {
	public static void main(String[] args) {
		int sum = 0;
		int x = 1;
		
		
		while(x<11) {
			sum += x; 
			x++;
		}
		System.out.println("O valor de x �="+x);
		System.out.println("O valor de sum � ="+sum);
		
		int product = 5;
		int y = 5;
		
		product *= y++; //multiplica product por y e adiciona resultado a product, s� depois incrementa y por 1
		//product *= ++y; //incrementa y por 1 depois multiplica o novo valor de y por product e ent�o atribui a product
		
		System.out.println("O valor de product � = "+product);
		System.out.println("O valor de y � ="+y);
	}
}
