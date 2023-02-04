package ContestDiv4;

import java.util.Scanner;

public class FollowingDirections {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            String s = sc.next();
            int x = 0, y = 0;
            for (int j = 0; j < n; j++) {
                char c = s.charAt(j);
                if (c == 'L') {
                    x--;
                } else if (c == 'R') {
                    x++;
                } else if (c == 'U') {
                    y++;
                } else if (c == 'D') {
                    y--;
                }
                if (x == 1 && y == 1) {
                    System.out.println("YES");
                    break;
                }
            }
            if (x != 1 || y != 1) {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
