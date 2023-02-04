package ContestDiv4;

import java.util.Scanner;

public class PrependAndAppend {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(getInitialSize(s, n));
        }
    }

    private static int getInitialSize(String s, int n) {
        for(int i = 0; i < n; i++) {
            if(s.length() == 0 || s.length() == 1) {
                break;
            }
            if(s.charAt(0) == '1' && s.charAt(s.length() - 1) == '0') {
                s = s.substring(1, s.length() - 1);
            } else if (s.charAt(0) == '0' && s.charAt(s.length() - 1) == '1') {
                s = s.substring(1, s.length() - 1);
            }
            else {
                break;
            }

        }
        return s.length();
    }
}
