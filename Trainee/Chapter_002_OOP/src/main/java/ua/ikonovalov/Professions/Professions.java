package ua.ikonovalov.Professions;

/**
 * Created by Strong on 10.09.18.
 */
public class Professions {
    /**
     *
     */
    private String name;
    private String specialization;
    private int experience;
    private int salary;

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
    public String getSpecialization() {
        return this.specialization;
    }

    /**
     *
     * @return
     */
    public int getExperience() {
        return this.experience;
    }

    public int getSalary() {
        return this.salary;
    }

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @param specialization
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    /**
     *
     * @param experience
     */
    public void setExperience(int experience) {
        this.experience = experience;
    }

    /**
     *
     * @param salary
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
}
