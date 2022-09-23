package calculadoradematriz;

import java.util.Scanner;
import biblioteca.Leitura;

/* 
    @author Pedro Oliveira Git user: pedrozand
    @author Henrique Santana Git user: rick-silva
    @author Adriel Lopes Git user: adriellopes

    TRABALHO FINAL DA DISCIPLINA DE LINGUAGEM DE PROGRAMAÇÃO - JAVA
1
 */

public class CalculadoraDeMatriz {

	public static void main(String[] args) {
		//variavel controle
		int opcaoMenu;
		int tamanhoLinhaA = 0;
		int tamanhoColunaA = 0;
		int tamanhoLinhaB = 0;
		int tamanhoColunaB = 0;
		double[][] matrizA = new double[0][0]; //tamanhoMatriz(tamanhoLinhaA, tamanhoColunaA);
		double [][] matrizB = new double[0][0]; //tamanhoMatriz(tamanhoLinhaB, tamanhoColunaB);
		do {
			//mostrar menu
			menu();
			//digitar opcao do menu
			opcaoMenu = Leitura.inteiro("Escolha uma op��o:");
			//cases do menu
			switch(opcaoMenu) {
			case 1:
				//definir tamanho Matriz A
				tamanhoLinhaA = Leitura.inteiro("Informe o tamanho da Linha da Matriz A: ");
				tamanhoColunaA = Leitura.inteiro("Informe o tamanho da Coluna da Matriz A: ");
				break;
				
			case 2:
				// definir tamanho Matriz B
				tamanhoLinhaB = Leitura.inteiro("Informe o tamanho da Linha da Matriz B: ");
				tamanhoColunaB = Leitura.inteiro("Informe o tamanho da Coluna da Matriz B: ");
				break;
				
			case 3:
				//lerMatriz A;
				matrizA = tamanhoMatriz(tamanhoLinhaA, tamanhoColunaA);
				lerMatriz(tamanhoLinhaA, tamanhoColunaA, matrizA);
				break;
			case 4:
				//lerMatriz B;
				matrizB = tamanhoMatriz(tamanhoLinhaB, tamanhoColunaB);
				lerMatriz(tamanhoLinhaB, tamanhoColunaB, matrizB);
				break;
				
			case 5:
				//exibirMatriz A;
				exibirMatriz(tamanhoLinhaA, tamanhoColunaA, matrizA);
				break;
				
			case 6:
				//exibitMatriz B
				exibirMatriz(tamanhoLinhaB, tamanhoColunaB, matrizB);
				break;
				
			case 7:
				//trocarMatriz;
				double[][] aux = matrizA;
				matrizA = matrizB;
				matrizB = aux;
				System.out.println("\n MATRIZ A");
				exibirMatriz(tamanhoLinhaA, tamanhoColunaA, matrizA);
				System.out.println("\n MATRIZ B");
				exibirMatriz(tamanhoLinhaB, tamanhoColunaB, matrizB);
				break;
				
			case 8:
				//somarMatriz();
				somarMatriz(tamanhoLinhaA, tamanhoColunaA, matrizA, matrizB);
				break;
				
			case 9:
			//subtrairMatriz();
				subtrairMatriz(tamanhoLinhaA, tamanhoColunaA, matrizA, matrizB);
			break;
			
			case 10:
				//multiplicarMatrizAConst;
				final double constMultA = Leitura.real("Informe um valor para a constante: ");
				multiplicarConst(tamanhoLinhaA, tamanhoColunaA, matrizA, constMultA);
				break;
				
			case 11:
				//multiplicarMatrizBConst;
				final double constMultB = Leitura.real("informe um valor para a constante: ");
				multiplicarConst(tamanhoLinhaB, tamanhoColunaB, matrizB, constMultB);
				break;
				
			case 12:
				//multiplicarMatriz();
				multiplicarMatriz(tamanhoLinhaA, tamanhoColunaA, matrizA, matrizB);
				break;
				
			case 13:
				//somaElementos();
				double somaElementosA = 0;
				somaElementosA = somaElementos(tamanhoLinhaA, tamanhoColunaA, matrizA, somaElementosA);
				System.out.println(somaElementosA);
				break;
				
			case 14:
				//somaElementos();
				double somaElementosB = 0;
				somaElementosB = somaElementos(tamanhoLinhaB, tamanhoColunaB, matrizB, somaElementosB);
				System.out.println(somaElementosB);
				break;
				
			case 15:
				//exibirSomaLinha();
				int linha = Leitura.inteiro("Informe a linha do Array: ");
				double somaLinhaA = 0;
				somaLinhaA = somaLinha(tamanhoLinhaA, matrizA, linha, somaLinhaA);
				System.out.println(somaLinhaA);
				break;
				
			case 16:
				//exibirSomaLinha;
				int linhaB = Leitura.inteiro("Informe a linha do Array: ");
				double somaLinhaB = 0;
				somaLinhaB = somaLinha(tamanhoLinhaB, matrizB, linhaB, somaLinhaB);
				System.out.println(somaLinhaB);
				break;
				
			case 17:
				//exibirSomaColuna;
				int colunaA = Leitura.inteiro("Informe a coluna do Array: ");
				double somaColunaA = 0;
				somaColunaA = somaColuna(tamanhoColunaA, matrizA, colunaA, somaColunaA);
				System.out.println(somaColunaA);
				break;
				
			case 18:
				//exibirSomaColuna;
				int colunaB = Leitura.inteiro("Informe a coluna do Array: ");
				double somaColunaB = 0;
				somaColunaB = somaColuna(tamanhoColunaB, matrizB, colunaB, somaColunaB);
				System.out.println(somaColunaB);
				break;
				
			case 0:
				System.out.println("TCHAU, JOVEM PADAWAN!!");
				break;
				
			default:
				System.err.println("Op��o inexistente, paci�ncia voc� deve ter, jovem PADAWAN!!");
					
		}
		}while(opcaoMenu!=0);

	}
	//FUNCAO SOMAR LINHA
	public static double somaLinha(int tamanhoLinha, double[][] matriz, int linha, double resultado) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoLinha; j++) {
				if(linha == i) {
				resultado += matriz[linha][j];
				}
			}
		}
		return resultado;
	}
	// FIM FUNCAO SOMA LINHA
	
	// FUNCAO SOMAR COLUNA
	public static double somaColuna(int tamanhoColuna, double[][] matriz, int coluna, double resultado) {
		for(int i = 0; i < tamanhoColuna; i++) {
			for(int j = 0; j < tamanhoColuna; j++) {
				if(coluna == j) {
				resultado += matriz[i][coluna];
				}
			}
		}
		return resultado;
	}
	//FIM FUNCAO SOMAR COLUNA
	
	// FUNCAO SOMAR ELEMENTOS
	public static double somaElementos(int tamanhoLinha, int tamanhoColuna, double[][] matriz,
			double somaElementos) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoColuna; j ++) {
				somaElementos += matriz[i][j];
			}
		}
		return somaElementos;
	}
	// FUNCAO SOMAR ELEMENTOS

	// FUNCAO MENU
	public static void menu() {
		System.out.println("\n\n\n\n +-+-+-+-+-+-+ Escolha uma op��o +-+-+-+-+-+-+ ");
		System.out.println("***********************************************");
		System.out.println("[ 1 ] - Definir o tamanho da Matriz A");
		System.out.println("[ 2 ] - Definir o tamanho da Matriz B");
		System.out.println("[ 3 ] - Ler Matriz A");
		System.out.println("[ 4 ] - Ler Matriz B");
		System.out.println("[ 5 ] - Exibir Matriz A");
		System.out.println("[ 6 ] - Exibir Matriz B");
		System.out.println("[ 7 ] - Trocar Matriz A pela Matriz B");
		System.out.println("[ 8 ] - Somar Matrizes A e B");
		System.out.println("[ 9 ] - Subtrair Matrizes A e B");
		System.out.println("[ 10 ] - Multiplicar Matriz A por uma constante");
		System.out.println("[ 11 ] - Multiplicar Matriz B por uma constante");
		System.out.println("[ 12 ] - Multiplicar Matrizes A e B, matricialmente");
		System.out.println("[ 13 ] - Somar os elementos da Matriz A");
		System.out.println("[ 14 ] - Somar os elementos da Matriz B");
		System.out.println("[ 15 ] - Mostrar a soma de uma linha da Matriz A");
		System.out.println("[ 16 ] - Mostrar a soma de uma linha da Matriz B");
		System.out.println("[ 17 ] - Mostrar a soma de uma coluna da Matriz A");
		System.out.println("[ 18 ] - Mostrar a soma de uma coluna da Matriz B");
		System.out.println("[ 0 ] - Encerrar programa");
	}
	//FIM FUNCAO MENU
	
	// FUNCAO TAMANHO MATRIZ
	public static double[][] tamanhoMatriz(int tamanhoLinha, int tamanhoColuna) {
		double[][] matrizA = new double[tamanhoLinha][tamanhoColuna];
		return matrizA;
	}
	// FIM FUNCAO TAMANHO MATRIZ
	
	// FUNCAO LER MATRIZ
	public static void lerMatriz(int tamanhoLinha, int tamanhoColuna, double[][] matriz) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoColuna; j ++) {
				matriz[i][j] = Leitura.real("Informe um n�mero para a linha " + i + " coluna " + j + " da Matriz: ");
			}
		}
	}
	//FIM FUNCAO LER MATRIZ
	
	// FUNCAO EXIBIR MATRIZ
	public static void exibirMatriz(int tamanhoLinha, int tamanhoColuna, double[][] matriz) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoColuna; j ++) {
				System.out.print("| ");
				System.out.print(matriz[i][j]);
				System.out.print(" ");
			}
			System.out.println(" | ");
		}
	}
	//FIM FUNCAO EXIBIR MATRIZ
	
	//FUNCAO SOMAR MATRIZES
	public static void somarMatriz(int tamanhoLinha, int tamanhoColuna, double[][] matrizA, double[][] matrizB) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoColuna; j ++) {
				matrizA[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}
	}
	//FIM FUNCAO SOMAR MATRIZES
	
	//FUNCAO SUBTRAIR MATRIZEZ
	public static void subtrairMatriz(int tamanhoLinha, int tamanhoColuna, double[][] matrizA, double[][] matrizB) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoColuna; j ++) {
				matrizA[i][j] = matrizA[i][j] - matrizB[i][j];
			}
		}
	}
	//FIM FUNCAO SUBTRAIR MATRIZES
	
	//FUNCAO MULTIPLICAR MATRIZES
	public static void multiplicarMatriz(int tamanhoLinha, int tamanhoColuna, double[][] matrizA, double[][] matrizB) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoColuna; j ++) {
				matrizA[i][j] = matrizA[i][j] * matrizB[i][j];
			}
		}
	}
	//FIM FUNCAO MULTIPLICAR MATRIZES
	
	//FUNCAO MULTIPLICAR POR CONSTANTE
	public static void multiplicarConst(int tamanhoLinha, int tamanhoColuna, double[][] matriz, double constante) {
		for(int i = 0; i < tamanhoLinha; i++) {
			for(int j = 0; j < tamanhoColuna; j ++) {
				matriz[i][j] = matriz[i][j] * constante;
			}
		}
	}
	//FIM FUNCAO MULTIPLICAR POR CONSTANTE
}
