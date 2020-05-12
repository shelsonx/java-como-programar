import java.util.Scanner;

public class SeparaDigito2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int inteiro, num1, num2, num3, num4, num5;
		
		System.out.println("Informe um inteiro com 5 dígitos.: ");
		inteiro = input.nextInt();
		
		num5 = inteiro % 10;
		
		num4 = inteiro / 10;
		num4 = num4 % 10;
		
		num3 = inteiro / 100;
		num3 = num3 % 10;
		
		num2 = inteiro / 1000;
		num2 = num2 % 10;
		
		num1 = inteiro / 10000;
		num1 = num1 % 10;
		
		System.out.print(num1 + 
				"   " + num2 + 
				"   " + num3 + 
				"   " + num4 + 
				"   "+ num5);
	}
	
}
