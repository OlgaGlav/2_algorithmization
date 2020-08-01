package by.course.glavdel_olga.two_dimensional_arrays;

import java.util.Scanner;

//Сформировать квадратную матрицу порядка N по правилу
//А[i,j]=sin((i^2-j^2)/N)
//и подсчитать количество элементов в ней

public class Task07 {

	public static void main(String[] args) {

		int length;
		int countPositiveElement;

		length = enterInt("Введите размер массива ");

		double[][] array = new double[length][length];

		array = initialization(length);

		print(array);

		countPositiveElement = findCountPositiveElement(array);

		System.out.println("Количество отрицательных элементов " + countPositiveElement);

	}

	private static int findCountPositiveElement(double[][] array) {
		int count = 0;

		for (double[] i : array) {
			for (double j : i) {

				if (j > 0) {
					count = count + 1;
				}
			}
		}
		return count;
	}

	private static void print(double[][] array) {

		for (double[] i : array) {
			for (double j : i) {

				System.out.printf("% .4f  ", j);
			}
			System.out.println();
		}
		System.out.println();
	}

	
	private static double[][] initialization(int length) {

		double[][] array = new double[length][length];

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / length);
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

		return temp;
	}

}
