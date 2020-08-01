package by.course.glavdel_olga.decomposition;

//Натуральное число,  в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 

//возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k.

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {

		int end = enterInt("Введите верхний предел ");

		int[] numbersArmstrog = new int[10+end/100000];

		findNumbersArmstrog(numbersArmstrog, end);
		
		print(numbersArmstrog);

	}

	private static void findNumbersArmstrog(int[] numbersArmstrog, int end) {
		
		int index =0;
		
		for (int i = 1; i < end; i++) {

			int length = findLength(i);

			int[] arrayNumber = findArray(i, length);

			int sum = findSum(arrayNumber);
			
			if((int)(Math.pow(sum, length))==i){
				
				numbersArmstrog[index]=i;
				
				index++;
				
				i++;
			}

		}

	}

	private static int findSum(int[] array) {
		
		int sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			
			sum = sum + array[i];
		}
		return sum;
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

	private static void print(int[] array) {

		for (int i :array) {

			System.out.print(i+" ");
		}
		System.out.println();
	}
}
