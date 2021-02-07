package br.newton.estrutura.dados;

import java.util.Random;

/**
 * 
 * @author kevin
 * 
 * 4. Fa�a um programa que leia um vetor inteiro N[100]. Imprima todas as posi��es que
	cont�m n�meros menores do que 10 e os respectivos valores (ref. 1174).
 *
 */
public class Exercicio4 {
	
	public static void main(String[] args) {
		int[] array = new int[100];
		Random rdn = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = rdn.nextInt(100);
			if (array[i] < 10) {
				System.out.println(i);
			}
		}
	}
	
}
