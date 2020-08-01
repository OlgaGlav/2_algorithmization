package by.course.glavdel_olga.decomposition;
//На плоскости заданы своими координатами n точек. Написать методы, определяющие, между какими из пар точек самое большое расстояние

import java.util.Random;
import java.util.Scanner;

import static java.lang.Math.*;

public class Task04 {

	public static void main(String[] args) {

		int numberPoint; // количество точек

		double[] maxDistance = new double[3];// расстояние, индексы точек

		numberPoint = enterInt("Введите количество точек ");

		double[] distance = new double[numberPoint]; // max дистанция между одной точкой и всеми остальными

		int[] index = new int[numberPoint]; // индекс второй точки, если расстояние максимальное

		int[] coordinateX = new int[numberPoint];

		int[] coordinateY = new int[numberPoint];

		initialization(coordinateX);
		initialization(coordinateY);

		print(coordinateX);
		print(coordinateY);

		distance = findDistance(coordinateX, coordinateY, index);

		maxDistance = findMax(distance, index);

		System.out.printf("Максимальная дистанция %.2f", maxDistance[0]);

		System.out.println(" между точками с индексами " + maxDistance[1] + "  и " + maxDistance[2]);

	}

	private static double[] findDistance(int[] coordinateX, int[] coordinateY, int[] index) {

		double[] resultMax = new double[coordinateX.length];

		for (int i = 0; i < coordinateX.length; i++) {

			double max = 0;

			double distance;

			for (int j = i + 1; j < coordinateY.length; j++) {

				distance = distance(coordinateX[i], coordinateY[i], coordinateX[j], coordinateY[j]);

				if (distance > max) {

					max = distance;

					resultMax[i] = max;

					index[i] = j; // индекс второй точки
				}
			}
		}
		return resultMax;
	}

	private static double[] findMax(double[] array, int[] index) {

		double[] max = { 0.0, 0.0, 0.0 };

		for (int i = 0; i < array.length; i++) {

			if (array[i] > max[0]) {

				max[0] = array[i];

				max[1] = i;

				max[2] = index[i];
			}
		}

		return max;
	}

	private static double distance(int firstPointX, int firstPointY, int secondPointX, int secondPointY) {

		return sqrt(pow((secondPointX - firstPointX), 2) + pow((secondPointY - firstPointY), 2));

	}

	private static void initialization(int[] array) {

		Random random = new Random();

		for (int i = 0; i < array.length; i++) {

			array[i] = random.nextInt(5);
		}

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

	private static void print(int[] array) {

		for (int element : array) {

			System.out.printf("%4d", element);
		}
		System.out.println();
	}

}
