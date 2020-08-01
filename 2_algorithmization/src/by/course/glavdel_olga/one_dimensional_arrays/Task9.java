package by.course.glavdel_olga.one_dimensional_arrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число
// Если таких чисел несколько, то определить наименьшее из них

public class Task9 {

	public static void main(String[] args) {
		int[] array = new int[] { 6, 2, 6, 4, 8, 6, 4, 2, 3, 1, 1, 4 };

		int countMax = 0;
		int elementMin = array[0];

		for (int i = 0; i < array.length; i++) {
			
			int countElement = 0;
			int valueElement = array[i];

			for (int j = i; j < array.length; j++) {
				if (array[i] == array[j]) {
					countElement++;
				}
			}
			
			if (countElement > countMax) {
				
				countMax = countElement;
				valueElement = array[i];
				
			} else if (countElement == countMax) {

				if (valueElement < elementMin) {
					elementMin = valueElement;
				}

			}

		}
		
		System.out.print("Наиболее часто встречающееся число " + elementMin);

	}
}
