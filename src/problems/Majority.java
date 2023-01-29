package problems;

import java.util.Scanner;

public class Majority {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); // Np of people
        int countAgainst = 0;
        int countFor = 0;
        while (N-- > 0){
            String S = sc.next();
            if (S.equals("For")) {
                countFor++;
            }
            else{
                countAgainst++;
            }
        }
        if(countFor > countAgainst){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

    }
}
