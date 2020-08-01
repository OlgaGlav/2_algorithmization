package by.course.glavdel_olga.decomposition;
//Дано натуральное число N. Написать методы для формирования массива, элементами которого являются цифры числа N.

public class Task10 {

	public static void main(String[] args) {
		int number = 123456789;

		int length;

		length = findLength(number);

		int[] array = new int[length - 1];

		array = findArray(number, length);

		print(array);
	}

	private static void print(int[] array) {

		for (int i : array) {

			System.out.print(i + "  ");
		}
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

}
