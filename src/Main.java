public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1 () {
        byte apple = 100;
        System.out.println("Значение перемменой apple с типом byte равно " + apple);

        short banana = 2000;
        System.out.println("Значение перемменой banana с типом short равно " + banana);

        int orange = 150000;
        System.out.println("Значение перемменой orange с типом int равно " + orange);

        long mandarin = 1000000l;
        System.out.println("Значение перемменой mandarin с типом long равно " + mandarin);

        float cookie = 5f;
        System.out.println("Значение перемменой cookie с типом float равно " + cookie);

        double bone = 7.8;
        System.out.println("Значение перемменой done с типом double равно " + bone);
    }
    public static void task2 () {
        byte a = 67;
        short b = -159;
        int c = 569;
        int d = 27897;
        long e = 987678965549l;
        float f = 2.786f;
        double g = 27.12;
    }
    public static void task3 () {
     byte lyudmilaPavlovna = 23;
     byte annaSergeyevna = 27;
     byte ekaterinaAndreevna = 30;
     short totalPurchase = 480;
     int numberStudents = lyudmilaPavlovna + annaSergeyevna + ekaterinaAndreevna;
     int sheetsPaper = totalPurchase / numberStudents;
     System.out.println("На каждого ученика рассчитано " + sheetsPaper + " листов бумаги");
    }
    public static void task4 () {
        byte productivityTwoMinutes = 16;
        int productivityPerMinute = productivityTwoMinutes / 2;
        int productivityTwentyMinutes = productivityPerMinute * 20;
        System.out.println("За 20 минут машина произвела " + productivityTwentyMinutes + " штук бутылок");

        int hour = 60;
        int productivityPerHour = productivityPerMinute * hour;
        int day = 24;
        int productivityPerDayMinutes = productivityPerHour * day;
        System.out.println("За сутки машина произвела " + productivityPerDayMinutes + " штук бутылок");

        int threeDays = 3;
        int productivityThreeDays = productivityPerDayMinutes * threeDays;
        System.out.println("За 3 дня машина произвела " + productivityThreeDays + " штук бутылок");

        int daysMonth = 30;
        int monthlyProductivity = productivityPerDayMinutes * daysMonth;
        System.out.println("За месяц машина произвела " + monthlyProductivity + " штук бутылок");
    }
}