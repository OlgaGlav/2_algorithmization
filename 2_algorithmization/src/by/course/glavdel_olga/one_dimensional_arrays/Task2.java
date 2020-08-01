package by.course.glavdel_olga.one_dimensional_arrays;

import java.util.Scanner;

//Дана последовательность действительных чисел а1,а2,...,	аN. 
//Заменить все члены, больше данного Z, этим числом.Посчитать количество замен

public class Task2 {

	static int count = 0;

	public static void main(String[] args) {
		int[] array = new int[] { 2, 5, 8, 2, 5, 8, 3, 6, 9, 1, 4, 7 };

		int z = enterInt("Введите число Z ");

		int[] arrayNew = replace(array, z);

		print(arrayNew);

		System.out.println("Количество замен: " + count);

	}

	private static int[] replace(int[] array, int z) {
		
		for (int element : array)
			
			if (element > z) {
				element = z;
				count++;
			}

		return array;

	}

	private static void print(int[] array) {

		for (int element : array) {
			System.out.print(element + " ");
		}

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
