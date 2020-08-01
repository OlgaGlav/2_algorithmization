package by.course.glavdel_olga.sorting;

//Сортировка вставками
//Дана последовательность чисел a1<=a2<=...<=an . Требуется переставить числа  в порядке возрастания
//Пусть а1,а2,...,аi - упорядоченная последовательность, т.е.а1<=a2<=...<=ai. Берется следующее число а(i+1) 
// и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
//Процесс производится до тех пор, пока все элементы от i+1 до n не будут перебраны.
//Примечание: Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
//Двоичный поиск оформить в виде отдельной функции

public class Task05_InsertionSort {

	public static void main(String[] args) {

		int[] array = { 1, 3, 5, 7, 9, 11, 13, 14, 8, 6, 4, 10, 15, 12 };

		int indexLastSortElement = 7;

		print(array);

		sort(array, indexLastSortElement);

		print(array);

	}

	private static void sort(int[] array, int indexLastSortElement) {

		for (int i = indexLastSortElement + 1; i < array.length; i++) {

			int indexCheckElement = findIndex(array, array[i], i);
			
			int temp = array[i];
		
			for (int j = i; j > indexCheckElement; j--) {

				array[j] = array[j - 1];
			}
			
			array[indexCheckElement] = temp;
		}

	}

	private static int findIndex(int[] array, int element, int indexLastSortElement) {

		int begin = 0;
		int end = indexLastSortElement;

		int middle = (begin + end) / 2;

		while (begin <= end) {

			middle = (begin + end) / 2;

			if (element >= array[middle] && element <= array[middle + 1]) {

				return middle + 1;
			}

			if (element > array[middle]) {

				begin = middle;

			} else if (element < array[middle]) {

				end = middle;
			}
		}
		return 0;
	}


	private static void print(int[] array) {
		
		for (int elem : array) {
			
			System.out.print(elem + "  ");
		}
		System.out.println();
	}
}
