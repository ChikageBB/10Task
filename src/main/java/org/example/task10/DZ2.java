package org.example.task10;

import java.util.*;

public class DZ2{
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int k, m;
		System.out.println("Введите k и m: ");
		k = in.nextInt();
		m = in.nextInt();

		if (k > m){
			System.out.println("Ошибка");
		}else{
			for (int i = k; i < m; i++){
				if (i % 3 == 0){
					System.out.println(i);
				}
			}
		}
	}
}