import org.w3c.dom.ls.LSOutput;

public class Main {
    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) return 'A';
        else if (grade >= 80) return 'B';
        else if (grade >= 70) return 'C';
        else if (grade >= 60) return 'D';
        else if (grade >= 50) return 'E';
        else return 'F';
    }

    // Question 2 - fizzBuzz
    public static String fizzBuzz(int n) {
        if (n % 5 == 0 && n % 3 == 0) return "fizzbuzz";
        else if (n % 5 == 0) return "buzz";
        else if (n % 3 == 0) return "fizz";
        else return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length() < 2) return str;
        else {
            String front = str.substring(0, 2);
            return front + str + front;
        }
    }

    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        return (a + b) == c || (b + c) == a || (a + c) == b;
    }

    // Question 5 - endUp
    public static String endUp(String str) {
        if (str.length() < 3) return str.toUpperCase();
        else return str.substring(0, str.length() - 3) + str.substring(str.length() - 3).toUpperCase();
    }
}
