package ua.ikonovalov.bank;


/**
 * class Account
 * @author ikonovalov
 * @since 27.11.18.
 * @version 1.0
 */
public class Account {
    private double value;
    private String requisites;

    public Account(int value, String  requisites) {
        this.value = value;
        this.requisites = requisites;
    }

    public double getValue() {
        return value;
    }

    public String  getRequisites() {
        return requisites;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public void setRequisites(String  requisites) {
        this.requisites = requisites;
    }

    public void subAmount(int amount) {
        this.value -= amount;
    }
    public void addAmount(int amount) {
        this.value += amount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Account account = (Account) o;

        if (Double.compare(account.value, value) != 0) return false;
        return requisites != null ? requisites.equals(account.requisites) : account.requisites == null;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        temp = Double.doubleToLongBits(value);
        result = (int) (temp ^ (temp >>> 32));
        result = 31 * result + (requisites != null ? requisites.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Account{" +
                "value=" + value +
                ", requisites='" + requisites + '\'' +
                '}';
    }
}
