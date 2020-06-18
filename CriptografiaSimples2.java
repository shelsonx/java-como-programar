/*
Fazendo a diferença
4.38 (Impondo privacidade com criptografia) O crescimento explosivo de comunicação e armazenamento de dados na internet e em
computadores conectados por ela aumentou muito a preocupação com a privacidade. O campo da criptografia envolve a codificação de
dados para torná-los difíceis de acessar (e espera-se — com os esquemas mais avançados — impossíveis de acessar) para usuários sem
autorização de leitura. Nesse exercício, você investigará um esquema simples para criptografar e descriptografar dados. Uma empresa 
que quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos
com maior segurança. Todos os dados são transmitidos como inteiros de quatro dígitos. Seu aplicativo deve ler um inteiro de quatro dígitos
inserido pelo usuário e criptografá-lo da seguinte maneira: substitua cada dígito pelo resultado da adição de 7 ao dígito, obtendo o 
restante depois da divisão do novo valor por 10. Troque então o primeiro dígito pelo terceiro e o segundo dígito pelo quarto. Então, 
imprima o inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro dígitos criptografado 
e o descriptografe (revertendo o esquema de criptografia) para formar o número original. [Projeto de leitura opcional: pesquise a 
“criptografia de chave pública” em geral e o esquema de chave pública específica PGP (Pretty Good Privacy). 
Você também pode querer investigar o esquema RSA, que é amplamente usado em aplicativos robustos industriais.]
*/

package Secao4_InstrucoesDeControle;
import java.util.Scanner;
public class CriptografiaSimples2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Entrada de dados
		System.out.printf("Informe um número inteiro de 4 digitos positivo: %n");
		int numero = input.nextInt();
		int quantidadeDeDigitos = retornaQuantidadeDeDegitos(numero);
		
		//validação dos dados	
		while(quantidadeDeDigitos != 4) {
			System.out.printf("Informe um número inteiro de 4 digitos positivo: %n");
			numero = input.nextInt();
			quantidadeDeDigitos = retornaQuantidadeDeDegitos(numero);
		}
		
		int numeroEncriptado = criptografar(numero);
		System.out.println("Número Encriptado: "+numeroEncriptado);
		
		int numeroDecriptado = descriptografar(numeroEncriptado);
		System.out.println("Número Decriptado: "+numeroDecriptado);
		
		input.close();
	}
	
	private static final int descriptografar(int numeroCript) {
		int quantidadeDedigitos = retornaQuantidadeDeDegitos(numeroCript);
		int contador = quantidadeDedigitos;
		int numModificado = 0;
		int num1=0, num2=0, num3=0, num4=0;
		
		while(contador >= 1) {
			numModificado =  retornaDigito(numeroCript, contador);
			if(contador == 4) 
				num3 = numModificado;
			
			if(contador == 3) 
				num4 = numModificado;
			
			if(contador == 2) 
				num1 = numModificado;
			
			if(contador == 1) 
				num2 = numModificado;
			contador--;
		}		
		num1 = ((num1 + 10) - 7) % 10;
		num2 = ((num2 + 10) - 7) % 10;
		num3 = ((num3 + 10) - 7) % 10;
		num4 = ((num4 + 10) - 7) % 10;	
		
		int numeroDecript = formaNumero(num1, num2, num3, num4);
		return numeroDecript;
	}
	
	private static final int criptografar(int numero) {
		int quantidadeDeDigitos = retornaQuantidadeDeDegitos(numero);
		int contador = quantidadeDeDigitos;
		int num1=0,num2=0,num3=0,num4=0;
		int numModificado = 0;

		while(contador >= 1) {
			//separa o número em dígitos
			//soma cada dígito a 7, pega o resto da divisão do novo numero por 10
			numModificado =  ((retornaDigito(numero, contador) + 7) % 10);
			//inverte os números
			if(contador == 4) 
				num3 = numModificado;
			
			if(contador == 3) 
				num4 = numModificado;
			
			if(contador == 2) 
				num1 = numModificado;
			
			if(contador == 1) 
				num2 = numModificado;
			contador--;
		}
		//junta os dígitos novamente
		int numeroCript = formaNumero(num1, num2, num3, num4);		
		return numeroCript;
	}
	
	public static final int formaNumero(int num1, int num2, int num3, int num4) {
		double numeroFormado = 0.0;
		numeroFormado += num1 * incrementaPosicao(4);
		numeroFormado += num2 * incrementaPosicao(3);
		numeroFormado += num3 * incrementaPosicao(2);
		numeroFormado += num4 * incrementaPosicao(1);
		
		return (int) numeroFormado;
	}
	
	private static final int incrementaPosicao(int posicao) {
		int contador = 1;
		int incrementaPosicao = 1;
		
		while(contador < posicao) {
			incrementaPosicao *= 10;
			contador++;
		}
		return incrementaPosicao;
	}
	
	private static final int retornaDigito(int valor, int posicao) {
		int posicaoDigito = incrementaPosicao(posicao);
		
		int digito = valor / posicaoDigito;
		digito = digito % 10;
		
		return digito;
	}
	
	private static final int retornaQuantidadeDeDegitos(int valor) {
		int contaDigitos = 0;
		if(valor == 0)
			contaDigitos = 1;
		
		while(valor != 0) {
			valor = valor / 10;
			contaDigitos++;
		}
		return contaDigitos;
	}
}
