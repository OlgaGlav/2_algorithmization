package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Scanner;

// Сформировать случайную матрицу m x n,состоящую из нулей и единиц, причем в каждом столбе число единиц равно номеру столбца

public class Task14 {

	public static void main(String[] args) {

		int row;
		int column;

		row = enterInt("Введите количество строк m");

		column = enterInt("Введите количество столбцов n");

		int[][] array = new int[row][column];

		array = initialization(array);

		print(array);
	}

	
	private static int[][] initialization(int[][] array) {

		for (int row = 0; row < array.length; row++) {

			for (int column = 0; column < array[row].length; column++) {

				if (row < column) {
					
					array[row][column] = 1;
					
				} else {
					
					array[row][column] = 0;
				}
			}
		}
		return array;
	}
	
	
	private static void print(int[][] array) {

		for (int[] i : array) {

			for (int element : i) {
				
				System.out.print(element + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

	

	private static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int temp = -1;

		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();
			
			System.out.println("Вы ввели некорректные данные. " + message);
		}
		temp = scanner.nextInt();

		temp = check(temp, message);

		return temp;
	}

	
	private static int check(int value, String message) {

		if (value < 0) {

			System.out.println("Количество должно быть выражено положительным числом. ");

			value = enterInt(message);
		}
		return value;
	}

}
