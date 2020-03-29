package ch1.sec1;

import java.util.Scanner;

/**
 * Looks like a factorial). HackerRank challenge
 *
 * Input count of inputs then main number a which is s first start of sum then multiplier b and power n for a
 * @author TeeZ0NE
 */
public class JavaLoops2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int nn = 0;
            for (; nn < n; nn++) {
                int sum = a;
                for (int nnn = 0; nnn <= nn; nnn++) {
                    sum += Math.pow(2, nnn) * b;
                }
                System.out.printf("%d ", sum);
            }
            System.out.printf("%n");
        }
        in.close();
    }
}
