public class Task {
    public static void main(String[] args) {
 /*
 В одной стране в обращении был 1 млн 20% из которых были фальшивыми
 Бандиты стали ввозить в страну по 100 тыся в месяц 10% из которых были фальшивыми
 в это же время другие бандиты стали вывозить из страны по 50 тыс ещемесячно из которых 30% были фальшивыми
 Через сколько месяцев содержание фальшивых денег составит 5% от общего колличества
 */
        double budget = 1_000_000.0;
        int percentageOfCounterfeitMoney = 20;

        double percent = (budget / 100) * percentageOfCounterfeitMoney;
        double counterfeitMoney = (budget / 100) * percentageOfCounterfeitMoney;

        System.out.println("budget = " + budget);
        System.out.println("how counterfeit Moneyon start = " + percent);
        boolean flag = true;
        int month = 0;

        while (flag) {
            month++;
            budget += 90_000 - 35000;
            counterfeitMoney += 10_000 - 15_000;
            double x = (counterfeitMoney * 100) / budget;
            System.out.println("budget = " + budget);
            System.out.println("counterfeitMoney = " + counterfeitMoney);
            System.out.println("percent = " + x);
            if (x <= 5.0) {
                flag = false;
                System.out.println("month = " + month);
            }
        }
    }
}
