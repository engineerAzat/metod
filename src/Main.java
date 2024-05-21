import java.time.LocalDate;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        checkYear(2024);
        checkYear(2000);
        checkYear(1998);

        printDeviceVersion(0, 2020);
        printDeviceVersion(1, 2020);
        printDeviceVersion(0, 2024);
        printDeviceVersion(1, 2024);
        printDeviceVersion(0, 2014);
        printDeviceVersion(1, 2014);

        int days = calculeteDistanse(57);
        System.out.println("Количество дней = " + days);


    }

    public static void checkYear(int year){
        if(year % 4 == 0 && year % 100 != 0 || year % 400 ==00 ){
            System.out.println(year + " год - високосный год");
        } else{
            System.out.println(year + " год - невисокосный год");

        }
    }

    public static void printDeviceVersion (int osType, int year) {
        int correntYear = LocalDate.now().getYear();
        var type = osType == 1 ? "Android" : "iOS";
        var appType = year < correntYear ? "облегченную" : "";

        System.out.println("Установите " + appType + "версию для системы " + type);

    }

    public static int calculeteDistanse (int distanse) {
        int days = 1;
        if(distanse > 20) {
            days++;
        }
        if (distanse > 60){
            days++;
        }
        return days;


    }



}