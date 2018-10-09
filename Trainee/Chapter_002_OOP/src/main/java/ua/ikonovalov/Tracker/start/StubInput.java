package ua.ikonovalov.Tracker.start;

public class StubInput implements Input {

    private String [] answers;
    private int position = 0;

    public StubInput(String [] answer) {
        this.answers = answer;
    }
    public String ask(String question) {
        return answers[position++];
    }
}
