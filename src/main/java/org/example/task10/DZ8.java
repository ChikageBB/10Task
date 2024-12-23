package org.example.task10;

import java.util.*;

public class DZ8{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[] arr = new int[n];

        arr[0] = 1;
        for (int i = 1; i < n; i++){
            if (i % 2 == 0){
                arr[i] = abs(arr[i - 1]) + 2;
            }else{
                arr[i] = -1 * (abs(arr[i - 1] + 2));
            }
        }

        System.out.println(Arrays.toString(arr));
    }
    public static int abs(int x){
        if (x < 0){
            return -x;
        }
        return x;
    }
}