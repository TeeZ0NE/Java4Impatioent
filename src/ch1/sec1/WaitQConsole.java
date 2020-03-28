package ch1.sec1;
import java.io.Console;
public class WaitQConsole {
    public static void main(String[] args){
        Console terminal = System.console();
        boolean isDone = Boolean.FALSE;
        String letter = "Q";
        while (!isDone) {
            System.out.printf("Waiting 4 letter %s\n\r", letter);
            String input = terminal.readLine("Please type letter: ");
            if(input.equals(letter)) isDone = Boolean.TRUE;
        }
    }
}
