package by.course.glavdel_olga.sorting;

import java.util.Random;

//Даны дроби p1/q1, p2/q2, ...pn/qn. p,q -натуральные числа.
//составить программу, которая приводит эти дроби к общему знаменателю и 
//упорядочивает их в порядке возрастания

public class Task08 {

	public static void main(String[] args) {

		int[] arrayDenominator = new int[10];
		int[] arrayNumerator = new int[10];

		int[] arrayCommonDenominator = new int[arrayDenominator.length];
		int[] arrayNumeratorWithCommonDenominator = new int[arrayNumerator.length];

		int[] arrayCommonDenominatorSortIncrease = new int[arrayDenominator.length];
		int[] arrayNumeratorWithCommonDenominatorSortIncreace = new int[arrayNumerator.length];
		
		

		int totalDenominator;

		initialization(arrayDenominator);
		initialization(arrayNumerator);

		
		totalDenominator = findTotalDenominator(arrayDenominator, arrayNumerator);

		
		fillingArrayCommonDenominator(arrayCommonDenominator, totalDenominator);

		fillingArrayNumeratorWithCommonDenominator(arrayNumeratorWithCommonDenominator, totalDenominator,
				arrayNumerator, arrayDenominator);

		
		fillingArrayCommonDenominator(arrayCommonDenominatorSortIncrease, totalDenominator);
		
		arrayNumeratorWithCommonDenominatorSortIncreace = fillingNumeratorSortIncreace(
				arrayNumeratorWithCommonDenominator);

		print (arrayNumeratorWithCommonDenominatorSortIncreace);
		print(arrayCommonDenominatorSortIncrease);
			}

	private static int findTotalDenominator(int[] arrayDenominator, int[] arrayNumerator) {

		convertingDenominator(arrayDenominator, arrayNumerator);

		int totalDenominator = 1;

		for (int i = 0; i < arrayDenominator.length; i++) {

			if (totalDenominator % arrayDenominator[i] != 0) {

				totalDenominator = totalDenominator * arrayDenominator[i];
			}

		}
		return totalDenominator;
	}

	private static void convertingDenominator(int[] arrayDenominator, int[] arrayNumerator) {

		for (int i = 0; i < arrayDenominator.length; i++) {

			for (int j = 0; j < arrayDenominator.length; j++) {

				if (arrayDenominator[i] % arrayDenominator[j] == 0) {

					if (arrayDenominator[i] > arrayDenominator[j]) {

						arrayNumerator[j] = arrayNumerator[j] * (arrayDenominator[i] / arrayDenominator[j]);

						arrayDenominator[j] = arrayDenominator[i];
					}

					if (arrayDenominator[i] < arrayDenominator[j]) {

						arrayNumerator[i] = arrayNumerator[i] * (arrayDenominator[j] / arrayDenominator[i]);

						arrayDenominator[i] = arrayDenominator[j];
					}
				}
			}
		}
	}

	private static void fillingArrayCommonDenominator(int[] arrayCommonDenominator, int totalDenominator) {

		for (int i = 0; i < arrayCommonDenominator.length; i++) {

			arrayCommonDenominator[i] = totalDenominator;
		}
	}

	private static void fillingArrayNumeratorWithCommonDenominator(int[] arrayNumeratorWithCommonDenominator,
			int totalDenominator, int[] arrayNumerator, int[] arrayDenominator) {

		for (int i = 0; i < arrayNumeratorWithCommonDenominator.length; i++) {

			arrayNumeratorWithCommonDenominator[i] = totalDenominator / arrayDenominator[i] * arrayNumerator[i];
		}
	}

	private static int[] fillingNumeratorSortIncreace(int[] array) {

		int countChange = -1;

		while (countChange != 0) {

			countChange = 0;

			for (int i = 0; i < array.length - 1;) {

				if (array[i] <= array[i + 1]) {

					i++;

				} else {

					int temp = array[i];

					array[i] = array[i + 1];

					array[i + 1] = temp;

					countChange++;

					if (i > 1) {

						i--;
					}

				}
			}
		}
		return array;
	}

	
	private static void initialization(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(3) + 1;
		}
	}

	
	private static void print(int[] array) {

		for (int element : array) {

			System.out.printf("%4d", element);
		}
		System.out.println();
	}

}
