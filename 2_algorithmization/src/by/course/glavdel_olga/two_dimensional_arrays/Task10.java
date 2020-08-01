package by.course.glavdel_olga.two_dimensional_arrays;
//Найти положительные элементы главной диагонали квадратной матрицы

import java.util.Random;

public class Task10 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];

		array = initialization(array);

		print(array);
		

		int[] arrayPositive = new int[array.length];

		arrayPositive = findPositiveDiagonalElements(array);

		print(arrayPositive);

	}


	private static int[] findPositiveDiagonalElements(int[][] array) {

		int[] arrayPositive = new int[array.length];

		int j = 0;

		for (int i = 0; i < array.length; i++) {
			
			if (array[i][i] > 0) {

				arrayPositive[j] = array[i][i];
				
				j = j + 1;
			}
		}
		
		return arrayPositive;
	}
	

	private static void print(int[] array) {

		for (int i : array) {
			
			if (i != 0) {
				
				System.out.print(i + "  ");
			}
		}
		System.out.println();
	}
	
	private static void print(int[][] array) {

		for (int[] i : array) {
			for (int j : i) {

				System.out.printf("% d  ", j);
			}
			System.out.println();
		}
		System.out.println();
	}

	private static int[][] initialization(int[][] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = random.nextInt(10) - 5;
			}
		}
		return array;
	}

}
