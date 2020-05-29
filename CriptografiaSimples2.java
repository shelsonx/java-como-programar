/*
Fazendo a diferen�a
4.38 (Impondo privacidade com criptografia) O crescimento explosivo de comunica��o e armazenamento de dados na internet e em
computadores conectados por ela aumentou muito a preocupa��o com a privacidade. O campo da criptografia envolve a codifica��o de
dados para torn�-los dif�ceis de acessar (e espera-se � com os esquemas mais avan�ados � imposs�veis de acessar) para usu�rios sem
autoriza��o de leitura. Nesse exerc�cio, voc� investigar� um esquema simples para criptografar e descriptografar dados. Uma empresa 
que quer enviar dados pela internet pediu-lhe que escrevesse um programa que criptografe dados a fim de que eles possam ser transmitidos
com maior seguran�a. Todos os dados s�o transmitidos como inteiros de quatro d�gitos. Seu aplicativo deve ler um inteiro de quatro d�gitos
inserido pelo usu�rio e criptograf�-lo da seguinte maneira: substitua cada d�gito pelo resultado da adi��o de 7 ao d�gito, obtendo o 
restante depois da divis�o do novo valor por 10. Troque ent�o o primeiro d�gito pelo terceiro e o segundo d�gito pelo quarto. Ent�o, 
imprima o inteiro criptografado. Escreva um aplicativo separado que receba a entrada de um inteiro de quatro d�gitos criptografado 
e o descriptografe (revertendo o esquema de criptografia) para formar o n�mero original. [Projeto de leitura opcional: pesquise a 
�criptografia de chave p�blica� em geral e o esquema de chave p�blica espec�fica PGP (Pretty Good Privacy). 
Voc� tamb�m pode querer investigar o esquema RSA, que � amplamente usado em aplicativos robustos industriais.]
*/

package Secao4_InstrucoesDeControle;
import java.util.Scanner;
public class CriptografiaSimples2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//Entrada de dados
		System.out.printf("Informe um n�mero inteiro positivo: %n");
		int numero = input.nextInt();
		int quantidadeDeDigitos = retornaQuantidadeDeDegitos(numero);
		
		//valida��o dos dados	
		while(quantidadeDeDigitos != 4) {
			System.out.println("Informe um n�mero inteiro positivo: ");
			numero = input.nextInt();
			quantidadeDeDigitos = retornaQuantidadeDeDegitos(numero);
		}
		
		int numeroEncriptado = criptografar(numero);
		System.out.println("N�mero Encriptado: "+numeroEncriptado);
		
		int numeroDecriptado = descriptografar(numeroEncriptado);
		System.out.println("N�mero Decriptado: "+numeroDecriptado);
		
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
			//separa o n�mero em d�gitos
			//soma cada d�gito a 7, pega o resto da divis�o do novo numero por 10
			numModificado =  ((retornaDigito(numero, contador) + 7) % 10);
			//inverte os n�meros
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
		//junta os d�gitos novamente
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