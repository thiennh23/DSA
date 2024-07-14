package Recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(25));
        System.out.println(fib(12));
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        else if (n >= 2)
            return fib(n - 1) + fib(n - 2);
        else return -1;
    }

    //Factorial
    public static int fact(int n) {
        if (n < 1)
            return 1;
        else return (n * fact(n - 1));
    }
}
