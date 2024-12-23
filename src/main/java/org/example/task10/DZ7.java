package org.example.task10;

import java.util.*;

public class DZ7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите кол-во чисел: ");
        int n = in.nextInt();

        int count = 0;
        for (int i = 0; i < n; i++){
            int num = in.nextInt();
            if (digit(num)){
                count++;
            }
        }

        if (count == 3){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }

    public static boolean digit(int x){
        String s = "" + x;
        int[] arr = new int[s.length()];

        for (int i = arr.length - 1; i >= 0; i--){
            arr[i] = x % 10;
            x /= 10;
        }
        
        boolean flag = true;
        for (int i = 0; i < arr.length; i++){
            for (int j = i; j < arr.length; j++){
                if (arr[i] < arr[j]){
                    flag = false;
                    break;
                }
            }
        }

        return flag;
    }
}