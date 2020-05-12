import java.util.Scanner;
public class ComparaInteiros {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a, b;
		
		System.out.println("Informe o primeiro numero inteiro.: ");
		a = input.nextInt();
		
		System.out.println("Informe o segundo numero inteiro.: ");
		b = input.nextInt();
		
		if(a > b) {
			System.out.printf("%d is larger %d\n", a, b);
		}
		
		if(b > a) {
			System.out.printf("%d is larger %d\n", b, a);
		}
		
		if(a == b) {
			System.out.println("The numbers are equal");
		}
	}
}
