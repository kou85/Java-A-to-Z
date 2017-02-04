package ua.ikonovalov.profession;

/**
 * Class Profession.
 * @author Ivan Konovalov.
 * version 1.0.
 * @since 23.01.17.
 */
public class Profession {
    /**
     * @param name.
     */
	private String name;
	/**
     * @param workExperience.
     */
    private  int workExperience;
	/**
     * @param salary.
     */
    private int salary;
	/**
     * @param specialization.
     */
    private  String specialization;
    /**
     * Информация о специалисте.
     * @param name - первое значение.
     * @param workExperience - второе значение.
     * @param salary - второе значение.
     * @param specialization - второе значение.
     */
    public Profession(String name, int workExperience, int salary, String specialization) {
        this.name = name;
        this.workExperience = workExperience;
        this.salary = salary;
        this.specialization = specialization;
    }
	/**
     * @return name.
     */
    public String getName() {
     return this.name;
    }
	/**
     * Metod setname.
	 * @param name name.
     */
    public void setName(String name) {
        this.name = name;
    }
	/**
	 * @return workExperience.
     */
    public int getWorkExperience() {
        return this.workExperience;
    }
	/**
	 * Metod set.
	 * @param workExperience workExperience.
     */
    public void setWorkExperience(int workExperience) {
     this.workExperience = workExperience;
    }
	/**
     * Metod getsalary.
	 * @return salary.
     */
    public int getSalary() {
        return this.salary;
    }
	/**
     * Metod getsalary.
	 * @param salary salary.
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
	/**
     * Metod getspecialization.
	 * @return specialization.
     */
    public String getSpecialization() {
        return this.specialization;
    }
	/**
     * Metod setspecialization.
	 * @param specialization specialization.
     */
    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
