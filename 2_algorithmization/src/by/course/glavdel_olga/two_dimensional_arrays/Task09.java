package by.course.glavdel_olga.two_dimensional_arrays;
//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце.
//Определить какой столбец содержит максимальную сумму

public class Task09 {

	public static void main(String[] args) {
		int[][] array = new int[][] { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
		int[]arraySum=new int[array[0].length];
		
		arraySum=findSum(array);
		
		int column;
		
		column=findMaxSum(arraySum);
		
		System.out.println("Столбец "+column+ " содержит максимальную сумму.");
		
	}

	private static int findMaxSum(int[] arraySum) {
		
		int sumMax=arraySum[0];
		int column=0;
		
		for(int i=0; i<arraySum.length;i++) {
			
			if(sumMax<arraySum[i]) {
				
				sumMax=arraySum[i];
				column=i;
			}
		}
		return column;
	}

	
	private static int[] findSum(int[][] array) {
		
		int[]arraySum=new int[array[0].length];
		
		for(int i=0;i<array.length;i++) {
			
			int sum=0;
			
			for(int j=0; j<array[i].length;j++) {
				
				sum=sum+array[i][j];
			}
			arraySum[i]=sum;
			
			System.out.println("Сумма элементов столбца под индексом "+i+" равна "+sum);
		}
		return arraySum;
	}

}
