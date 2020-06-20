package Secao5_InstrucoesDeControleParte2;

public class CalculandoOValorDePI {
	public static void main(String[] args) {
		calculaPI(753683);// termo que encontra o primeiro 3.14.15 é = 753683
	}
	
	private static void calculaPI(int valor) {
		double PI = 0.0;
		int j = 3;
		for(int i = 1; i <= valor; i += 4) {
			PI += (4.0 / i);
			PI -= (4.0 / j);
			//System.out.println("i = "+i);
			System.out.println("j = "+j);
			System.out.printf("PI = %.10f%n",PI);
			j += 4;
		}
		//System.out.printf("%.10f",PI);
	}
}
