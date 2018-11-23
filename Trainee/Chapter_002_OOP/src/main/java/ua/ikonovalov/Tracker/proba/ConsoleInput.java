package ua.ikonovalov.tracker.proba;

import java.util.Scanner;

public class ConsoleInput implements Input{

    Scanner scanner = new Scanner(System.in);

    @Override
    public String ask(String qvestion) {
        System.out.println(qvestion);
        return scanner.nextLine();
    }
}
