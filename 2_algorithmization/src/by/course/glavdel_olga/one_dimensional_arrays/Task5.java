package by.course.glavdel_olga.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//Даны целые числа а1,а2,...,аN. Вывести на печать только те числа, для которых аi>i.

public class Task5 {

	public static void main(String[] args) {

		int lenght = enterInt("Введите размер массива ");

		int[] array = new int[lenght];

		arrayInitialization(array);

		print(array);

		printFiltrArray(array);

	}

	private static void printFiltrArray(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (array[i] > i) {

				System.out.print(array[i] + " ");
			}
		}

	}

	private static void arrayInitialization(int[] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(array.length);
		}

	}

	private static void print(int[] array) {

		for (int element : array) {
			System.out.print(element + " ");
		}

		System.out.println();
	}

	private static int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Некорректный ввод. " + message);
		}

		return scanner.nextInt();
	}
}
