package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TaisiaAndDice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt(); // number of dice
            int s = sc.nextInt(); // sum of sequence
            int r = sc.nextInt(); // sum of sequence without the stolen dice
            int stolen_dice = s - r; // ai of stolen dice

            String result = String.valueOf(stolen_dice);
//            we have to make sum r using n-1 dice


            List<Integer> combination = findSingleCombination(r, n - 1);
            for (int i = 0; i < combination.size(); i++) {
                result += " " + combination.get(i);
            }
            System.out.println(result);
        }
    }

        private static List<Integer> findSingleCombination ( int targetSum, int numDice){
            List<Integer> combination = new ArrayList<>();
            findSingleCombination(combination, targetSum, numDice);
            return combination;
        }

        private static boolean findSingleCombination (List < Integer > combination,int targetSum, int numDice){
            if (targetSum == 0 && combination.size() == numDice) {
                return true;
            }

            if (targetSum < 0 || combination.size() == numDice) {
                return false;
            }

            for (int i = 1; i <= 6; i++) {
                combination.add(i);
                if (findSingleCombination(combination, targetSum - i, numDice)) {
                    return true;
                }
                combination.remove(combination.size() - 1);
            }

            return false;
        }
}
