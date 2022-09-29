package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld() {
        // input your solution here
        System.out.println("Hello World!");
    }

    //todo Task 2
    public void helloRobot() {
        // input your solution here
        putStringAtPos("0123456789012345678901", 0, true);
        putStringAtPos("__", 9, true);
        putStringAtPos("_(\\", 1, false);
        putStringAtPos("|@@|", 4, true);
        putStringAtPos("(__/\\__ \\--/ __", 0, true);
        putStringAtPos("\\___|----|", 3, false);
        putStringAtPos("|", 2, false);
        putStringAtPos("__", 3, true);
        putStringAtPos("\\ }{ /\\ )_ / _\\", 7, true);
        putStringAtPos("/\\__/\\ \\__O (__", 7, true);
        putStringAtPos("(--/\\--)", 6, false);
        putStringAtPos("\\__/", 4, true);
        putStringAtPos("_)(  )(_", 6, true);
        putStringAtPos("`---''---`", 5, true);
    }

    final int MAX_LENGTH = 22;

    public void putStringAtPos(String str, int xPos, boolean newLine) {
        StringBuilder spacer = new StringBuilder();
        String newString;

        if (str.length() <= MAX_LENGTH && str.length() + xPos <= MAX_LENGTH) {
            if (xPos > 0) {
                for (int i = 0; i < xPos; i++) {
                    spacer.append(" ");
                }
            }

            newString = spacer + str;
        } else {
            newString = "Error" + System.lineSeparator();
        }

        if (newLine) newString += System.lineSeparator();

        System.out.print(newString);
    }

    //todo Task 3
    public void sumOfLiterals() {
        // input your solution here
        int _char = 'Z';
        int _hex = 0xface;
        int _oct = 012;
        long _long = 80L;
        float _float0 = 44e-1f;
        float _float1 = 5.5f;
        double _edouble = 8.88e1;
        double _double = 99.9;

        int sum = _char + _hex + _oct + (int) _long + (int) _float0 + (int) _float1 + (int) _edouble + (int) _double;

        System.out.println(sum);
    }

    //todo Task 4
    public void addTwoNumbers() {
        // input your solution here
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        int sum;

        x = sc.nextInt();
        y = sc.nextInt();
        sum = x + y;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
    }

    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
    }


    public static void main(String[] args) {
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}