package br.newton.estrutura.dados;

import java.util.Scanner;

/**
 * @author kevin
 * 
 * 2. Fa�a um programa que leia um n�mero inteiro T e preencha um vetor inteiro
	N[1000] com os n�meros de 0 a T-1 repetidas vezes. Imprima o vetor gerado (ref.	1177).
 *
 */
public class Exercicio2 {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um n�mero: ");
        int number = sc.nextInt();
        sc.close();
        int[] array = new int[1000];
        for (int i = 0; i < number; i++) {
            array[i] = i;
        }
        for (int i = 0; i < array.length; i++) {
            System.err.println(array[i]);
        }
    }
	
}
