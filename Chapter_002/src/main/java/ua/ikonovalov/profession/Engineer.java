package ua.ikonovalov.profession;

/**
 * Class Engineer.
 * @author Ivan Konovalov.
 * version 1.0.
 * @since 23.01.17.
 */
public class Engineer extends Profession {
    /**
     * Информация о специалисте.
     * @param project - проект.
     */
	private boolean project;
    /**
     * Информация о специалисте.
     * @param name - первое значение.
     * @param workExperience - второе значение.
     * @param salary - второе значение.
     * @param specialization - второе значение.
     */
        public Engineer(String name, int workExperience, int salary, String specialization) {
            super(name, workExperience, salary, specialization);
            this.project = project;
        }
}
