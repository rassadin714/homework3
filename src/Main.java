public class Main {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        byte apple = 100;
        System.out.println("Значение перемменой apple с типом byte равно " + apple);

        short banana = 2000;
        System.out.println("Значение перемменой banana с типом short равно " + banana);

        int orange = 150000;
        System.out.println("Значение перемменой orange с типом int равно " + orange);

        long mandarin = 1000000L;
        System.out.println("Значение перемменой mandarin с типом long равно " + mandarin);

        float cookie = 5f;
        System.out.println("Значение перемменой cookie с типом float равно " + cookie);

        double bone = 7.8;
        System.out.println("Значение перемменой done с типом double равно " + bone);
    }
    public static void task2 () {
        byte a = 67;
        short b = -159;
        short c = 569;
        int d = 27897;
        long e = 987678965549L;
        float f = 2.786f;
        double g = 27.12;
        System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g);
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
    public static void task5 () {
        byte totalAmountPaint = 120;
        byte whitePaint = 2;
        byte brownPaint = 4;
        int firstClass = whitePaint + brownPaint;
        int numberClasses = totalAmountPaint / firstClass;
        int amountWhitePaint = numberClasses * whitePaint;
        int amountBrownPaint = numberClasses * brownPaint;
        System.out.println("В школе, где " + numberClasses + " классов, нужно " + amountWhitePaint + " банок белой краски и " + amountBrownPaint + " банок коричневой краски.");
    }
    public static void task6 () {
        byte numberBananas = 5;
        byte weightOneBanana = 80;
        int weightBananas = numberBananas * weightOneBanana;
        short milkMl = 200;
        byte oneHundredWeight = 105;
        int milkWeight = (milkMl / 100) * oneHundredWeight;
        byte iceCreamBriquette = 2;
        byte oneIceCreamWeight = 100;
        int iceCreamWeight = iceCreamBriquette * oneIceCreamWeight;
        byte egg = 4;
        byte oneEggWeight = 70;
        int eggWeight = egg * oneEggWeight;
        short kg = 1000;
        float breakfastWeightGrams = weightBananas + milkWeight + iceCreamWeight + eggWeight;
        float breakfastWeightKg = breakfastWeightGrams / kg;
        System.out.println("Вес спортивного зввтрака в граммах" + breakfastWeightGrams);
        System.out.println("вес спортивного завтрака в килограммах " + breakfastWeightKg);
    }
    public static void task7 () {
        byte excessWeightKilogram = 7;
        short minMissingGram = 250;
        short maxMissingGram = 500;
        short kg = 1000;
        int midLossGram = (maxMissingGram + minMissingGram) / 2;
        int dayMidLoss = (excessWeightKilogram * kg) / midLossGram;
        System.out.println("Сбрасывая кадый день вес по "+midLossGram+" грамм, спортсмен похудеет за "+dayMidLoss+" дней");
    }
    public static void task8 () {
        int mashaMonthPay = 67760;
        int denisMonthPay = 83690;
        int kristinaMonthPay = 76230;
        int additionMashaPay = mashaMonthPay / 10;
        int additionDenisPay = denisMonthPay / 10;
        int additionKristinaPay = kristinaMonthPay / 10;
        int newMashaPay = additionMashaPay + mashaMonthPay;
        int newDenisPay = additionDenisPay + denisMonthPay;
        int newKristinaPay = additionKristinaPay + kristinaMonthPay;
        byte year = 12;
        int oldYearMashaPay = mashaMonthPay * year;
        int oldYearDenisPay = denisMonthPay * year;
        int oldYearKristinaPay = kristinaMonthPay * year;
        int newYearMashaPay = newMashaPay * year;
        int newYearDenisPay = newDenisPay * year;
        int newYearKristinaPay = newKristinaPay * year;
        int differenceYearMashaPay = newYearMashaPay - oldYearMashaPay;
        int differenceYearDenisPay = newYearDenisPay - oldYearDenisPay;
        int differenceYearKristinaPay = newYearKristinaPay - oldYearKristinaPay;
        System.out.println("После повышения зарплаты на 10% Маша получает " + newMashaPay+" рублей. Годовой доход вырос на " + differenceYearMashaPay + " рублей");
        System.out.println("После повышения зарплаты на 10% Денис получает " + newDenisPay + " рублей. Годовой доход вырос на " + differenceYearDenisPay+" рублей");
        System.out.println("После повышения зарплаты на 10% Кристина получает " + newKristinaPay + " рублей. Годовой доход вырос на " + differenceYearKristinaPay + " рублей");
    }

}