package by.course.glavdel_olga.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//Дана последовательность целых чисел а1,а2,...,	аN. Образовать новую последовательность
//выбросив их исходной те члены, которые равны min(a1,a2,....an)

public class Task8 {

	static int countMinElement = 0;

	public static void main(String[] args) {

		int lenght = enterInt("Введите размер массива ");

		int[] array = new int[lenght];

		arrayInitialization(array);

		print(array);
		

		int min = findMin(array);

		int countMinElement = findCountMin(array, min);

		int[] arrayNew = createArrayNew(array, min, countMinElement);
		
		print (arrayNew);

	}
	

	private static int[] createArrayNew(int[] array, int min, int countMinElement) {
		int[] arrayNew = new int[array.length - countMinElement];
		int tempIndex = 0;
		
		for (int element : array) {
			if (element != min) {
				
				arrayNew[tempIndex] = element;
				tempIndex++;
			}
		}
		return arrayNew;
	}

	private static int findCountMin(int[] array, int min) {
		int count = 0;

		for (int element : array) {

			if (element == min) {
				count++;
			}
		}
		return count;
	}

	private static int findMin(int[] array) {
		int min = array[0];

		for (int element : array) {
			
			if (element < min) {
				min = element;
			}
		}
		return min;
	}

	
	
	private static void arrayInitialization(int[] array) {
		
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(array.length) - array.length / 2;
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
