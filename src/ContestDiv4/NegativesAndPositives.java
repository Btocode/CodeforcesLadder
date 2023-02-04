package ContestDiv4;

import java.util.Arrays;
import java.util.Scanner;

public class NegativesAndPositives {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int nums[] = new int[n];
            for (int i = 0; i < n; i++) {
                nums[i] = sc.nextInt();
            }
            int sumOfNums = 0;
            for (int i = 0; i < n; i++) {
                sumOfNums += nums[i];
            }
            int min = 0;
            int minIndex = 0;
            for (int i = 0; i < n; i++) {
                if (nums[i] < min) {
                    min = nums[i];
                    minIndex = i;
                }
            }
            int sumleft = 0;
            int sumright = 0;
            if(minIndex > 0){
                int left = nums[minIndex - 1] ;
                int right = nums[minIndex + 1] ;
                if (left > right){
                    int[] tempArrLeft = Arrays.copyOf(nums, n);
                    tempArrLeft[minIndex] = -tempArrLeft[minIndex];
                    for (int i = 0; i < n; i++) {
                        sumleft += tempArrLeft[i];
                    }
                }
                else {
                    int[] tempArrRight = Arrays.copyOf(nums, n);
                    tempArrRight[minIndex] = -tempArrRight[minIndex];
                    for (int i = 0; i < n; i++) {
                        sumright += tempArrRight[i];
                    }
                }

            }
            else {
                int right = nums[minIndex + 1];
                int[] tempArrRight = Arrays.copyOf(nums, n);
                right = -right;
                tempArrRight[minIndex + 1] = right;
                tempArrRight[minIndex] = -tempArrRight[minIndex];
                for (int i = 0; i < n; i++) {
                    sumright += tempArrRight[i];
                }
            }
            int sum = Math.max(sumleft, sumright);
            int result = Math.max(sum, sumOfNums);
            System.out.println(result);

        }
    }
}
