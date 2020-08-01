package by.course.glavdel_olga.decomposition;

import java.util.Scanner;

//Вычислить площадь правильного шестиугольника стороной а,  используя метод вычисления площади треугольника

public class Task03 {

	public static void main(String[] args) {
		int side;

		double areaHexagon;

		side = enterInt("Введите длину стороны шестиугольника");

		areaHexagon = findAreaHexagon(side);
		
		System.out.printf("%.4f",areaHexagon);

	}

	private static double findAreaHexagon(int side) {

		double areaHexagon;

		areaHexagon = 6 * areaTriangle(side);

		return areaHexagon;
	}

	private static double areaTriangle(int side) {
		
		double areaTriangle;
		
		areaTriangle = Math.sqrt(3) / 4 * Math.pow(side, 2);
		
		return areaTriangle;
	}

	private static int enterInt(String message) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println(message);

		while (!scanner.hasNextInt()) {

			scanner.next();
			System.out.println(message);
		}
		return scanner.nextInt();
	}
}
