package org.example.task10;

import java.util.*;

public class DZ6{
	public static void main(String[] args){


		// System.out.println("Введите коэффициенты квадратного уравнения: ");
		Scanner in = new Scanner(System.in);
		// int a, b, c = in.nextInt();
		// quadraticEquation(3, -14, -5);
		// System.out.println("---------------------");

		// double x = in.nextDouble();
		// System.out.println(squareRoot(x));
		System.out.println(2.0 - 1.1);
	}

	public static void quadraticEquation(double a, double b, double c){
		double disc = b * b - 4 * a * c;

		if (disc > 0){
			double x1 = (-b + squareRoot(disc)) / (2 * a);
			double x2 = (-b - squareRoot(disc)) / (2 * a);
			System.out.println("x1 = " + x1 + " | x2  = " + x2);
		}else if (disc == 0){
			double x = -b / (2 * a);
			System.out.println("x = " + x);
		}else{
			System.out.println("Корней нет");
		}

	}

	public static double squareRoot(double x){
		double squareX = 0;

		for (double i = 1; i > 0.0000001; i /= 10){
			while(true){
				if (squareX * squareX == x){
					return squareX;
				}else if (squareX * squareX > x){
					squareX -= i;
					break;
				}else{
					squareX += i;
				}
			}
		}

		return squareX;	
	}
}