package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//Даны натуральные числа K и N. Написать методы формирования массива А, элементами которого являются числа,
// сумма  цифр которых равна K и которые не больше N

public class Task12 {

	public static void main(String[] args) {

		int[] array = new int[3];

		int sumNumbers;
		int maxValue;

		sumNumbers = enterInt("Введите необходимую сумму цифр ");

		maxValue = enterInt("Введите максимальное значение ");

		initialization(array, sumNumbers, maxValue);

		print(array);

	}

	private static void initialization(int[] array, int sumNumbers, int maxValue) {

		for (int i = 1, j = 0; j < array.length;) {

			boolean check = checkNumber(i, sumNumbers, maxValue);

			if (!check) {
				
				i++;
			}

			else {
				
				array[j] = i;
				
				i++;
				
				j++;
			}

		}
	}

	private static boolean checkNumber(int temp, int sumNumbers, int maxValue) {

		int length = findLength(temp);

		int[] arrayNumbers = findArray(temp, length);

		int sum = findSum(arrayNumbers);

		boolean isRightSum = checkIsRightSum(sum, sumNumbers);

		if (!isRightSum) {

			return false;
		}

		boolean isRightValue = checkIsRightValue(temp, maxValue);

		if (!isRightValue) {
			
			return false;
		}

		return true;
	}

	private static boolean checkIsRightValue(int temp, int maxValue) {

		if (temp < maxValue) {

			return true;
		}
		return false;
	}

	private static boolean checkIsRightSum(int sum, int sumNumbers) {

		if (sum == sumNumbers) {

			return true;
		}
		return false;
	}

	private static int findSum(int[] arrayNumbers) {

		int sum = 0;

		for (int i = 0; i < arrayNumbers.length; i++) {

			sum = sum + arrayNumbers[i];
		}
		return sum;
	}

	private static int[] findArray(int number, int length) {

		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {

			array[i] = number % 10;

			number = (number - array[i]) / 10;

		}

		return array;
	}

	private static int findLength(int number) {

		int i = 2;

		while ((int) (number / Math.pow(10, i)) != 0) {

			i++;
		}
		return i;
	}

	private static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();
			System.out.println(message);

		}
		int temp = scanner.nextInt();

		temp = checkPositive(temp, message);

		return temp;
	}

	private static int checkPositive(int temp, String message) {

		if (temp < 0) {

			System.out.println("Число должно быть положительным числом. ");

			temp = enterInt(message);
		}
		return temp;
	}

	private static void print(int[] array) {

		for (int i : array) {

			System.out.print(i + "  ");
		}
	}

}
