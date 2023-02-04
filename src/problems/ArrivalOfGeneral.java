package problems;

import java.util.Scanner;

public class ArrivalOfGeneral {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        int min = 100;
        int maxIndex = 0;
        int minIndex = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;
            }
            if (arr[i] <= min) {
                min = arr[i];
                minIndex = i;
            }
        }
        if (maxIndex > minIndex) {
            System.out.println(maxIndex + (n - 1 - minIndex) - 1);
        } else {
            System.out.println(maxIndex + (n - 1 - minIndex));
        }
    }
}
