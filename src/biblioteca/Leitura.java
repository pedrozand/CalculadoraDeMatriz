package biblioteca;

import java.util.Scanner;

/* 
    @author Pedro Oliveira Git user: pedrozand
    @author Henrique Santana Git user: rick-silva
    @author Adriel Lopes Git user: adriellopes

    TRABALHO FINAL DA DISCIPLINA DE LINGUAGEM DE PROGRAMAÇÃO - JAVA

 */

public class Leitura {
	// Burocracia de preparo do Scanner, como objeto privativo/exclusivo desta classe
	private static Scanner teclado = new Scanner(System.in);	
	
	public static int inteiro(String mensagem) {
		System.out.print(mensagem);					// Impress�o da mensagem p/ orienta��o do usu�rio
		int valor = teclado.nextInt();				// Leitura do valor (inteiro, int)
		return valor;								// Retorno do valor lido
	}

	public static double real(String mensagem) {
		System.out.print(mensagem);					// Impress�o da mensagem p/ orienta��o do usu�rio
		double valor = teclado.nextDouble();		// Leitura do valor (real, double)
		return valor;								// Retorno do valor lido
	}

	public static String string(String mensagem) {
		System.out.print(mensagem);					// Impress�o da mensagem p/ orienta��o do usu�rio
		String valor = teclado.nextLine();			// Leitura do valor (cadeia, String)
		return valor;								// Retorno do valor lido
	}
}