package problems;

import java.util.Scanner;

public class ColorfulStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int pos = 1;
        int j = 0;
        for(int i = 0; i < t.length(); i++) {
            if(t.charAt(i) == s.charAt(j)){
                pos += 1;
                j++;
            }
        }
        System.out.println(pos);
    }
}
