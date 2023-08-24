package project1;

public class t3 {
    public static void main(String[] args) {

        //Create a 2D array or integer type where you will store odd and even
        //numbers. Develop a program which will identify/print the even
        //numbers only.

        int[][] numbers = {
                {7, 8, 11, 18},
                {19, 12, 55, 44}};
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                if (numbers[row][col] % 2 == 0) {
                    System.out.print(numbers[row][col] + " ");
                }
            }
            System.out.println();
        }

    }
}
