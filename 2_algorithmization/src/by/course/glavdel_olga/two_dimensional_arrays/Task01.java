package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Random;

//Дана матрица. Вывести на экран все четные столбцы, у которых первый элемент больше последнего

public class Task01 {

	public static void main(String[] args) {

		int[][] array = new int[4][7];

		array = initialization(array);

		print(array);

		decision(array);

	}

	private static void decision(int[][] array) {

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (j % 2 != 0 && array[1][j] > array[array.length - 1][j]) {
					
					System.out.print(array[i][j] + " ");
				}
			}
		}
	}

	private static void print(int[][] array) {
		
		for (int[] i : array) {
			for (int j : i) {
				
				System.out.print(j + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	
	private static int[][] initialization(int[][] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				array[i][j] = random.nextInt(10);
			}
		}
		return array;
	}
}
