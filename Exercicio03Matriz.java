// Juan Roberto Sapiezcinski | 06/07/2021 | Exercicio 03 Matriz

package br.com.generation.exerciciosVeM;

import java.util.Scanner;

public class Exercicio03Matriz {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int[][] n1 = new int[2][3];
		int[][] n2 = new int[2][3];
		int[][] m1 = new int[2][3];
		int[][] m2 = new int[2][3];
		int l, c;

		for (l = 0; l < n1.length; l++) {
			for (c = 0; c < n2.length; c++) {
				System.out.print("Entre com N1: ");
				n1[l][c] = entrada.nextInt();
				System.out.print("Entre com N2: ");
				n2[l][c] = entrada.nextInt();

				m1[l][c] = n1[l][c] + n2[l][c];
				m2[l][c] = n1[l][c] - n2[l][c];
			}
		}
		
		for (l = 0; l < n1.length; l++) {
			for (c = 0; c < n2.length; c++) {
				System.out.println("Matriz M1 (+): " + m1[l][c] + " | Matriz M2 (-): " + m2[l][c]);				
			}
		}

		entrada.close();
	}

}
