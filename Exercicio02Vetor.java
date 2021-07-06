// Juan Roberto Sapiezcinski | 06/07/2021 | Exercicio 02 Vetores

package br.com.generation.exerciciosVeM;

import java.util.Scanner;

public class Exercicio02Vetor {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int[] dados = new int[10];
		int maior = 0, i, cont = 0;
		int media = 0;
		
		for(i = 0; i < dados.length; i++) {
			System.out.print("Digite o valor do dado: ");
			dados[i] = entrada.nextInt();
			if(dados[i] > maior) {
				maior = dados[i];
			}
		}
		for(i = 0; i < dados.length; i++) {
			if(dados[i] == maior) {
				cont++;
			}
		int somaDados = dados[0] + dados [1] + dados [2] + dados [3] + dados [4] + dados[5] 
				+ dados [6] + dados [7] + dados [8] + dados [9];
		media = somaDados / 10;
		}
		System.out.println("O maior valor," + maior + " e aparece " + cont + " vezes.");
		System.out.println("A média aritmética dos valores dos dados lançados é: " + media);
				
		entrada.close();
		

	}

}
