package ch1.sec2;

import java.util.ArrayList;
import java.util.Scanner;

public class Substringer {
    private static ArrayList<String> substrings;
    private static String min, max;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word =  scanner.next();
        int k = scanner.nextInt();
        scanner.close();
        fillSubstrings(word, k);
        getMin();
        System.out.format("min:%s max:%s", min, max);
    }

    private static void fillSubstrings(String word, int k){
        int i = 0;
        substrings = new ArrayList<>();
        while (i < word.length()) {
            int length = k+i;
            substrings.add(word.substring(i, length));
            if (length == word.length()) break;
            i++;
        }
    }

    private static void getMin(){
        min = substrings.get(0);
        for(String word : substrings) {
            if (min.compareTo(word) < 0){
                max = word;
            }
            if (min.compareTo(word) > 0){
                min = word;
            }
        }
    }
}
