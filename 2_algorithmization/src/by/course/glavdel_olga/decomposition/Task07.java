package by.course.glavdel_olga.decomposition;

//Написать метод (методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9

public class Task07 {

	public static void main(String[] args) {
		
	int sum;
	
	final int start =1;
	final int end =9;
	
	sum=findSumFactorial(start, end);
	
	System.out.println(sum);

	}

	private static int findSumFactorial(int start, int end) {
		int sum=0;
		
		for (int i=start; i<=end;i=i+2) {
			
			sum=sum+findFactorial(i);
		}
		return sum;
	}

	private static int findFactorial(int number) {
		
	int factorial=1;
	
	for(int i=1;i<=number;i++ ) {
		
		factorial=factorial*i;
	}
		return factorial;
	}

}
