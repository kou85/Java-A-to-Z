package ua.ikonovalov.bank;

import ua.ikonovalov.bank.exceptions.UserException;

import java.util.*;

/**
 * class Bank
 * @author ikonovalov
 * @since 27.11.18.
 * @version 1.0
 */
public class Bank {

    public Map<User, ArrayList<Account>> base = new HashMap<>();

    /**
     *
     * @param user
     */
    public void addUser(User user) throws UserException {
        if (this.base.putIfAbsent(user, new ArrayList<>()) != null) {
            throw new UserException("User added");
        }
    }

    /**
     *
     * @param user
     */
    public void deleteUser(User user) {
        this.base.remove(user);
    }

    /**
     *
     * @param passport
     * @return
     * @throws UserException
     */
    public User getUser(String passport) throws UserException {
        User found = new User();
        for (User user : this.base.keySet()) {
            if (user.getPasport().equals(passport)) {
                found = user;
                break;
            }
        }
         return found;
    }

    /**
     * Method add Account user
     * @param passport
     * @param account
     */
    public void addAccountToUser(String passport, Account account) {
        ArrayList<Account> temp = this.base.get(getUser(passport));
        if (temp.indexOf(account) == -1) {
            temp.add(account);
        }
    }

    /**
     * The method delete account
     * @param passport
     * @param account
     * @throws UserException
     */
    public void deleteAccountFromUser(String passport, Account account) {
        ArrayList<Account> temp = this.base.get(getUser(passport));
        if (temp.indexOf(account) >= 0) {
            temp.remove(account);
        }
    }
    /**
     *
     * @param passport
     * @return
     */
    public List<Account> getUserAccounts(String passport) {
        return this.base.get(getUser(passport));
    }

    /**
     *
     * @param passport
     * @param requisites
     * @return
     * @throws UserException
     */
    public Account getOneUserAccount(String passport, String requisites) {
        List<Account> accounts = getUserAccounts(passport);
          int index = accounts.indexOf(new Account(0, requisites));
        if (index < 0) {
            return null;
        }
        return accounts.get(index);
    }

    /**
     * The method transfers money from the account of the first user to another account from user.
     * @param srcPassport
     * @param srcRequisite
     * @param destPassport
     * @param destRequisite
     * @param amount
     * @return
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                  String destPassport, String destRequisite, int amount) {
        boolean value = false;
        Account scr = getOneUserAccount(srcPassport, srcRequisite);
        Account dest = getOneUserAccount(destPassport, destRequisite);
        if (scr != null && dest != null) {
            if (amount > 0 && scr.getValue() > 0 && scr.getValue() >= amount) {
                scr.subAmount(amount);
                dest.addAmount(amount);
                value = true;
            }
        }
        return value;
    }

    @Override
    public String toString() {
        return "Bank{"
                + "base=" + this.base
                + '}';

    }
}
