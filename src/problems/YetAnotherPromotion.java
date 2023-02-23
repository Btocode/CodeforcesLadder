package problems;
import java.util.Scanner;

public class YetAnotherPromotion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while(t-- > 0) {
            long a = sc.nextLong(); // price of day 1
            long b = sc.nextLong(); // price of day 2
            long n = sc.nextLong(); // amount to buy
            long m = sc.nextLong(); // amount to get promotion

            System.out.println(Math.min(calculateWithoutPromotion(a,b,n),calculateWithPromotion(a,b,n,m)));
        }
    }

    private static long calculateWithPromotion(long a, long b, long n, long m) {
        long promos = n / (m+1);
        long remaining = n % (m+1);
        return (promos * m * a) + (remaining * Math.min(a,b));
    }

    private static long calculateWithoutPromotion(long a, long b, long n) {
        if(a < b) return a*n;
        return b*n;
    }
}
