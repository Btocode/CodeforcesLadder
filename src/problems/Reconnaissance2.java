package problems;

import java.util.Scanner;

public class Reconnaissance2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] soldiers = new int[n];
        for (int i = 0; i < n; i++) {
            soldiers[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int index1 = 0;
        int index2 = 0;
        for (int i = 0; i < n; i++) {
            int diff = Math.abs(soldiers[i] - soldiers[(i + 1) % n]);
            if (diff < min) {
                min = diff;
                index1 = i;
                index2 = (i + 1) % n;
            }
        }
        System.out.println((index1 + 1) + " " + (index2 + 1));
    }
}
