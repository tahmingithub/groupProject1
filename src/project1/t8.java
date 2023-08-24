package project1;

public class t8 {
    public static void main(String[] args) {
        //   max and min in an array
        int[] nums = {1, 3, 7, 8, 4, 10, 16, 22, 57, 44};
        int min = nums[0];
        int max = nums[0];
        for (int i = 0; i <= 9; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];

            System.out.println("The minimum number in the array is " + min + " and the maximum number in the array is " + max);
        }
    }


}
