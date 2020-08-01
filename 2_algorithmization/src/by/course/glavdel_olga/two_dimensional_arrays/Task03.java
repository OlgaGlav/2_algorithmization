package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//Дана матрица. Вывести k-ую строку и p-ный столбец матрицы
public class Task03 {

	public static void main(String[] args) {

		int[][] array = new int[5][7];

		array = initialization(array);

		print(array);

		int row;
		int column;

		row = enterInt("Введите индекс строки для печати ", array.length);
		printRow(array, row);

		column = enterInt("Введите индекс столбца для печати ", array[0].length);
		printColumn(column, array);

	}

	private static void printColumn(int column, int[][] array) {

		System.out.print("Столбец с индексом " + column + ": ");

		for (int i = 0; i < array.length; i++) {

			System.out.print(array[i][column] + "  ");
		}
		System.out.println();
	}

	private static void printRow(int[][] array, int row) {

		System.out.print("Строка с индексом " + row + ": ");

		for (int j = 0; j < array[row].length; j++) {

			System.out.print(array[row][j] + "  ");
		}

		System.out.println();
	}

	
	private static boolean checkIndex(int number, int length) {
		if (number > length || number < 0) {
			
			System.out.println("Указанный индекс выходит за пределы матрицы. ");
			return false;
		}
		return true;
	}


	private static int enterInt(String message, int length) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int temp=-1;
		
		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();
			System.out.println("Некорректный ввод. " + message);
		}

		temp =scanner.nextInt();
		
		if (!checkIndex(temp, length)) {
			temp=enterInt(message, length);
		}

		return temp;
	}

	
	private static void print(int[][] array) {
		for (int i[] : array) {
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
