package by.course.glavdel_olga.decomposition;
//Задан массив D. Составить методы для вычисления суммы трех последовательно расположенных элементов

//массива с номерами от k до m

import java.util.Random;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {

		int countElement;
		int firstElement;// k
		int lastElement;// m

		int[] arrayElements;
		int[] arraySums;
		int sizeArraySums;

		countElement = enterInt("Введите количество элементов массива ");

		arrayElements = new int[countElement];

		initialization(arrayElements);

		printArray(arrayElements);
		

		firstElement = enterElement("Введите индекс первого элемента ",0, countElement-2);
		
		lastElement = enterElement("Введите индекс последнего элемента ", firstElement+2, countElement);
		
		
		
		sizeArraySums = findSizeArraySum(firstElement, lastElement);

		arraySums = new int[sizeArraySums];

		arraySums = findArraySum(arrayElements, firstElement, lastElement, sizeArraySums);

		
		printArray(arraySums);
	}

	private static int[] findArraySum(int[] arrayElements, int firstElement, int lastElement, int sizeArraySums) {

		int[] arraySum = new int[sizeArraySums];

		int begin = firstElement;

		if ((lastElement - begin) % 3 == 0) {

			for (int i = 0; i < sizeArraySums; i++) {

				arraySum[i] = sum(arrayElements, begin);
				
				begin = begin+3;

			}
		}
		return arraySum;
	}

	private static int sum(int[] array, int begin) {

		return array[begin] + array[begin + 1] + array[begin + 2];
	}

	private static int findSizeArraySum(int firstElement, int lastElement) {

		int temp = lastElement - firstElement + 1;

		if (temp % 3 == 0) {
			return temp;
		}

		if ((temp + 1) % 3 == 0) {
			return ((temp + 1) / 3 - 1);
		}

		if ((temp + 2) % 3 == 0) {
			return ((temp + 2) / 3 - 1);
		}
		return 0;
	}

	private static int enterElement(String message, int begin, int end) {
		
		int element = enterInt(message);

		if (element == 0) {
			return 0;
		}
		
		element = checkOutOfBounds(element, begin, end, message);

		return element;
	}

	private static int checkOutOfBounds(int element, int begin, int end, String message) {

		while (element > end) {

			System.out.println("Введите число меньше " + (end +1));

			element = enterInt(message);
		}
		
		while(element< begin) {
			
			System.out.println("Введите число больше " + begin);

			element = enterInt(message);
		}
		return element;
	}

	private static void initialization(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(20);
		}

	}

	private static void printArray(int[] array) {

		for (int element : array) {

			System.out.printf("%4d", element);
		}
		System.out.println();
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
}
