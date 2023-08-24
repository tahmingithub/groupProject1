package project1;

public class t10 {
    public static void main(String[] args) {
        //Write a program to print out duplicate elements from an Array of
        //Strings?
        String[] names = {"Sam", "Mike", "john", "ewan", "lori", "mike", "asil", "loren"};
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if ((names[i].equals(names[j])) && (i != j)) {
                    System.out.println("Duplicate name is: " + names[j]);
                }

            }
        }
    }
}
