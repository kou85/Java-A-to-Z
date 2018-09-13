package ua.ikonovalov.Professions;
/**
 * Created by Strong on 10.09.18.
 */
public class Patient {
    private String name;
    private int age;
    private String diseaseHistory;

    /**
     *
     * @param name
     */
    public void setName(String name) {
        this.name= name;
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
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     *
     * @return
     */
    public int getAge() {
        return this.age;
    }

    /**
     *
     * @param diseaseHistory
     */
    public void setDiseaseHistory(String diseaseHistory) {
        this.diseaseHistory = diseaseHistory;
    }

    /**
     *
     * @return
     */
    public String getDiseaseHistory(){
        return this.diseaseHistory;
    }
}
