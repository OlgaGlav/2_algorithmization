package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Random;

//Дана квадратная матрица. Вывести на экран элементы, стоящие по диагонали

public class Task02 {

	public static void main(String[] args) {

		int array[][] = new int[4][4];

		array = initialization(array);

		print(array);

		printDiagonalElement(array);

	}

	private static void printDiagonalElement(int[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (i == j) {
					System.out.print(array[i][j] + "  ");
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
