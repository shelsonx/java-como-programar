package Secao4_InstrucoesDeControle;

public class IncrementoDeVariaveis {
	public static void main(String[] args) {
		int x = 0;
		//primeira quest�o
		++x;
		x++;
		x = x + 1;
		x += 1;
				
		System.out.printf("O valor de x �: %d%n",x);
		
		int y = 1;
		int z = 0;
		//quest�o a
		z = x++ + y;
		
		System.out.printf("O valor de z �: %d%n",z);

		//quest�o b
		int contador = 9;
		
		System.out.println(contador > 10 ?"Contador � maior que 10"
				: "Contador � menor que 10");
		
		//quest�o c
		int total = 0;
		total -= --x;
		System.out.printf("Total � = %d%n",total);
		
		//quest�o d
		int q = 10;
		int divisor = 2;
		q = q % divisor;//primeira forma
		//q %= q; // 2 outra forma
	
		System.out.printf("Q � = %d%n",q);
	}
}
