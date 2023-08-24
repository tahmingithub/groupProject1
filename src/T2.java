public class T2 {
    public static void main(String[] args) {

        //Create an array of integer values. After the array is created, calculate
        //the sum of all stored elements in that array.

            int[] array = {10, 20, 30, 40, 50};
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println(sum);
        }
    }

