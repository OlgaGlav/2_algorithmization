package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//Написать методы для нахождения наибольшего общего делителя и наименьшего общего кратного двух натуральных чисел
// НОК(А,В)=А*В/НОД(А,В)

public class Task01 {

	public static void main(String[] args) {
		int numberOne;
		int numberTwo;

		int[] dividersNumberOne;
		int[] dividersNumberTwo;

		int maxCommonDivisor;
		int minCommonMultiple;

		numberOne = enterInt("Введите первое число. ");
		numberTwo = enterInt("Введите второе число. ");

		dividersNumberOne = findDividers(numberOne);
		dividersNumberTwo = findDividers(numberTwo);

		maxCommonDivisor = findMaxCommonDivisor(dividersNumberOne, dividersNumberTwo);
		System.out.println(maxCommonDivisor);

		minCommonMultiple = findMinCommonMultiple(numberOne, dividersNumberOne, numberTwo, dividersNumberTwo);
		System.out.println(minCommonMultiple);

	}

	private static int findMinCommonMultiple(int numberOne, int[] dividersnumberOne, int numberTwo,
			int[] dividersnumberTwo) {
		
		int minCommonMultiple = 0;

		if (length(dividersnumberOne) == 2 && length(dividersnumberTwo) == 2) {
			minCommonMultiple = numberOne * numberTwo;
		}

		if (numberOne % numberTwo == 0) {
			minCommonMultiple = numberOne;
		}

		if (numberTwo % numberOne == 0) {
			minCommonMultiple = numberTwo;
		}

		if(minCommonMultiple == 0) {
			
			for(int i=2; i<numberTwo;i++ ) {

				if(((numberOne*i)%numberTwo==0)) {
					
					return numberOne*i;
				}
			}
		}		
		return minCommonMultiple;
	}

	
	private static int length(int[] array) {
		
		if (array.length==2 ||array[3]==0) {
			return 2;
		}
		return 3;
	}

	
	private static int[] findDividers(int number) {

		int[] dividers = new int[number / 2 + 1];

		int index = 0;

		for (int i = 1; i <= number; i++) {

			if (number % i == 0) {

				dividers[index] = i;
				index++;
			}
		}
		return dividers;
	}

	
	private static int findMaxCommonDivisor(int[] dividersnumberOne, int[] dividersnumberTwo) {

		for (int i = dividersnumberOne.length - 1; i >= 0; i--) {

			for (int j = dividersnumberTwo.length - 1; j >= 0; j--) {

				if (dividersnumberOne[i] == dividersnumberTwo[j] && dividersnumberOne[i] != 0) {

					return dividersnumberTwo[j];
				}
			}
		}
		return -1;
	}


	private static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();
			System.out.println(message);
		}
		return scanner.nextInt();
	}

}
