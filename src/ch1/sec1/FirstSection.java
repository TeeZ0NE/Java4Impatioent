package ch1.sec1;

import java.io.Console;

public class FirstSection {
    public static void main(String[] args){
        Console terminal = System.console();
        System.out.println("Yor name: ");
        String name = terminal.readLine();
        System.out.print("Age: ");
        String age = terminal.readLine("User age: ");
        char[] password = terminal.readPassword("Type password: ");

        System.out.printf("name: %s, age: %s, passwrd: %s", name, age, new String(password));
    }
}
