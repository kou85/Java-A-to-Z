package ua.ikonovalov.bank;

import org.junit.Ignore;
import org.junit.Test;
import ua.ikonovalov.bank.exceptions.UserException;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Created by Strong on 29.11.18.
 */
public class BankTest {
    Bank bank = new Bank();
    @Ignore
    @Test (expected = UserException.class)
    public void whenUserAddedThenException() {
        this.bank.addUser(new User("Ivan", "12345"));
        this.bank.addUser(new User("Ivan", "12345"));
    }
    @Ignore
    @Test (expected = UserException.class)
    public void whenTryAddedAccountThenException() {
        this.bank.addUser(new User("Roman", "12345"));
        this.bank.addAccountToUser("12345", new Account(50, "1"));
        this.bank.addAccountToUser("12345", new Account(50, "1"));
    }
    @Ignore
    @Test (expected = UserException.class)
    public void whenAddThreeUsersThenDeleteOne() {
        this.bank.addUser(new User("Dima", "12345"));
        this.bank.addUser(new User("Ivan", "6789"));
        this.bank.addUser(new User("Oleg", "55555"));
        this.bank.deleteUser(bank.getUser("6789"));
        this.bank.getUser("6789");
    }
    @Ignore
    @Test (expected = UserException.class)
    public void whenCantFindUser() {
        this.bank.addUser(new User("Dima", "12345"));
        this.bank.addUser(new User("Ivan", "6789"));
        this.bank.getUser("1111");
    }


    @Test
    public void whenAddAccountToUser() {
        this.bank.addUser(new User("Roman", "12345"));
        this.bank.addAccountToUser("12345", new Account(50, "1"));
        Account expected =  new Account(50, "1");
        assertThat(this.bank.getOneUserAccount("12345", "1"), is(expected));
    }

    @Test
    public void whenTransferFromOneUserToSecondThenTrue() {
        this.bank.addUser(new User("Dima", "12345"));
        this.bank.addUser(new User("Ivan", "6789"));
        this.bank.addAccountToUser("12345", new Account(50, "1"));
        this.bank.addAccountToUser("6789", new Account(50, "2"));
        boolean result = bank.transferMoney("12345", "1", "6789", "2", 10);
        assertThat(result, is(true));
    }
}
