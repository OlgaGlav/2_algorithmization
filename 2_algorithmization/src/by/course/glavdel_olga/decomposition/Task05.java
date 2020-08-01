package by.course.glavdel_olga.decomposition;

import java.util.Random;
import java.util.Scanner;

//Составить программу, которая в массиве А[N] находит второе по величине число (вывести на печать
//число, которое меньше максимального, но больше всех остальных элементов++
class Task05 {

	public static void main(String[] args) {

		int amountElements;
		int[] array;

		int maxAfterMax;

		amountElements = enterInt("Введите количество элементов массива. ");

		array = new int[amountElements];

		initialization(array);

		print(array);

		maxAfterMax = findMaxAfterMax(array);

		System.out.println(maxAfterMax);

	}

	private static int findMaxAfterMax(int[] array) {

		int max = findMax(array);

		int minSubtraction = max;
		
		int index = 0;

		for (int i = 0; i < array.length; i++) {
			
			if (Math.abs(max - array[i]) < minSubtraction && Math.abs(max - array[i]) != 0) {
				
				index = i;
				
				minSubtraction = Math.abs(max - array[i]);
			}
		}
		return array[index];
	}

	private static int findMax(int[] array) {
		int max = 0;

		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}
		}
		return max;
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

	private static void initialization(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(100);
		}

	}

	private static void print(int[] array) {

		for (int element : array) {

			System.out.printf("%4d", element);
		}
		System.out.println();
	}
}
