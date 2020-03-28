package ch1.sec1;

import java.util.Scanner;

/**
 * Finding even or odd with spec condition for HackerRank
 *
 * @author TeeZ0NE
 */
public class WeirdOrNot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        String[] answers = {"Not Weird", "Weird"};
        String result = "";

        if (N % 2 > 0) result = answers[1];
        if (N % 2 == 0 && (N >= 2 && N <= 5)) result = answers[0];
        if (N % 2 == 0 && (N >= 6 && N <= 20)) result = answers[1];
        if (N % 2 == 0 && N > 20) result = answers[0];
        scanner.close();
        System.out.println(result);
    }
}
