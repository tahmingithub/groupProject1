package project1;

public class t4 {
    public static void main(String[] args) {

        //Create a 2D array of integers. Develop a program which will calculate
        //the sum of even and odd numbers for that array.

        int[][] array = {
                {4, 3, 6, 9},
                {8, 11, 20, 13},
                {14, 15, 22, 17}};
        int sumE = 0;
        int sum0 = 0;
        for (int[] i : array) {
            for (int b : i) {
                if (b % 2 == 0) {
                    sumE = sumE + b;
                } else if (b % 2 != 0) {
                    sum0 = sum0 + b;
                }
            }
        }
        System.out.println("The sum of even numbers is " + sumE);
        System.out.println("The sum of odd numbers is " + sum0);
    }
}
