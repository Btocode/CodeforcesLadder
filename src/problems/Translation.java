package problems;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(t.length() - 1 - i)) {
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");

    }
}
