package problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NonAlternatingDeck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int alice = 0;
            int bob = 0;
            int remaining = n;
            boolean aliceTurn = false;
            alice += 1;
            remaining -= 1;

            for(int i = 2; remaining > 0; i+=2) {
                if (i+i+1 <= remaining){
                    remaining -= i+i+1;
                    if (aliceTurn) {
                        alice += i+i+1;
                    } else {
                        bob += i+i+1;
                    }

                }
                else {
                    if (aliceTurn) {
                        alice += remaining;
                    } else {
                        bob += remaining;
                    }
                    remaining = 0;
            }
            aliceTurn = !aliceTurn;

            }
            System.out.print(alice + " " + bob + "\n");

        }
    }
}
