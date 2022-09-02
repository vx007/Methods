import java.time.LocalDate;
import java.time.Year;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Задание 1
        printLeapYear(2000);

        //Задание 2
        printAppMsg(0, 2015);

        //Задание 3
        printDeliveryDays(50);

        //Дополнительные задания

        //Задание 4
        int[] arr = {3, 2, 1, 6, 5};
        reverseArr(arr);
        System.out.println(Arrays.toString(arr));

        //Задание 5
        findDoublesInString("aabccddefgghiijjkk");

        //Задание 6
        System.out.printf("Среднее за месяц = %.2f.\n", calcMean(generateRandomArray(30)));
    }

    public static void printLeapYear(int year) {
        if (Year.isLeap(year)) {
            System.out.printf("%d — високосный год.\n", year);
        } else {
            System.out.printf("%d — не високосный год.\n", year);
        }
    }

    public static void printAppMsg(int clientOS, int clientDeviceYear) {
        if (clientOS == 0) {
            if (clientDeviceYear < LocalDate.now().getYear()) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        } else if (clientOS == 1) {
            if (clientDeviceYear < LocalDate.now().getYear()) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else {
            System.out.println("Неподдерживаемая платформа!");
        }
    }

    public static void printDeliveryDays(int deliveryDistance) {
        int deliveryDays;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            deliveryDays = 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            deliveryDays = 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            deliveryDays = 3;
        } else {
            return;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }

    public static void reverseArr(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }
    }

    public static void findDoublesInString(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                System.out.println("Найден дубль: " + str.charAt(i));
                return;
            }
        }
        System.out.println("Дубль не найден!");
    }

    public static int[] generateRandomArray(int size) {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static double calcMean(int[] arr) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        return ((double) sum / arr.length);
    }
}
