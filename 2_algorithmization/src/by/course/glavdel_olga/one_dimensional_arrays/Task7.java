package by.course.glavdel_olga.one_dimensional_arrays;

//Даны действительные числа а1,а2,...,а(2n).

//найти max(a1+a(2n),a2+a(2n-1),...,an+a(n+1)

public class Task7 {

	public static void main(String[] args) {
		double[] array = new double[] { 1.5, 2.7, 3.8, 4.9, 5.0, 7.8, 9.0, 1.5 };

		double max = findMax(array);

		System.out.println(max);
	}

	private static double findMax(double[] array) {
		double max = 0.0;

		for (int i = 0; i < array.length / 2; i++) {
			
			if (array[i] + array[array.length - 1 - i] > max) {
				
				max = array[i] + array[array.length - 1 - i];
			}
		}
		return max;
	}

}
