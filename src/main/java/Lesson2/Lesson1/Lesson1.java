package Lesson2.Lesson1;

public class Lesson1 {
    public static void main(String[] args) {

        //printThreeWords();

        //checkSumSign();

        //printColor();

        compareNumbers();

    }

    private static void printThreeWords() {

        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");

        // Символы разделения строки
        System.out.println("Orange\nBanana\nApple");

        System.out.print("""
                Orange
                Banana
                Apple
                """);

        String pattern = """
                1) %S
                2) %S
                3) %S
                """;
        //  System.out.println(String.format (pattern,"Orange","Banana","Apple"));
        System.out.printf(pattern, "Orange", "Banana", "Apple");

        int a = 5;
        int b = 7;
        System.out.printf ("Пример: %d + %d = %d%n",a,b,a + b);
        System.out.println ("Пример: " + a + " + " + b + " = " + (a + b));

    }

   private static void checkSumSign() {
        int varA = 5;
        int varB = 7;
        int varC = varA + varB;
       System.out.println("varC = " + varC);

        if (varC >= 0) {
            System.out.println("Сумма положительная");
        }
        if (varC < 0) {
            System.out.println("Сумма отрицательная");
        }
    }

    private static void printColor() {
        int A1 = 55;

        if (A1 < 100) {
            System.out.println("Красный");
        }
        if (A1 == 100) {
            System.out.println("Желтый");
        }
        if (A1 > 100) {
            System.out.println("Зеленый");
        }
    }

    private static void compareNumbers() {
    int a = 10;
        if (a > 3) {
            System.out.println("А больше трёх");
        } else {
            System.out.println("А меньше трёх");
        }
    }
}



