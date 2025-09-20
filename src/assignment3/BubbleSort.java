import java.util.Scanner;

public class BubbleSort {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many values would you like in your array? ");
        int n = in.nextInt();
        int[] array = new int [n];
        for (int i = 0; i < array.length; i++) {
            System.out.print("What is the number for value " + (i + 1) + " in the array? ");
            array[i] = in.nextInt();
        }  System.out.println("Given values: ");
            for (int num : array) {
                System.out.print(num + " ");
            } System.out.println();
            for (int i = 0; i < (array.length - 1); i++) {
                 for (int j = 1; j < (array.length - 1); j++) {
                    if (array[j-1] > array[j]) {
                        int temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                }
            }} System.out.println("Sorted values: ");
            for (int num : array) {
                System.out.print(num + " ");
        }
}}
