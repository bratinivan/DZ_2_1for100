public class Main {
    public static void main(String[] args) {
        int customerAccount = 100;  // счет клиента
        int refill = 1100;  // пополнение счета клиента
        int bonus = 0;  // бонус
        bonus = refill >= 1000 ? refill / 100 : bonus;
        System.out.println("Итоговый счёт: " + (customerAccount + refill + bonus));
        System.out.println("Бонусные рубли: " + bonus);
    }
}
