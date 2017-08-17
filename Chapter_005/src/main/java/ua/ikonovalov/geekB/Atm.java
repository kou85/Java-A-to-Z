package ua.ikonovalov.geekB;

/**
 * Created by Strong on 16.08.17.
 */
public class Atm implements IAtm{
    private ICard currentCard;

    @Override
    public void isertCard(ICard card) {
          currentCard = card;
    }

    @Override
    public void ingect() {

        currentCard = null;
        System.out.println("Cart was ejected");
    }

    @Override
    public void withdraw(int amount) {
       if ( currentCard.withdraw(amount)) {
           System.out.println("cash: " + amount + " new balance: " + currentCard.getBalance());
       } else {
           System.out.println("a not money");
       }

    }

    @Override
    public void getBalance() {
        System.out.println("Balance:" + currentCard.getBalance());
    }
}
