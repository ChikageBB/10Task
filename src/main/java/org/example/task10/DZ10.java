package org.example.task10;

import java.util.*;

public class DZ4{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String[] strArray = in.nextLine().split(" ");
        String subString = in.nextLine();
        

        func(strArray, subString);

    }

    public static void func(String[] array, String subString){
        for (int i = 0; i < array.length; i++){
            if ((array[i].toLowerCase()).contains(subString.toLowerCase())){
                System.out.println(i);
            }
        }

    }
}