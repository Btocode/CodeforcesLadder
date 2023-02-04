package ContestDiv4;

import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String codeforces = "codeforces";

        for (int i = 0; i < t; i++) {
            String c = sc.next();
            if (codeforces.contains(c)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}

