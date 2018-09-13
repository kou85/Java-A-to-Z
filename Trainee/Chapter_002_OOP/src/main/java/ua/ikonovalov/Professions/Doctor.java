package ua.ikonovalov.Professions;

/**
 * Created by Strong on 10.09.18.
 */
public class Doctor extends Professions {
    /**
     *
     * @param name
     * @param specialization
     * @param experience
     * @param salary
     */
    Diagnose diagnose;
    public Doctor(String name, String specialization, int experience, int salary) {
        super(name, specialization, experience, salary);
       this.diagnose = new Diagnose();
    }

    /**
     *
     * @param pacient
     * @return
     */

    public Diagnose heal(Patient pacient) {

        return diagnose;
    }
}
