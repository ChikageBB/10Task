package org.example.task10;

public class DZ9 {
    public static void main(String[] args) {

        int n = args.length;
        int num = 0;
        int num2 = 0;

        for (int i = 0; i < n; i++){
            num += Integer.parseInt(args[i]) * pow(10, n - i - 1);
        }
        System.out.println(num);

        for (int i = 0; i < n; i++){
            num2+= Integer.parseInt(args[args.length - i - 1]) * pow(10, n - i - 1);
        }
        System.out.println(num2);

    }
    public static int pow(int x, int n){
        int res = 1;
        for (int i = 1; i <= n; i++){
            res = res * x;
        }
        return res;
    }
}