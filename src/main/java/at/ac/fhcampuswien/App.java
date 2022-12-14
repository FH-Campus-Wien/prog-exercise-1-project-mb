package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //global vars
    Scanner sc = new Scanner(System.in);

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

        //Appends xPos spaces to the spacer unles
        //  newString-lenght would be greater than MAX_LENGTH or
        //  xPos is less than 1
        if (str.length() <= MAX_LENGTH && str.length() + xPos <= MAX_LENGTH) {
            if (xPos > 0) {
                for (int i = 0; i < xPos; i++) {
                    spacer.append(" ");
                }
            }

            newString = spacer + str;
        } else {
            //Outputs Error when string-lenght would be greater than MAX_LENGTH
            newString = "Error" + System.lineSeparator();
        }

        //Add linebreak when 'newLine' is true
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
        int x;
        int y;
        int sum;

        //Get user input
        x = sc.nextInt();
        y = sc.nextInt();

        //Calc sum
        sum = x + y;

        System.out.println(sum);
    }

    //todo Task 5
    public void swapTwoNumbers() {
        // input your solution here
        int x;
        int y;

        //Get user input
        System.out.println("Before Swap:");
        System.out.print("x: ");
        x = sc.nextInt();
        System.out.print("y: ");
        y = sc.nextInt();

        //Swap Vars
        x += y;
        y = x - y;
        x = x - y;

        //Output
        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }

    //todo Task 6
    public void compareTwoNumbers() {
        // input your solution here
        int n1;
        int n2;

        //Get user input
        System.out.print("n1: ");
        n1 = sc.nextInt();
        System.out.print("n2: ");
        n2 = sc.nextInt();

        //Compare user inputs
        System.out.println(CompareInput(n1, n2));
    }

    private String CompareInput(int n1, int n2) {
        if (n1 > n2) return "n1 > n2";
        else if (n2 > n1) return "n2 > n1";
        else return "n1 == n2";
    }

    //todo Task 7
    public void ratingSalesPerson() {
        // input your solution here
        int turnover;

        System.out.print("Enter annual Revenue: ");
        turnover = sc.nextInt();

        System.out.println(CheckTurnover(turnover));
    }

    private String CheckTurnover(int turnover) {
        String result;

        if (turnover >= 0 && turnover < 100000) {
            if (turnover < 20000) result = "Poor Sales Revenue";
            else if (turnover < 50000) result = "Average Sales Revenue";
            else if (turnover < 80000) result = "Good Sales Revenue";
            else result = "Excellent Sales Revenue";
        } else {
            result = "Invalid Revenue";
        }

        return result;
    }


    //todo Task 8
    public void getCommissionRate() {
        // input your solution here
        int _class;
        double commisionRate;

        System.out.print("Enter CommissionClass: ");
        _class = sc.nextInt();

        // get commissionRate of class
        commisionRate = GetCommissionRate(_class);

        System.out.println("Your Commission Rate was set to " + commisionRate);
    }

    private double GetCommissionRate(int _class) {
        switch (_class) {
            case 1:
                return 0.01;
            case 2:
                return 0.02;
            case 3:
                return 0.03;
            case 4:
                return 0.04;
            default:
                return 0.00;
        }
    }

    //todo Task 9
    public void leapyear() {
        // input your solution here
        int year;

        System.out.print("Year: ");
        year = sc.nextInt();

        System.out.println(IsLeapyear(year));
    }

    private String IsLeapyear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) return "Leapyear";
                else return "Not a Leapyear";
            } else return "Leapyear";
        } else return "Not a Leapyear";
    }

    //todo Task 10
    public void transposedNumbers() {
        // input your solution here
        int input;
        int h, t, u;

        System.out.print("Number: ");
        input = sc.nextInt();

        // Get specific digit on position
        // for Example:
        // Val:     100 10  1
        // Pos:     100 10  1
        // ------------------
        // Digit:   1   2   3
        h = GetDigitOnPos(input, 100);
        t = GetDigitOnPos(input, 10);
        u = GetDigitOnPos(input, 1);

        System.out.printf("%d%d%d" + System.lineSeparator(), u, t, h);
    }

    private int GetDigitOnPos(double num, int pos) {
        return (int)((num / pos) % 10);
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