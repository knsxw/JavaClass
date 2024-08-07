// Name - Khine Khant
// ID - JV-20268

public class loopingExercise {

    public static void main(String[] args) {
        System.out.println(sunOfNumbers());
        System.out.println("Factorial of 5: " + factorial(5));
        multiplicationTable(7);
    }

    static int sunOfNumbers() {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }

    static int factorial(int n) {
        int result = 1;
        int i = 1;
        while (i <= n) {
            result *= i;
            i++;
        }
        return result;
    }

    static void multiplicationTable(int n) {
        System.out.println("-----------");
        for (int i = 1; i <= 10; i++ ) {
            System.out.println(n + " * " + i + " = " + (n*i));
        }
    }
}