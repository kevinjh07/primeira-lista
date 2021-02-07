package br.newton.estrutura.dados;

import java.util.Random;

/**
 * 
 * @author kevin
 * 
 *7. Fa�a um programa que leia uma matriz inteira M[20][20]. Ordene e imprima a matriz.
 */
public class Exercicio7 {

	public static void main(String[] args) {
		int[][] matrix = new int[20][20];
		Random rdn = new Random();
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = rdn.nextInt(1000);
			}
		}
		
		sortMatrix(matrix);
		
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
			System.out.println("");
		}
	}

	private static void sortMatrix(int[][] matrix) {
		for (int i = 0; i < 20; i++) {
			for (int j = 0; j < 20; j++) {
				for (int x = 0; x < 20; x++) {
					for (int y = 0; y < 20; y++) {
						if (matrix[i][j] < matrix[x][y]) {
							int temp = matrix[i][j];
							matrix[i][j] = matrix[x][y];
							matrix[x][y] = temp;
						}
					}
				}
			}
		}
	}

}
