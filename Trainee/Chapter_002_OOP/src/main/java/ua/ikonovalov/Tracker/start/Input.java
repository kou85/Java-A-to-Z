package ua.ikonovalov.Tracker.start;

public interface Input {
    String ask(String question);
    int ask(String questions, int[] range);
}
