package problems;

import java.util.Scanner;

public class OneAndTwo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            int count = 0;
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                if(arr[i] == 2){
                    count += 1;
                }
            }
            if(count == 0) System.out.println(1);
            else{
                int count2 = 0;
                int ans = -2;
                for(int j = 0; j < n; j++){
                    if(arr[j] == 2) count2 +=1;
                    if(count2 * 2 == count) {
                        ans = j;
                        break;
                    }
                }
                System.out.println(ans+1);
            }

        }

    }
}
