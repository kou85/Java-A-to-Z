package ua.ikonovalov.Tracker.templates;

/**
 * Created by Strong on 11.11.18.
 */
public abstract class TemplateAction {
    abstract void start();
    abstract void finish();

    public void work() {
        this.start();
        this.finish();

    }
    public static void main(String [] args) {
        new TemplateAction() {
            public void start() {

            }
            public void finish() {

            }
        };
    }

}
