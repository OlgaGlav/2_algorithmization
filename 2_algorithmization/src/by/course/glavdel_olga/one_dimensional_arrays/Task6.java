package by.course.glavdel_olga.one_dimensional_arrays;


//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами

public class Task6 {

	public static void main(String[] args) {

		double[] array = new double[] {1.5,2.7,3.8,4.9,5.0,7.8,9.0};

		double sum = findSum(array);
		
		System.out.println(sum);

	}

	private static double findSum(double[] array) {
		double sum = 0;
		
		for (int i = 0; i < array.length; i++) {
			int count = 0;
			
			for (int j = 1; j < array.length; j++) {
				
				if ((i + 1) % j == 0) {
					count++;
				}
			}
			
			if (count <= 2) {
				sum = sum + array[i];
			}
		}
		return sum;
	}

}
