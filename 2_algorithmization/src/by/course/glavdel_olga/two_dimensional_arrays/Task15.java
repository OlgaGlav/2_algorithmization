package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Random;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него

public class Task15 {

	public static void main(String[] args) {

		int[][] array = new int[5][7];

		array = initialization(array);

		print(array);

		int max;

		max = findMax(array);

		System.out.println(max);

		array = change(array, max);

		print(array);

	}

	private static int[][] change(int[][] array, int max) {
		
		for (int row = 0; row < array.length; row++) {

			for (int column = 0; column < array[row].length; column++) {
				
				if((array.length*(row+1)+column)%2!=0) {
					
					array[row][column]=max;
				}
			}
		}
		return array;
	}

	private static int findMax(int[][] array) {

		int max = array[0][0];

		for (int row = 0; row < array.length; row++) {

			for (int column = 0; column < array[row].length; column++) {

				if (array[row][column] > max) {

					max = array[row][column];
				}
			}
		}
		return max;
	}

	private static int[][] initialization(int[][] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = random.nextInt(100);
			}
		}
		return array;
	}

	private static void print(int[][] array) {

		for (int[] i : array) {
			for (int j : i) {

				System.out.printf("%4d", j);
			}
			System.out.println();
		}
		System.out.println();
	}

}
