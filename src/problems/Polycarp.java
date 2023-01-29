package problems;

import java.util.Scanner;

public class Polycarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
//           get first 30 digits of pi
            String pi = "3141592653589793238462643383279";
            String n = sc.next();
            int count = 0;
            for (int i = 0; i < n.length(); i++) {
                if (n.charAt(i) == pi.charAt(i)) {
                    count++;
                }
                else {
                    break;
                }

            }
            System.out.println(count);

        }
    }
}
