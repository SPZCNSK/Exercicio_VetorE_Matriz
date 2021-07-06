// Juan Roberto Sapiezcinski | 06/07/2021 | Exercicio 04 Matriz

package br.com.generation.exerciciosVeM;

import java.util.Scanner;

public class Exercicio04Matriz {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		int l, c, soma = 0;
		
		for(l = 0; l < matriz.length; l++) {
			for(c = 0; c < matriz.length; c++) {
				System.out.print("Digite um número na matriz 3x3: ");
				matriz[l][c] = entrada.nextInt();						
			}
		}
		soma = matriz[0][2] + matriz[1][1] + matriz[2][0];		
		System.out.println("A soma dos nºs da 1ª diagonal da matriz 3x3 é: " + soma);
		entrada.close();
		
		System.out.println("|" + matriz[0][0] + "|" + matriz[0][1] + "|" + matriz[0][2] +"|");
		System.out.println("|" + matriz[1][0] + "|" + matriz[1][1] + "|" + matriz[1][2] +"|");
		System.out.println("|" + matriz[2][0] + "|" + matriz[2][1] + "|" + matriz[2][2] +"|");

	}

}
