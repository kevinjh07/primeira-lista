package br.newton.estrutura.dados;

import java.util.Scanner;

/**
 * 
 * @author kevin
 *
 *10.Um treinador de volley precisa manter estat�sticas sobre seu time. Para isso, para
	cada um dos 6 jogadores efetivos ele anota o n�mero de saques, bloqueios e
	ataques. Anota tamb�m o n�mero de saques, bloqueios e ataques que resultaram
	em pontos. Escreva um programa que permita ao treinador armazenar esses
	dados em uma matriz e ao final imprima o percentual de pontos concretizados pelo
	time para cada quesito avalidado (ref. 2310).
 *
 */
public class Exercicio10 {

	public static void main(String[] args) {
		int[][] matrix = new int[6][6];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < matrix.length; i++) {
			System.out.println(String.format("Jogador %s: Digite o número de saque, acertos de saque, "
					+ "número de bloqueios, acerto de bloqueios, número de ataques e acerto de ataques:", i + 1));
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = sc.nextInt();
			}
		}
		sc.close();
		//Calcular percentual acerto
		double percSaqueSoma = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < 1; j++) {
				double result = ((double) (matrix[i][j] / matrix[i][j+1])) * 100;
				percSaqueSoma += result;
			}
		}
		
		//Calcular percentual bloqueio
		double percBloqSoma = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 2; j < 3; j++) {
				double result = ((double) (matrix[i][j] / matrix[i][j+1])) * 100;
				percBloqSoma += result;
			}
		}
		
		//Calcular percentual ataque
		double percAtaqueSoma = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 4; j < 5; j++) {
				double result= ((double) (matrix[i][j] / matrix[i][j+1])) * 100;
				percAtaqueSoma += result;
			}
		}
		
		System.out.println(String.format("Percentual de saque: %s, bloqueio: %s, ataque: %s", 
				percSaqueSoma / matrix.length, percBloqSoma / matrix.length, percAtaqueSoma / matrix.length));
		
	}

}
