package org.example.task10;

import java.util.*;

public class DZ5{
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		System.out.println("Введите x: ");
		double x = in.nextDouble();

		double res = x;
		int n = 1;
		int signum = 1;
		double term = x;


		while (abs(term) > 1e-9){
			signum = -signum;
			n++;
			term *= x/n;
			n++;
			term *= x/n;
			res += signum * term;

		}

		System.out.println(res);
	}
	public static double abs(double x){
		if (x < 0){
			return -x;
		}return x;
	}
}