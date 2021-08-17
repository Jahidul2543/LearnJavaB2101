package practice;

public class Bill {

    public static void main(String[] args) {
       String billPaymentResponse = payBill();
        System.out.println(billPaymentResponse);
    }

    public static String payBill(){
        AtmCard myAtmCard = new AtmCard();
        Atm atm = new Atm();
        Money utilityBill = atm.getMoney("John", "John1234", myAtmCard, 100 );
        return "Thank you for the payment. Your bill for the month of July has been paid.";
    }
}