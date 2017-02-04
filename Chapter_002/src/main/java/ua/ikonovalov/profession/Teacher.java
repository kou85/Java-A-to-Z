package ua.ikonovalov.profession;

/**
 * Class Teacher.
 * @author Ivan Konovalov.
 * version 1.0.
 * @since 23.01.17.
 */
public class Teacher extends Profession {
	/**
     * @param student student.
     */
    private boolean student;
    /**
     * Информация о специалисте.
     * @param name - первое значение.
     * @param workExperience - второе значение.
     * @param salary - второе значение.
     * @param specialization - второе значение.
     */
    public Teacher(String name, int workExperience, int salary, String specialization) {
        super(name, workExperience, salary, specialization);
        this.student = student;
    }
}
