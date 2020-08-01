package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//Два простых числа называются близнецами, если они отличаются друг от лруга на 2 ( например, 41 и 43).
//Найти и напечатать все пары близнецов из отрезка [n, 2n], где n - заданное натуральное число больше2.
// Для решения задачи использовать декомпозицию


public class Task13 {

	public static void main(String[] args) {
		
		int begin= enterInt("Введите начало отрезка. ");
		
		int[] arrayTwins = new int[2*begin-1];
		
		initialization(arrayTwins, begin);
		
		print(arrayTwins);
		

	}

	private static void initialization(int[] arrayTwins, int begin) {
		int index=0;
		
		for(int i=begin; i<begin*2-1;i++) {
			
			arrayTwins[index]=i;
			
			arrayTwins[index+1]=i+2;
			
			index=index+2;
			
		}
		
		
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

		for(int i=0; i<array.length-1;i=i+2) {

			System.out.print(array[i] + "-"+array[i+1]+"   ");
		}
		System.out.println();
	}

}
