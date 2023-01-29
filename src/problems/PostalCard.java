package problems;

import java.util.ArrayList;
import java.util.Scanner;

public class PostalCard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        ArrayList<String> listOfNString = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            listOfNString.add(sc.next());
        }
        ArrayList<String> listOfMString = new ArrayList<>();
        for (int i = 0; i < M; i++) {
            listOfMString.add(sc.next());
        }
        for (int i = 0; i < N; i++) {
            String str = listOfNString.get(i);
            listOfNString.set(i, str.substring(str.length() - 3));
        }
        int count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (listOfNString.get(i).equals(listOfMString.get(j))) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}
