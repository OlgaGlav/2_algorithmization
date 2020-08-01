package by.course.glavdel_olga.decomposition;
//Даны числа X,Y,Z,T - длины сторон четырехугольника.

//Написать методы вычисления его площади, если угол между сторонами длиной X и Y  - прямой

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		
		int[] side = new int[4];
		
		boolean isExist;

		double area;

		initialization(side);

		isExist = checkExist(side);

		area = findArea(side, isExist);

		System.out.println("Площадь равна " + area);
	}

	private static double findArea(int[] side, boolean isExist) {
		
		if (!isExist) {

			System.out.println("Такого четырехугольника не существует.");

			return 0;
		}
		
		double semiPerimeter = findSemiPerimeter(side);
		
		double tempResult = findTempResult(semiPerimeter, side);

		return Math.sqrt(tempResult);
	}

	private static double findTempResult(double semiPerimeter, int[] side) {

		double tempResult = 1;

		for (int i = 0; i < side.length; i++) {

			tempResult = tempResult * (semiPerimeter - side[i]);
		}
		return tempResult;
	}

	private static double findSemiPerimeter(int[] side) {

		double semiPerimeter = 0;

		for (int i = 0; i < side.length; i++) {

			semiPerimeter = semiPerimeter + side[i];
		}
		return semiPerimeter / 2.0;
	}

	private static boolean checkExist(int[] side) {

		int indexMaxSide = findIndexMaxSide(side);

		int sumSide = findSumSide(indexMaxSide, side);

		if (side[indexMaxSide] < sumSide) {

			return true;
		}

		return false;
	}

	private static int findSumSide(int indexMaxSide, int[] array) {
		int sum = 0;

		for (int i = 0; i < array.length; i++) {

			if (i != indexMaxSide) {

				sum = sum + array[i];
			}
		}
		return sum;
	}

	private static int findIndexMaxSide(int[] array) {

		int max = array[0];
		int index = 0;

		for (int i = 1; i < array.length; i++) {

			if (max < array[i]) {

				max = array[i];

				index = i;
			}
		}
		return index;
	}

	private static void initialization(int[] side) {

		for (int i = 0; i < side.length; i++) {

			side[i] = enterInt("Введите длину " + (i + 1) + " стороны");
		}
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

	private static int checkPositive(int number, String message) {

		if (number < 0) {

			System.out.println("Число должно быть положительным числом. ");

			number = enterInt(message);
		}
		return number;
	}

}
