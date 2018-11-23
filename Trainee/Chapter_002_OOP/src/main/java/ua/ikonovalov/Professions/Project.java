package ua.ikonovalov.professions;

/**
 * Created by Strong on 11.09.18.
 */
public class Project {
    /**
     *
     */
    private String name;
    private int budget;

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;

    }

    /**
     *
     * @param budget
     */
    public void setBudget(int budget) {
        this.budget = budget;
    }

    /**
     *
     * @return
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return
     */
    public int getBudget() {
        return this.budget;
    }
}
