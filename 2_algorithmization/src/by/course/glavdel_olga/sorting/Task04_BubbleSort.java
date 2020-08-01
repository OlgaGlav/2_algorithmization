package by.course.glavdel_olga.sorting;

//Сортировка обменами
//Дана последовательность чисел a1>=a2>=...>=an . Требуется переставить числа  в порядке возрастания
//Для этого сравниваются два соседних числа и ai и a(i+1). Если ai > a(i+1), то делается перестановка
//Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

public class Task04_BubbleSort {

	public static void main(String[] args) {

		int[] array = { 9,8,7,6,5,4,4,4,3,2,1};

		sort(array);

		print(array);

	}

	private static int[] sort(int[] array) {

		int numberPermutationsTotal = 0;

		int numberPermutations = 0;

		do {
			numberPermutations = 0;

			for (int i = 0; i < array.length - 1; i++) {

				if (array[i + 1] < array[i]) {

					int temp = array[i];

					array[i] = array[i + 1];

					array[i + 1] = temp;

					numberPermutations++;
				}
				numberPermutationsTotal = numberPermutationsTotal + numberPermutations;
			}
		} while (numberPermutations != 0);

		System.out.println("Общее число перестановок  " + numberPermutationsTotal);

		return array;
	}

	private static void print(int[] array) {

		for (int elem : array) {

			System.out.print(elem + "  ");
		}
		System.out.println();
	}

}
