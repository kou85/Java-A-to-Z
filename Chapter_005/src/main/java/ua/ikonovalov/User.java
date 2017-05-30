package ua.ikonovalov;

/**
 * @autor Konovalov.
 * @since 30.05.17.
 * @version 1.0/
 */
public class User {
    /**
     *
     */
    private int id;
    /**
     *
     */
    private String name;
    /**
     *
     */
    private String city;

    /**
     *
     * @param id
     * @param name
     * @param city
     */
    public User(int id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }

    /**
     *
     * @return
     */
    public int getId (){
        return this.id;
    }

    /**
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
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
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getCity() {
        return this.city;
    }

    /**
     *
     * @param city
     */
    public void setCity(String city) {
        this.city = city;
    }
}
