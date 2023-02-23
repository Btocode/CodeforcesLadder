package problems;

import java.util.Scanner;

public class Games {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] teams = new int[n][2];
        for(int i = 0; i < n; i++) {
            teams[i][0] = sc.nextInt();
            teams[i][1] = sc.nextInt();
        }
        int matched = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                if(teams[i][0] == teams[j][1]) {
                    matched++;
                }
            }
        }
        System.out.println(matched);
    }
}
