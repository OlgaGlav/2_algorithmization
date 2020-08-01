package by.course.glavdel_olga.one_dimensional_arrays;

import java.util.Random;
import java.util.Scanner;

//Даны действительные числа а1,а2,...,аN.
//Поменять местами наибольший и наименьший элемент

public class Task4 {

	public static void main(String[] args) {

		int lenght = enterInt("Введите размер массива ");

		int[] array = new int[lenght];

		arrayInitialization(array);

		print(array);
		
		int[] arrayNew =replace(array);
		
		print(arrayNew);

	}

	private static int[] replace(int[] array) {
		int min=0;
		int max=0;
		
		int indexMin=0;
		int indexMax=0;
		
		for(int i=0;i<array.length;i++) {
			
			if(array[i]> max) {
				max=array[i];
				indexMax=i;
				
			} else if(array[i]<=min) {
				min=array[i];
				indexMin=i;
			}
		}

		array[indexMax]=min;
		array[indexMin]=max;
		
		return array;
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
