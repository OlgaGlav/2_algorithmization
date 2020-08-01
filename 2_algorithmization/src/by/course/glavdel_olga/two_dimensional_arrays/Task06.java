package by.course.glavdel_olga.two_dimensional_arrays;
//Сформировать квадратную матрицу порядка n по заданному образцу (n-Четное):

//1 1 1 ... 1 1 1
//0 1 1 ... 1 1 0
//0 0 1 ... 1 0 0
//...............
//0 1 1 ... 1 1 0
//1 1 1 ... 1 1 1

import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		
		int length;
		
		length = enterInt("Введите размер массива ");

		int[][] array = new int[length][length];

		array = initialization(length);

		print(array);

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

	private static int[][] initialization(int length) {

		int[][] array = new int[length][length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if ((j >= i && j <= length - 1 - i) || ((j<=i && j >= length - 1 - i))) {
					
					array[i][j] = 1;
				}
			}
		}
		return array;
	}

	private static int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int temp = -1;

		System.out.println(message);

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Некорректный ввод. " + message);
		}

		temp = scanner.nextInt();
		
		temp = checkIndex(temp, message);

		return temp;
	}

	private static int checkIndex(int temp, String message) {

		if (temp <= 0) {
			System.out.println("Размер массива должен быть больше 0. ");
			temp = enterInt(message);
		}

		if (temp % 2 != 0) {
			System.out.println("Размер массива должен быть четным числом. ");
			temp = enterInt(message);
		}
		return temp;
	}

}
