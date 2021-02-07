package br.newton.estrutura.dados;

import java.util.Scanner;

/**
 * @author kevin
 * 
 * 3. Fa�a um programa que leia um n�mero x. Insira x na primeira posi��o do vetor real
	N[100]. Em cada posi��o subsequente (1 a 99) insira a metade do valor inserido na
	posi��o anterior. Imprima o vetor gerado (ref. 1178).
 *
 */
public class Exercicio3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um n�mero: ");
        double number = sc.nextDouble();
        sc.close();
        double[] array = new double[100];
        array[0] = number;
        for (int i = 1; i < array.length; i++) {
            array[i] = array[i-1] / 2;
        }
        for (int i = 0; i < array.length; i++) {
        	System.out.println(array[i]);
        }
    }
	
}
