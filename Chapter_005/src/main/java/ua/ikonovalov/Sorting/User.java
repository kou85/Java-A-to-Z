package ua.ikonovalov.Sorting;

/**
 * Class User.
 *
 * @author Konovalov    .
 * @since 08.10.2017.
 * @version 1.0.
 */
public  class User implements Comparable<User>{
    /**
     * User name.
     */
    private String name;
    /**
     * User age/
     */
    private int age;

    /**
     * Constructor User class
     * @param name user name.
     * @param age user age.
     */
    public User(String name, int age) {
         this.age = age;
         this.name = name;
    }

    /**
     * Getter name.
     * @return user name.
     */
    public String getName(){
        return this.name;
    }

    /**
     * Setter name.
     * @param name new user name.
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     * Getter age.
     * @return user age.
     */
    public int getAge() {
        return this.age = age;
    }

    /**
     * Setter age.
     * @param age new user age.
     */
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        return this.age - o.getAge();
    }

    @Override
    public boolean equals(Object o) {
        return (this.hashCode() == o.hashCode());
    }

    @Override
    public int hashCode() {
        int result = 72;
        int ageHash = this.age * 13;
        return result + ageHash;
    }
}
