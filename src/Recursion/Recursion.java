package Recursion;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fact(25));
    }

    //Factorial
    public static int fact(int n) {
        if (n < 1)
            return 1;
        else return (n * fact(n - 1));
    }
}
