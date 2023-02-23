package problems;

import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;
        while(n-- > 0){
            String x = sc.next();
            if(x.equals("++X") || x.equals("X++")){
                result += 1;
            }
            else {
                result -= 1;
            }
        }
        System.out.println(result);
    }
}
