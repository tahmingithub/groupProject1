package project1;

public class t2 {
    public static void main(String[] args) {
        //Create an array of integer values. After the array is created, calculate
        //the sum of all stored elements in that array.

        int[] age = {5, 17, 24, 43, 33};
        int sum = 0;
        for (int i = 0; i < age.length; i++) {
            sum = sum + age[i];
        }
        System.out.println(sum);
    }
}
