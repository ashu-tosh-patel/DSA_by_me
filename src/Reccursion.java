public class Reccursion {


    //To calculate the factorial of small numbers.
    public long factorial(int n) {

        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    //Just to understand the function stack storing in recursion.
    void fun(int n) {
        if (n < 1) return;

        else {
            System.out.println(n);
            fun(n - 1);
            System.out.println(n);
        }
    }

    //to reverse a number.
    void reverse(int n) {
        if (n == 0) return;

        else {
            System.out.print(n % 10);
            reverse(n / 10);
        }
    }

    //to get sum of digits of a number
    int sumOfDig(int n) {
        if (n % 10 <= 0) return 0;
        return sumOfDig(n / 10) + n % 10;
    }

    //to get nth Fibonacci number
    int fibNum(int n) {
        if (n <= 1) return n;
        return fibNum(n - 1) + fibNum(n - 2);
    }

    //to determine if a string is a palindrome or not
    boolean isPal(String str, int s, int e) {
        if (s == e) return true;
        if (s > e) return true;
        if (str.charAt(s) != str.charAt(e)) return false;
        return isPal(str, s + 1, e - 1);
    }
}



