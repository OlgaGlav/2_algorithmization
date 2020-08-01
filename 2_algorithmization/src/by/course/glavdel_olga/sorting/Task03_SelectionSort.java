package by.course.glavdel_olga.sorting;
//Сортировка выбором.

//Дана последовательность чисел a1<=a2<=...<=an . Требуется переставить элементы так, чтобы они были расположены по 
// убыванию.Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый на место
//наибольшего. Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.

public class Task03_SelectionSort {

	public static void main(String[] args) {

		int[] array = new int[10];

		array = initialization(array);

		print(array);

		array = sort(array);

		print(array);
	}

	private static int[] sort(int[] array) {

		for (int i = 0; i < array.length; i++) {

			int max = array[i];

			int indexMax = i;

			for (int j = i; j < array.length; j++) {

				if (max < array[j]) {

					max = array[j];
					
					indexMax = j;
				}
			}

			int temp = array[i];

			array[i] = max;

			array[indexMax] = temp;

		}

		return array;
	}

	
	private static void print(int[] array) {

		for (int elem : array) {
			
			System.out.print(elem + "  ");
		}
		System.out.println();
	}

	
	private static int[] initialization(int[] array) {
		
		for (int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 100);
		}
		return array;
	}

}
