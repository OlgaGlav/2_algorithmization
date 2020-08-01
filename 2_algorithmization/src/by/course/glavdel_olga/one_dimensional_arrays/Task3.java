package by.course.glavdel_olga.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//Дан массив действительных чисел, размерность которго N.
//Посчитать, сколько в нем отрицательных, положительных и нулевых элементов.

public class Task3 {

	static int countPositive = 0;
	static int countNegative = 0;
	static int countZero = 0;

	public static void main(String[] args) {

		int lenght = enterInt("Введите размер массива ");

		int[] array = new int[lenght];

		arrayInitialization(array);

		print(array);

		countElements(array);

		System.out.println("Количество отрицательных элементов: " + countNegative);
		System.out.println("Количество нулевых элементов: " + countZero);
		System.out.println("Количество положительных элементов: " + countPositive);

	}

	private static void countElements(int[] array) {
		for (int element : array) {
			if (element > 0) {
				countPositive++;
			} else if (element == 0) {
				countZero++;
			} else {
				countNegative++;
			}
		}

	}

	private static void arrayInitialization(int[] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100) - 50;
		}

	}

	private static void print(int[] array) {

		for (int element : array) {
			System.out.print(element + " ");
		}
		
		System.out.println();
	}

	
	private static int enterInt(String message) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);
		while (!scanner.hasNextInt()) {
			scanner.next();
			System.out.println("Некорректный ввод. " + message);
		}

		return scanner.nextInt();
	}
}
