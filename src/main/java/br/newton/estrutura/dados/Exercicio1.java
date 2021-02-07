package br.newton.estrutura.dados;

import java.util.Scanner;

/**
 * 
 * @author kevin
 * 
 * 1. Fa�a um programa que leia um vetor inteiro x[10]. Durante a leitura, entre com
	n�meros positivos e negativos. Ap�s isso, substitua todos os n�meros negativos
	por 1. Imprima o vetor gerado (ref. 1172)
 *
 */
public class Exercicio1 {

    public static void main(String[] args) {
        int[] array = new int[10];
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 10 n�meros positivos e negativos:");
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        sc.close();
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = 1;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s ", array[i]);
        }
    }

}
