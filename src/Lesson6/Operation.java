package Lesson6;

public class Operation {
    public void deposite(CreditCard creditCard, int depositeMoney) {
        int result = creditCard.getSum() + depositeMoney;
        creditCard.setSum(result);
    }

    public void minus(CreditCard creditCard, int minusMoney) {
        int result = creditCard.getSum() - minusMoney;
        creditCard.setSum(result);
    }

    public void showInfo(CreditCard creditCard) {
        System.out.println("Информация о карте: номер карты " + creditCard.getNumber() + " Сумма карты " + creditCard.getSum());
    }
}