package ua.ikonovalov.profession;

/**
 * Class Doctor.
 * @author Ivan Konovalov.
 * version 1.0.
 * @since 23.01.17.
 */
public class Doctor extends Profession {
    private boolean patient;
    /**
     * Информация о специалисте.
     * @param name - первое значение.
     * @param workExperience - второе значение.
     * @param salary - второе значение.
     * @param specialization - второе значение.
     */
     public Doctor(String name,int workExperience, int salary, String specialization) {
        super(name, workExperience, salary, specialization);
         this.patient = patient;
     }
}
