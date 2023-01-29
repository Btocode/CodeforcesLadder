package problems;

import java.util.Scanner;
public class Sleuth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        if (s.charAt(s.length() - 1) == '?' || s.charAt(s.length() - 1) == '!' || s.charAt(s.length() - 1) == '.') {
            s = s.substring(0, s.length() - 1);
        }
        s = s.trim();
        if(s.charAt(s.length() - 1) == 'A' || s.charAt(s.length() - 1) == 'E' || s.charAt(s.length() - 1) == 'I' || s.charAt(s.length() - 1) == 'O' || s.charAt(s.length() - 1) == 'U' || s.charAt(s.length() - 1) == 'Y' || s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'e' || s.charAt(s.length() - 1) == 'i' || s.charAt(s.length() - 1) == 'o' || s.charAt(s.length() - 1) == 'u' || s.charAt(s.length() - 1) == 'y') {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
