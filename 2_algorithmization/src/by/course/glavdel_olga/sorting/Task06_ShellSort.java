package by.course.glavdel_olga.sorting;

import java.util.Random;

//Сортировка Шелла

//Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Сравниваются два соседних элемента  ai и a(i+1). Если ai<=a(i+1), то продвигаются 
//на один элемент вперед. Если ai>a(i+1), то производится перестановка и сдвигаются на один элемент 
//назад. Составить алгоритм этой сортировки

public class Task06_ShellSort {

	public static void main(String[] args) {
		int[] array = new int[10];

		initialization(array);

		print(array);

		sort(array);

		print(array);

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
					
					if(i>1) {
						
						i--;
					}

				}
			}
		}

	}

	private static void initialization(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(100);
		}

	}

	private static void print(int[] array) {

		for (int element : array) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

}
