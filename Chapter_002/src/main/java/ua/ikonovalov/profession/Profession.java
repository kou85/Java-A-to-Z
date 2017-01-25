package ua.ikonovalov.profession;

/**
 * Class Profession.
 * @author Ivan Konovalov.
 * version 1.0.
 * @since 23.01.17.
 */
public class Profession {
    private String name;
    private  int workExperience;
    private int salary;
    private  String specialization;
    /**
     * Информация о специалисте.
     * @param name - первое значение.
     * @param workExperience - второе значение.
     * @param salary - второе значение.
     * @param specialization - второе значение.
     */
    public Profession(String name, int workExperience, int salary,String specialization) {
        this.name = name;
        this.workExperience = workExperience;
        this.salary = salary;
        this.specialization = specialization;
    }
    public String getName(){
     return this.name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getWorkExperience() {
        return this.workExperience;
    }
    public void setWorkExperience(int workExperience){
        this.workExperience = workExperience;
    }
    public int getSalary() {
        return this.salary;
    }
    public void setSalary(int salary){
        this.salary = salary;
    }
    public String getSpecialization() {
        return this.specialization;
    }
    public void setSpecialization(String specialization){
        this.specialization = specialization;
    }
}
