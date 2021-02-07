package br.newton.estrutura.dados;

import java.util.Random;
import java.util.Scanner;

/**
 * 
 * @author kevin
 * 
 *         8. Fa�a um programa que leia uma letra mai�scula representando a
 *         opera��o desejada (S = soma, M = m�dia) sobre uma matriz inteira
 *         M[12][12] (a matriz deve ser preenchida com n�meros aleat�rios).
 *         Execute a opera��o indicada considerando apenas os n�meros
 *         posicionados abaixo da diagonal principal (�rea verde na imagem
 *         abaixo). Imprima o resultado (ref. 1184).
 *
 */
public class Exercicio8 {
	private static final String SUM = "S";
	private static final String AVERAGE = "M";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 'S' para soma ou 'M' para m�dia:");
		String option = sc.nextLine();
		sc.close();

		int[][] matrix = new int[12][12];
		Random rdn = new Random();
		int result = 0;
		int count = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = rdn.nextInt(100);
				if (i > j) {
					result += matrix[i][j];
					count++;
				} else {
					break;
				}
			}
		}

		if (option.equalsIgnoreCase(AVERAGE)) {
			result = result / count;
		}
		System.out.printf("Resultado da %s: %s", option.equalsIgnoreCase(SUM) ? "soma" : "m�dia", result);
	}

}
