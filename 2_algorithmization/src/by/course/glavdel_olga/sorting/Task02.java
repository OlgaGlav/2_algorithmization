package by.course.glavdel_olga.sorting;

// Даны две последовательности a1<=a2<=...<=an и b1<=b2<=...<=bm.
//Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей
//Дополнительный массив не использовать

public class Task02 {

	public static void main(String[] args) {

		int[] array1 = { 2, 3, 3, 7, 9, 11, 13, 15, 17 };
		int[] array2 = { 1, 4, 6, 8, 20 };

		int[] arrayTotal = unit(array1, array2);

		print(arrayTotal);

	}

	private static int[] unit(int[] array1, int[] array2) {

		int[] arrayTotal = new int[array1.length + array2.length];

		int index = 0;

		index = insert(array1, arrayTotal, index);

		insert(array2, arrayTotal, index);

		sort(arrayTotal);

		return arrayTotal;
	}

	
	private static void sort(int[] array) {
		
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

	}

	private static int insert(int[] array1, int[] arrayTotal, int index) {

		for (int i = 0; i < array1.length; i++) {

			arrayTotal[index] = array1[i];

			index++;
		}
		return index;
	}

	private static void print(int[] array) {

		for (int elem : array) {

			System.out.print(elem + "  ");
		}
	}

}
