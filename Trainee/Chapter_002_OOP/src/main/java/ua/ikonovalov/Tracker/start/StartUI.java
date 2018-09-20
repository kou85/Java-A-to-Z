package ua.ikonovalov.Tracker.start;

import ua.ikonovalov.Tracker.models.*;

/**
 * Created by Strong on 14.09.18.
 */
public class StartUI {

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        tracker.add(new Task("first task", "first desc"));
    }
}
