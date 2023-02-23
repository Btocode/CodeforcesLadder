package ContestDiv4;

import java.util.Scanner;

public class CodeforcesChecking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String word = "codeforces";

        while (t-- > 0) {
            String c = sc.next();
            if (word.contains(c)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}

