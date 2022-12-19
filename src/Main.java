import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача №1");
        printIsBissextileYear(2018);
        printIsBissextileYear(2020);
        printIsBissextileYear(2023);
        System.out.println();
        System.out.println("Задача №2");
        printAppInfo(0,2022);
        printAppInfo(1,2020);
        printAppInfo(3, 2015);
        System.out.println();
        System.out.println("Задача №2");
        int deliveryDistance = 95;
        printCardDeliveryDays(deliveryDistance);


    }
    public static boolean isBissextileYear(int year) {
        return year%4==0 && year %100 !=0 || year %400==0;
    }
    private static void printIsBissextileYear (int year) {
        if (isBissextileYear(year)) {
            System.out.println( year + " — високосный год");
        } else {
            System.out.println( year + " — невисокосный год");
        }
    }
    private static void printAppInfo (int mobileOs, int mobileYear) {
        String osName = recognizeApp(mobileOs);
        String osVersion = recognizeAppVersion(mobileYear);
        System.out.println("Для OS " + osName + " установите "+ osVersion + " версию");

    }
    private static String recognizeApp (int mobileOS) {
        if (mobileOS == 0) {
            return "iOs";
        } else if (mobileOS == 1) {
            return "Android";
        } else {
            return "OS не распознан";
        }
    }
    private static String recognizeAppVersion (int mobileYear) {
        int currentYear = LocalDate.now().getYear();
        if (currentYear != mobileYear) {
            return "Lite";
        } else {
            return "обычную";
        }
    }
    private static int calcCardDelivery (int distance) {
        int deliveryDays;
        if (distance <= 20) {
            deliveryDays = 1;
        } else if (distance <= 60) {
            deliveryDays = 2;
        } else if (distance <= 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = 0;
        }
        return deliveryDays;
    }
    private static void printCardDeliveryDays (int distance) {
        System.out.println("Потребуется дней: "+ calcCardDelivery(distance));
    }
}