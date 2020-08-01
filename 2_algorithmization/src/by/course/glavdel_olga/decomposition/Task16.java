package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//Написать программу, определяющую сумму n-значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме 

public class Task16 {

	public static void main(String[] args) {

		int digit = enterInt("Введите порядок числа ");

		int sum;

		int evenNumbers;

		sum = findSum(digit);

		System.out.println("Сумма равна " + sum);

		evenNumbers = findEvenNumbers(sum, (digit+1)*2);

		System.out.println("Количество четных цифр " + evenNumbers);

	}

	private static int findEvenNumbers(int number, int length) {
		
		int count =0;
		
		int[] array = new int[length];

		array = findArray(number, length);
		
		for(int i=0; i<array.length;i++) {
			
			if(array[i]!=0 && array[i]%2==0) {
				
				count= count +1;
			}
		}
		return count;
	}

	private static int findSum(int digit) {
		int begin;
		int end;
		boolean isOdd;

		int sum = 0;

		begin = (int) Math.pow(10, digit);

		end = begin * 10 - 1;

		for (int number = begin; number <= end; number++) {

			isOdd = checkIsOdd(number, digit + 1);

			if (isOdd) {
				sum = sum + number;
			}
		}
		return sum;
	}

	private static boolean checkIsOdd(int number, int length) {

		int[] array = new int[length];

		array = findArray(number, length);

		for (int i = 0; i < array.length; i++) {
			
			if (array[i] % 2 == 0) {
				
				return false;
			}
		}
		return true;
	}

	private static int[] findArray(int number, int length) {

		int[] array = new int[length];

		for (int i = 0; i < array.length; i++) {

			array[i] = number % 10;

			number = (number - array[i]) / 10;
		}
		return array;
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

		temp = checkPositiv(temp, message);

		return temp;
	}

	private static int checkPositiv(int temp, String message) {

		if (temp < 1) {
			temp = enterInt(message);
		}
		return temp - 1;
	}

}
