package ua.ikonovalov.geekB;

/**
 * Created by Strong on 16.08.17.
 */
public interface IAtm {
    void isertCard(ICard card);
    void ingect();
    void withdraw(int amount);
    void getBalance();

}
