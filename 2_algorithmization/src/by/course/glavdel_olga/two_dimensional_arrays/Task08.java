package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//В числовой матрице поменять местами два любых столбца, т.е. все элементы одного столбца
//поставить на соответствующие им позиции другого, а его элементы переместить в первый
//Номера столбцов вводит пользователь с клавиатуры

public class Task08 {

	public static void main(String[] args) {
		int[][] array = new int[5][7];

		array = initialization(array);

		print(array);

		int columnOne;
		int columnTwo;

		columnOne = enterInt("Введите индекс первого столбца ", array[0].length);
		columnTwo = enterInt("Введите индекс второго столбца ", array[0].length);

		array = changeColumn(columnOne, columnTwo, array);

		print(array);

	}

	private static int[][] changeColumn(int columnOne, int columnTwo, int[][] array) {
		
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				
				if (j == columnOne) {
					
					int temp = array[i][j];
					
					array[i][j] = array[i][columnTwo];
					
					array[i][columnTwo] = temp;
				}
			}
		}
		return array;
	}

	private static int enterInt(String message, int length) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		int temp = -1;

		System.out.println(message);

		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println(message);

		}
		temp = scanner.nextInt();
		
		temp = check(message, temp, length);
		
		return temp;
	}

	private static int check(String message, int temp, int length) {

		if (temp < 0 || temp > length - 1) {

			System.out.println("Некорректный номер столбца. ");
			temp = enterInt(message, length);
		}
		return temp;
	}

	private static void print(int[][] array) {

		for (int[] i : array) {
			for (int j : i) {

				System.out.print(j + " ");
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
