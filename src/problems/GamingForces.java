package problems;

import java.util.Scanner;

public class GamingForces {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int noOfOnes = 0;
            for(int i = 0; i < n; i++) {
                int x = sc.nextInt();
                if(x == 1) {
                    noOfOnes++;
                }
            }
            System.out.println(n - (noOfOnes/2));

        }
    }
}
