package by.course.glavdel_olga.sorting;

import java.util.Arrays;

//Пусть даны две неубывающие последовательности действительных чисел a1<=a2<=...<=an и
//b1<=b2<=...<=bm
//Требуется указать те места, на которые нужно вставлять элементы последовательности
//b1<=b2<=...<=bm в первую последовательность так, чтобы новая последовательность была возрастающая

public class Task07 {

	public static void main(String[] args) {

		int[] arrayA = { 1, 2, 5, 7, 9 };
		int[] arrayB = { 2, 4, 6, 8 };

		int[] indexForInsert = new int[arrayB.length];

		indexForInsert =findIndex(arrayA, arrayB);

		print(indexForInsert);
	}

	private static int[] findIndex(int[] arrayA, int[] arrayB) {
		
		int [] arrayIndex=new int[arrayB.length];
		
		for(int i=0; i<arrayB.length;i++) {
			
			arrayIndex[i] = Math.abs(Arrays.binarySearch(arrayA, arrayB[i])+1);
			
		}
		return arrayIndex;
	}

	private static void print(int[] array) {

		for (int element : array) {

			System.out.print(element + " ");
		}
	}

}
