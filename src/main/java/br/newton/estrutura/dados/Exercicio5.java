package br.newton.estrutura.dados;

import java.util.Scanner;

/**
 * @author kevin
 * 
 * 5. Fa�a um programa que leia um vetor inteiro N[20]. Depois troque o primeiro
	elemento pelo �ltimo, o segundo pelo penultimo e assim sucessivamente at� trocar
	o 10o elemento pelo 11o. Ap�s as trocas, imprima o vetor (ref. 1175).
 *
 */
public class Exercicio5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[20];
		System.out.println("Digite 20 n�meros:");
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt(200);
		}
		sc.close();
		for (int i = 0; i < (array.length / 2); i++) {
			int pos = (array.length - 1) - i;
			int x = array[i];
			int y = array[pos];
			array[i] = y;
			array[pos] = x;
		}
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
}
