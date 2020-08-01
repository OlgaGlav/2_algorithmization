package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Random;

//Матрицу 10х20 заполнить случайными числами от 0 до 15.
//Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и бoлее раз

public class Task11 {

	public static void main(String[] args) {

		int[][] array = new int[10][20];

		array = initialization(array);

		print(array);

		int[] numberColumns = new int[array.length];

		numberColumns = findNumberColumns(array);

		print(numberColumns);

	}

	private static int[][] initialization(int[][] array) {
		
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = random.nextInt(16);
			}
		}
		return array;
	}

	
	private static int[] findNumberColumns(int[][] array) {

		int[] numberColumns = new int[array.length];
		
		int temp = 0;

		for (int i = 0; i < array.length; i++) {
			
			int count = 0;

			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] == 5) {
					
					count = count + 1;
				}
			}
			if (count >= 3) {

				numberColumns[temp] = i;
				
				temp = temp + 1;
			}
		}
		return numberColumns;
	}

	
	private static void print(int[] array) {
		System.out.print("Индекс строк с цифрой 5, встречающейся больше 3 раз: ");
		
		for (int i : array) {
			
			if (i != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
	}

	private static void print(int[][] array) {
		
		for (int i[] : array) {
			for (int j : i) {

				System.out.printf("%4d ", j);
			}
			System.out.println();
		}
		System.out.println();
	}

}
