package ua.ikonovalov.tracker.start;

public class StubInput implements Input {

    private String[] answers;
    private int position = 0;

    public StubInput(String[] answers) {
        this.answers = answers;
    }
    public String ask(String question) {
        return answers[position++];
    }

    public int ask(String questions, int[] range) {
        boolean exits = false;
        int key = Integer.valueOf(this.ask(questions));
        for (int value : range) {
            if (value == key) {
                exits = true;
                break;
            }
        }
       if (!exits) {
           throw new MenuOutException("Please enter validate number again.%n");
        }
           return key;
    }
}
