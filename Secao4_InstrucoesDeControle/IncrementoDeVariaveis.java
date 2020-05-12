package Secao4_InstrucoesDeControle;

public class IncrementoDeVariaveis {
	public static void main(String[] args) {
		int x = 0;
		//primeira questão
		++x;
		x++;
		x = x + 1;
		x += 1;
				
		System.out.printf("O valor de x é: %d%n",x);
		
		int y = 1;
		int z = 0;
		//questão a
		z = x++ + y;
		
		System.out.printf("O valor de z é: %d%n",z);

		//questão b
		int contador = 9;
		
		System.out.println(contador > 10 ?"Contador é maior que 10"
				: "Contador é menor que 10");
		
		//questão c
		int total = 0;
		total -= --x;
		System.out.printf("Total é = %d%n",total);
		
		//questão d
		int q = 10;
		int divisor = 2;
		q = q % divisor;//primeira forma
		//q %= q; // 2 outra forma
	
		System.out.printf("Q é = %d%n",q);
	}
}
