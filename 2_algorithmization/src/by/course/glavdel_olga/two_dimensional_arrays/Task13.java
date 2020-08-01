package by.course.glavdel_olga.two_dimensional_arrays;
//Отсортировать столбцы матрицы по возрастанию и убыванию значений элементов 

import java.util.Random;

public class Task13 {

	public static void main(String[] args) {
		int[][] array = new int[5][7];

		array = initialization(array);

		print(array);

		array = sortColumnIncrease(array);

		print(array);
		
		array = sortColumnDecrease(array);

		print(array);
	}


	private static int[][] sortColumnIncrease(int[][] array) {

		for (int columnNumber = 0; columnNumber < array[0].length; columnNumber++) {
			
			for (int indexRowCheck = 0; indexRowCheck < array.length; indexRowCheck++) {

				int min = array[indexRowCheck][columnNumber];
				int indexRowMin = indexRowCheck;

				for (int rowNumber =indexRowCheck; rowNumber < array.length; rowNumber++) {

					if (min > array[rowNumber][columnNumber]) {
						
						min = array[rowNumber][columnNumber];
						indexRowMin = rowNumber;

					}
				}

				int temp = array[indexRowCheck][columnNumber];
				
				array[indexRowCheck][columnNumber] = min;
				
				array[indexRowMin][columnNumber] = temp;
			}
		}
		return array;
	}

	
	private static int[][] sortColumnDecrease(int[][] array) {

		for (int columnNumber = 0; columnNumber < array[0].length; columnNumber++) {
			
			for (int indexRowCheck = 0; indexRowCheck < array.length; indexRowCheck++) {

				int max = array[indexRowCheck][columnNumber];
				int indexRowMax = indexRowCheck;

				for (int rowNumber =indexRowCheck; rowNumber < array.length; rowNumber++) {

					if (max < array[rowNumber][columnNumber]) {
						
						max = array[rowNumber][columnNumber];
						indexRowMax = rowNumber;

					}
				}

				int temp = array[indexRowCheck][columnNumber];
				
				array[indexRowCheck][columnNumber] = max;
				
				array[indexRowMax][columnNumber] = temp;
			}
		}
		return array;
	}

	private static int[][] initialization(int[][] array) {
		Random random = new Random();

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				array[i][j] = random.nextInt(10);
			}
		}
		return array;
	}

	private static void print(int[][] array) {

		for (int[] i : array) {
			for (int j : i) {

				System.out.print(j + "  ");
			}
			System.out.println();
		}
		System.out.println();
	}

}
