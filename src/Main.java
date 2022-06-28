public class Main {
    public static void main(String[] args) {
        int balance = 100;
        int addedAmount = 5000;
        int bonus = addedAmount / 100;
        int total = (balance + addedAmount);
        if (addedAmount > 0) {
            if (addedAmount > 1000) {
                System.out.println("Начислено бонусов: " + bonus);
                System.out.println("Общая сумма: " + (total + bonus) + "рублей");
            } else {
                System.out.println("Нет начисленных бонусов");
                System.out.println("Общая сумма: " + total + "рублей");

            }
        } else {
            System.out.println("Сумма зачислений должна быть положительная");
        }
    }
}
