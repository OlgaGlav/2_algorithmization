package by.course.glavdel_olga.one_dimensional_arrays;

//Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него каждый второй элемент
//(освободившиеся элементы заполнить 0)
//Дополнительный массив не создавать

public class Task10 {

	public static void main(String[] args) {
		int[] array = new int[] { 6, 2, 6, 4, 8, 6, 4, 2, 3, 1, 1, 4 };

		changeValue(array);
		zipArray (array);

		print(array);

	}

	private static void zipArray(int[] array) {
		int tempIndex=1;
		for(int i=1; i<array.length;i++) {
			if(array[i]!=0) {
				array[tempIndex]=array[i];
				array[i]=0;
				tempIndex++;
			}
		}
		
	}

	private static void changeValue(int[] array) {

		for (int i = 0; i < array.length; i++) {

			if (i % 2 != 0) {
				array[i] = 0;
			}
		}
	}

	private static void print(int[] array) {
		for (int element : array) {
			System.out.print(element + " ");
		}

	}

}
