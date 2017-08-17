package ua.ikonovalov.geekB;

/**
 * Created by Strong on 16.08.17.
 */
public class Main {
    public static void main(String[] args) {
        IAtm superAtm = new Atm();
        ICard superCard = new MasterCard("Iren", 1500);

        superAtm.isertCard(superCard);
        superAtm.getBalance();
        superAtm.withdraw(100);
        superAtm.withdraw(500);
    }
}
