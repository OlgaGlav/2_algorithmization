package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
//Сколько таких действий надо произвести, чтобы получился ноль?

public class Task17 {

	public static void main(String[] args) {
		int number = Math.abs(enterInt("Введите число "));

		int count;

		count = findCount(number);

		System.out.println(count);
	}

	
	private static int findCount(int number) {

		int count = 0;

		int sum = findSum(number);

		while (sum > 0 && number >= 0) {
			
			sum = findSum(number);

			number = number - sum;

			count = count + 1;
		}
		return count;
	}

	private static int findSum(int number) {

		int[] array = createArray(number);

		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			sum = sum + array[i];
		}
		return sum;
	}

	private static int[] createArray(int number) {

		int length;

		length = findLength(number);

		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {

			array[i] = number % 10;

			number = (number - array[i]) / 10;

		}
		return array;
	}

	private static int findLength(int number) {

		int count = 1;

		while (number / 10 != 0) {

			number = number / 10;

			count++;
		}
		return count;
	}

	private static int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();
			System.out.println(message);
		}

		return scanner.nextInt();
	}

}
