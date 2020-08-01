package by.course.glavdel_olga.decomposition;
//Написать методы, определяющие, в каком из двух данных чисел больше цифр

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {

		int[] numbers;
		
		int[] length;
		
		int highBit;
		
		numbers = new int[2];
		
		initialization(numbers);

		print(numbers);

		length = findLength(numbers);

		print(length);

		highBit = findHighBit(length, numbers);

		System.out.println(highBit);

	}

	private static int findHighBit(int[] length, int[] numbers) {
		
		int index = maxIndex(length);

		return numbers[index];
	}

	private static int maxIndex(int[] length) {
		
		int max = length[0];
		
		int index = 0;

		for (int i = 1; i < length.length; i++) {

			if (max < length[i]) {

				index = i;
				
				max = length[i];
			}
		}
		return index;
	}

	private static int[] findLength(int[] numbers) {

		int[] length = new int[numbers.length];

		for (int i = 0; i < numbers.length; i++) {

			int temp = 1;

			while ((int) (numbers[i] / Math.pow(10, temp)) != 0) {

				temp++;
			}

			length[i] = temp;
		}
		return length;
	}

	private static void initialization(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(Integer.MAX_VALUE);
		}
	}

	private static void print(int[] array) {

		for (int e : array) {
			System.out.println(e + "  ");
		}
		System.out.println();
	}
}
