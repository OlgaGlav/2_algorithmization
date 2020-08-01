package by.course.glavdel_olga.two_dimensional_arrays;
//Отсортировать строки матрицы по возрастанию и убыванию значений элементов 

import java.util.Random;

public class Task12 {

	public static void main(String[] args) {
		int[][] array = new int[5][7];

		array = initialization(array);

		print(array);

		array = sortRowIncrease(array);

		print(array);
		
		array = sortRowDecrease(array);
		
		print(array);
	}

	
	private static int[][] sortRowDecrease(int[][] array) {
		for (int row = 0; row < array.length; row++) {

			for (int i = 0; i < array[row].length; i++) {

				int max = array[row][i];
				int index = i;

				for (int j = i; j < array[row].length; j++) {

					if (max < array[row][j]) {

						max = array[row][j];
						index = j;
					}
				}
				
				int temp = array[row][i];
				
				array[row][i] = max;
				
				array[row][index] = temp;
			}
		}
		return array;
	}


	private static int[][] sortRowIncrease(int[][] array) {

		for (int row = 0; row < array.length; row++) {

			for (int i = 0; i < array[row].length; i++) {

				int min = array[row][i];
				int index = i;

				for (int j = i; j < array[row].length; j++) {

					if (min > array[row][j]) {

						min = array[row][j];
						index = j;
					}
				}
				
				int temp = array[row][i];
				
				array[row][i] = min;
				
				array[row][index] = temp;
			}
		}
		return array;
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
