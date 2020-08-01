package by.course.glavdel_olga.decomposition;

//Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность
//(например 123456789). 

public class Task15 {

	public static void main(String[] args) {

		int[] array = new int[300];

		initialization(array);

		print(array);

	}

	private static void initialization(int[] array) {

		int index = 0;

		for (int i = 1; i <= 12345; i++) {

			int length = findLength(i);

			int[] arrayNumber = findArray(i, length);

			boolean isSuitable = check(arrayNumber);

			if (isSuitable) {

				array[index] = i;

				index++;
			}
		}
	}

	private static boolean check(int[] array) {

		for (int i = 0; i < array.length - 1;) {

			if (array[i] < array[i + 1]) {
				i++;

			} else {

				return false;
			}
		}
		return true;
	}

	private static int[] findArray(int number, int length) {

		int[] array = new int[length];

		for (int i = array.length - 1; i >= 0; i--) {

			array[i] = number % 10;

			number = (number - array[i]) / 10;

		}

		return array;
	}

	private static int findLength(int number) {

		int length = 0;

		while ((int) (number / Math.pow(10, length)) != 0) {

			length++;
		}

		return length;
	}

	private static void print(int[] array) {
		
		for (int element : array) {
			
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
