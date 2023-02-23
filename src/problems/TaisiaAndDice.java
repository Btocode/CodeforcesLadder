package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaisiaAndDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int s = sc.nextInt();
            int r = sc.nextInt();
            int stolenDice = s - r;
            int remainingSum = s - stolenDice;
            int x = remainingSum / (n - 1);
            int remainder = remainingSum % (n - 1);
            System.out.print(stolenDice + " ");
            for (int i = 0; i < n - 1; i++) {
                if (remainder > 0) {
                    System.out.print(x + 1 + " ");
                    remainder--;
                } else {
                    System.out.print(x + " ");
                }
            }
        }
    }
}
