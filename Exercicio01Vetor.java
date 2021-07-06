// Juan Roberto Sapiezcinski | 06/07/2021 | Exercicio 01 Vetores

package br.com.generation.exerciciosVeM;

import java.util.Scanner;

public class Exercicio01Vetor {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double[] ponto = new double[5];
		double maiorPont = 0.0;

		for (int p = 0; p < ponto.length; p++) {

			System.out.print("\nDigite a pontuação: ");

			ponto[p] = entrada.nextDouble();

			if (ponto[p] > maiorPont) {
				maiorPont = ponto[p];
			}
		}
		entrada.close();

		System.out.println("========================");
		System.out.println("A maior pontuação foi: " + maiorPont);
	}
}
