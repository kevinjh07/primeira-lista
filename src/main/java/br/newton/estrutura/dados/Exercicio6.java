package br.newton.estrutura.dados;

import java.util.Scanner;

/**
 * 
 * @author kevin
 * 
 * 6. Fa�a um programa que leia um vetor inteiro N[10]. Imprima em ordem n�o
	decrescente os n�meros pares armazenados no vetor e em ordem n�o
	decrescente os n�meros �mpares.
 *
 */
public class Exercicio6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite 10 n�meros");
		int[] array = new int[10];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();
		}
		sc.close();
		
		doBubbleSort(array);

		System.out.println("pares");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println(array[i]);
			}
		}
		
		System.out.println("�mpares");
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println(array[i]);
			}
		}
	}

	private static void doBubbleSort(int[] array) {
		boolean changed = true;
		while (changed) {
			changed = false;
			for (int i = 0; i < array.length - 1; i++) {
				if (array[i] > array[i + 1]) {
					int temp = array[i];
					array[i] = array[i + 1];
					array[i + 1] = temp;
					changed = true;
				}
			}
		}
	}
	
}
