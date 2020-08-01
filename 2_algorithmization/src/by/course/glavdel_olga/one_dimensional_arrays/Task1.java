package by.course.glavdel_olga.one_dimensional_arrays;

import java.util.Scanner;

// В массив А[N] занесены натуральные числа. Найти сумму тех элементов, которые кратныx данному К

public class Task1 {

	public static void main(String[] args) {

		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		int denominator;

		denominator = enterInt("Введите число К ");

		int sum = findSum(array, denominator);

		System.out.println(sum);

	}

	private static int findSum(int[] array, int denominator) {
		int sum = 0;

		for (int element : array) {
			if (element % denominator == 0) {
				sum = sum + element;
			}
		}
		return sum;
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
