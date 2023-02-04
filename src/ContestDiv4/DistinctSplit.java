package ContestDiv4;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DistinctSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();
            int fa = getFa(s, n);
            int fb = countDistinctChars(s.substring(fa));
            System.out.println(fa + fb);
        }
    }
    public static int countDistinctChars(String str) {
        Set<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            set.add(str.charAt(i));
        }
        return set.size();
    }
    private static int getFa(String s, int n) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (set.contains(c)) {
                return set.size();
            }
            set.add(c);
        }
        return set.size();
    }
}
