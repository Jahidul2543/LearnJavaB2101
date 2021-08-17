package practice;

public class Atm {

    public void showBalance(String userName, String password, AtmCard atmCard){
        System.out.println("Your balance 1 Million");
    }

    public Money getMoney(String userName, String password, AtmCard atmCard, int amountToWithdraw ){
        Money money = new Money(amountToWithdraw);
        return money;
    }
}
