package ua.ikonovalov.tracker.models;
/**
 * Class Bug.
 * Inherited class from Item.
 *
 * @author Konovalov Ivan.
 * @since 30.01.2017.
 * @version 1.0.
 */

public class Bug extends Item {

    /**
     * Constructor for creating bug reports.
     * @param name name of task.
     * @param description description of task.
     * @param dateCreation create time of task.
     */
	public Bug(String name, String description, long dateCreation) {
        super(name, description, dateCreation);
    }
}
