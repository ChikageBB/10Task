package org.example.task10;

import java.util.*;


public class DZ1{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Введите n:");
        int n = in.nextInt();
    
        for (int i = 0; i < n; i++){
            int countSpaces = 2 * n - i + 1;
            int countStars = 2 * i + 1;

            for (int j = 0; j < countSpaces;j++){
                System.out.print(" ");
            }

            for (int j = 0; j < countStars; j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for (int i = 0; i < n; i++){
            int countStars = 2 * i + 1;
            int countSpaces = n - i;
            int countSpacesBetween = 2 * n + 1 - 2 * i;

            for (int j = 0; j < countSpaces; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < countStars; j++){
                System.out.print("*");
            }
            for (int j = 0; j < countSpacesBetween; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < countStars; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}