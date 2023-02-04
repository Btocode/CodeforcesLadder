package problems;

import java.util.Scanner;

public class SoftDrinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int l = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int p = sc.nextInt();
        int nl = sc.nextInt();
        int np = sc.nextInt();

        int total = 0;
        int totalLimes = 0;
        int totalSalt = 0;
        int totalDrinks = 0;


        totalDrinks = (k * l) / nl;
        totalLimes = c * d;
        totalSalt = p / np;

        total = Math.min(totalDrinks, Math.min(totalLimes, totalSalt));
        System.out.println(total / n);

    }
}
