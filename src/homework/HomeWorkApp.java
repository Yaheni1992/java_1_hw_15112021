package homework;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers(4, 5);

    }

    // первое дз
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

    }

    // второе дз
    public static void checkSumSign() {
        int a = 30;
        int b = 40;
        int c = (a + b);
        if (c >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }

    }

    // третье дз
    public static void printColor() {
        int value = 50;
        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 100) {
            System.out.println("Желтый");
        }
        if (value > 0) ;
        System.out.println("Зеленый");
    }

    // четвертое дз
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}



