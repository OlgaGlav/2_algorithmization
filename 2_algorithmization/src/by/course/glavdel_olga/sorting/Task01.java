package by.course.glavdel_olga.sorting;

import java.util.Scanner;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. 
//Объединить их в один массив, включив второй массив между k-м и (k+1)-м элементами первого, 
//при этом не используя дополнительный массив

public class Task01 {

	public static void main(String[] args) {
		
		int[] array1 = { 1, 2, 3, 4, 5, 6, 7, 8 };

		int[] array2 = { 9, 9, 9, 9 };

		int position = enterInt("Введите число k. ");

		position = checkMaxPosition(array1, position);
		
		array1 = union(array1, array2, position);

		print(array1);

	}

	private static int[] union(int[] array1, int[] array2, int k) {

		int[] arrayTotal = new int[array1.length + array2.length];

		for (int i = 0; i < arrayTotal.length; i++) {

			if (i <= k) {

				arrayTotal[i] = array1[i];

			} else if (i > k && i <= (k + array2.length)) {

				arrayTotal[i] = array2[i - k - 1];

			} else {
				arrayTotal[i] = array1[i - array2.length];
			}
		}

		return arrayTotal;
	}

	
	private static int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		int temp = -1;

		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();
			System.out.println(message);
		}

		temp = scanner.nextInt();

		temp = check(temp, message);

		return temp;
	}

	
	private static int check(int temp, String message) {

		if (temp < 0) {

			System.out.println("Число k  не может быть отрицательным." + message);

			temp = enterInt(message);
		}
		return temp;
	}

	
	private static int checkMaxPosition(int[] array1, int position) {
		
		if (position > array1.length) {

			position = array1.length - 1;
		}
		
		return position;
	}

	
	private static void print(int[] array) {

		for (int element : array) {

			System.out.print(element + "  ");
		}

	}
}
