package ContestDiv2;

import java.util.Scanner;

public class TwoTowers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test-- > 0) {
            int n = sc.nextInt(); // number of blocks in the first tower
            int m = sc.nextInt(); // number of blocks in the second tower
            String s = sc.next(); // string of n characters
            String t = sc.next(); // string of m characters

            boolean isBeautiful = checkIsBeautiful(s, t, n, m);
            if (isBeautiful) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

        }
    }

    private static boolean checkIsBeautiful(String s, String t, int n, int m) {
        boolean firstTower = checkBeauty(s, n);
        boolean secondTower = checkBeauty(t, m);
        int count = 0;
        if (firstTower && secondTower) {
            return true;
        }
        else {
            String tower = s + makeReverse(t);
            for (int i = 0; i < tower.length() - 1; i++) {
                if ((tower.charAt(i) == 'B' && tower.charAt(i + 1) == 'B') || (tower.charAt(i) == 'R' && tower.charAt(i + 1) == 'R')) {
                    count++;
                }
            }
        }
        return count < 2;
    }

    private static String makeReverse(String t) {
        StringBuilder result = new StringBuilder();
        for (int i = t.length() - 1; i >= 0; i--) {
            result.append(t.charAt(i));
        }
        return result.toString();
    }

    private static boolean checkBeauty(String s, int n) {
        if (n != 1) {
            for (int i = 0; i < n - 1; i++) {
                if ((s.charAt(i) == 'B' && s.charAt(i + 1) == 'B') || (s.charAt(i) == 'R' && s.charAt(i + 1) == 'R')) {
                    return false;
                }
            }
        }
        return true;
    }
}
