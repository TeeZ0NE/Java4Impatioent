package ch1.sec1;

import java.io.Console;

public class FirstSection {
    public static void main(final String[] args) {
        final Console terminal = System.console();
        System.out.println("Yor name: ");
        final String name = terminal.readLine();
        final String age = terminal.readLine("User age: ");
        final char[] password = terminal.readPassword("Type password: ");

        System.out.printf("name: %s, age: %s, passwrd: %s", name, age, new String(password));
    }
}
