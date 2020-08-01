package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми

public class Task06 {

	public static void main(String[] args) {

		int numberOne;
		int numberTwo;
		int numberThree;

		boolean simple;

		numberOne = enterInt("Введите первое число ");
		numberTwo = enterInt("Введите второе число ");
		numberThree = enterInt("Введите третье число ");

		simple = definitionThreeIsSimple(numberOne, numberTwo, numberThree);

		System.out.println("Числа взаимно простые? "+simple);
	}

	private static boolean definitionThreeIsSimple(int numberOne, int numberTwo, int numberThree) {
		boolean oneTwo;
		boolean twoThree;
		boolean threeOne;

		oneTwo = definitionTwoIsSimple(numberOne, numberTwo);

		twoThree = definitionTwoIsSimple(numberTwo, numberThree);

		threeOne = definitionTwoIsSimple(numberThree, numberOne);

		if (oneTwo && twoThree && threeOne) {
			
			return true;
		}
		return false;
	}

	private static boolean definitionTwoIsSimple(int numberOne, int numberTwo) {

		for (int i = 2; i < numberOne; i++) {

			if (numberOne % i == 0 && numberTwo % i == 0) {

				return false;
			}
		}
		return true;
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
