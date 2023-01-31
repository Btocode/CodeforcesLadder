package problems;

import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next().toLowerCase();
        String second = sc.next().toLowerCase();
        if (first.compareTo(second) < 0) {
            System.out.println(-1);
        } else if (first.compareTo(second) > 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }

    }
}
