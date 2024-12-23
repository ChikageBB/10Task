package org.example.task10;

import java.util.*;

public class DZ3{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите x: ");
		double x = in.nextDouble();
		double squareX = 0;

		for (double i = 1; i > 0.0000001; i /= 10){
			while(true){
				if (squareX * squareX == x){
					System.out.printf("Square root %.0f = %.6f\n", x, squareX);
					System.exit(0);

				}else if (squareX * squareX > x){
					squareX -= i;
					break;
				}else{
					squareX += i;
				}

			}
		}
		System.out.printf("Square root %.0f = %.6f\n", x, squareX);
	}
}