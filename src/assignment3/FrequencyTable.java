import java.util.Scanner;

public class FrequencyTable {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("How many dice would you like to use? ");
        int dice = in.nextInt();
        int min = dice * 1;
        int max = dice * 6;
        int[] freq = new int [(max - min) + 1];
        for (int n = 1; n <= 10000; n++) {
            int sum = 0;
            for (int d = 0; d < dice; d++) {
                sum += (int)(Math.random() * 6) + 1;
            } freq[sum - min]++;
            } System.out.println("Times each value was rolled with 4 dice over 10000 rolls");
            for (int i = 0; i < freq.length; i++) {
                System.out.println((i + min) + ": " + freq[i]);
            }
        }
}
