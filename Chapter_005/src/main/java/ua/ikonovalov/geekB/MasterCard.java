package ua.ikonovalov.geekB;

 /**
 * Created by Strong on 16.08.17.
 */
public class MasterCard implements ICard {
     private int amount;
     private String cardHoldName;

     public MasterCard(String cardHoldName, int amount) {
         this.cardHoldName =  cardHoldName;
         this.amount = amount;
     }

     @Override
     public int getBalance() {
         return amount;
     }

     @Override
     public boolean withdraw(int amount) {
         if (amount <= this.amount) {
             this.amount -= amount;
             return true;
         } else {
             return false;
         }
     }
 }