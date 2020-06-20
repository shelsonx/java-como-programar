package Secao5_InstrucoesDeControleParte2;

public class TriplosDePitagoras {
	public static void main(String[] args) {
		
		System.out.printf("São triplos de Pitágoras %n"
				+ "%s\t%s\t%s%n","side1","side2","hypotenuse");
		int contador = 1;
		for(int hypotenuse = 1; hypotenuse <= 500; hypotenuse++) {
			for(int side1 = 1; side1 <= 500; side1++) {
				for(int side2 = 1; side2 <= 500; side2++) {
					
					int sideLeft = side1 * side1 + side2 * side2;
					int sideRight = hypotenuse * hypotenuse;
					 
					if(sideLeft == sideRight) {
						System.out.printf(" %d \t %d \t %d%n",side1,side2,hypotenuse);
						contador++;
					}
				}
			}
		}
		System.out.println("\n"+contador+" possibilidades...");
	}
}
