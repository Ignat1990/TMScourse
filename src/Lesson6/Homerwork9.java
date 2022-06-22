package Lesson6;

public class Homerwork9 {


    public static void main(String[] args) {

        CreditCard masterCard = new CreditCard(23456, 500);
        CreditCard masterCard1 = new CreditCard();


        int result = masterCard.getSum() + 430;
        masterCard.setSum(result);

        Operation operation = new Operation();
        operation.deposite(masterCard, 500);
        operation.minus(masterCard, 65);

        System.out.println(masterCard.getSum());

        operation.showInfo(masterCard);
        // 1.3) Создать 3 карты. В двух прибавить, в третьей отнять.
        CreditCard visa1 = new CreditCard(645, 5000);
        CreditCard visa2 = new CreditCard(545, 4000);
        CreditCard visa3 = new CreditCard(650, 5000);

        operation.deposite(visa1, 300);
        operation.deposite(visa2, 100);
        operation.minus(visa3, 150);
        operation.showInfo(visa1);
        operation.showInfo(visa2);
        operation.showInfo(visa3);


    }
}