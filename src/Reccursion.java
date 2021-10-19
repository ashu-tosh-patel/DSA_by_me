public class Reccursion {


    //To calculate the factorial of small numbers.
    public long factorial(int n) {

        if (n == 0) return 1;
        else return n * factorial(n - 1);
    }

    //Just to understand the fuction stack storing in reccursion.
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
}



