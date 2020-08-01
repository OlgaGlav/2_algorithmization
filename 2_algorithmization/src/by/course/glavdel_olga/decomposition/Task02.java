package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//	Написать метод для нахождения наибольшего общего делителя четырех натуральных чисел
public class Task02 {

	public static void main(String[] args) {
		int numberOne;
		int numberTwo;
		int numberThree;
		int numberFour;

		int[] dividersNumberOne;
		int[] dividersNumberTwo;
		int[] dividersNumberThree;
		int[] dividersNumberFour;

		int maxCommonDivisor;

		numberOne = enterInt("Введите первое число. ");
		numberTwo = enterInt("Введите второе число. ");
		numberThree = enterInt("Введите третье число. ");
		numberFour = enterInt("Введите четвертое число. ");

		dividersNumberOne = findDividers(numberOne);
		dividersNumberTwo = findDividers(numberTwo);
		dividersNumberThree = findDividers(numberThree);
		dividersNumberFour = findDividers(numberFour);

		maxCommonDivisor = findMaxCommonDivisor(dividersNumberOne, dividersNumberTwo, dividersNumberThree,
				dividersNumberFour);

		System.out.println(maxCommonDivisor);

	}

	private static int findMaxCommonDivisor(int[] dividersNumberOne, int[] dividersNumberTwo, int[] dividersNumberThree,
			int[] dividersNumberFour) {

		int findedMatches = 0;

		for (int i = dividersNumberOne.length - 1; i >= 0; i--) {

			if (dividersNumberOne[i] != 0) {

				findedMatches = check(dividersNumberOne[i], dividersNumberTwo)
						+ check(dividersNumberOne[i], dividersNumberThree)
						+ check(dividersNumberOne[i], dividersNumberFour);

				if (findedMatches == 3) {
					return dividersNumberOne[i];
				}
			}
		}
		return 1;
	}

	private static int check(int divider, int[] dividers) {

		for (int i = 0; i < dividers.length; i++) {

			if (dividers[i] == 0) {
				return 0;
			}

			if (divider == dividers[i] && divider != 0) {
				return 1;
			}
		}

		return 0;
	}

	private static int[] findDividers(int number) {

		int[] dividers = new int[number / 2 + 1];

		int index = 0;

		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {

				dividers[index] = i;
				index++;
			}
		}
		return dividers;
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