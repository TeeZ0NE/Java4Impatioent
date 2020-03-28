package ch1.sec1;

import java.io.Console;

public class WaitQConsole {
    public static void main(final String[] args) {
        final Console terminal = System.console();
        boolean isDone = Boolean.FALSE;
        final String letter = "Q";
        while (!isDone) {
            System.out.printf("Waiting 4 letter %s\n\r", letter);
            final String input = terminal.readLine("Please type letter: ");
            if (input.equals(letter))
                isDone = Boolean.TRUE;
        }
    }
}
