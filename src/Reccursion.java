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

    //to print all substrings of a string in any order
    void printSub(String str, String curr, int index) {
        if (str.length() == index) {
            System.out.print(curr + " ");
            return;
        }
        printSub(str, curr, index + 1);
        printSub(str, curr + str.charAt(index), index + 1);
    }

    //to make steps of tower of hanoi
    void TOH(int n, char a, char b, char c) {
        if (n == 1) {
            System.out.println("Move 1 from " + a + " to " + c);
            return;
        }
        TOH(n - 1, a, c, b);
        System.out.println("Move " + n + " from " + a + " to " + c);
        TOH(n - 1, b, a, c);
    }

    //to find number of subsets for given sum
    int countSub(int arr[], int n, int sum) {
        if (n == 0)
            return (sum == 0) ? 1 : 0;
        return countSub(arr, n - 1, sum) +
                countSub(arr, n - 1, sum - arr[n - 1]);
    }

    //josephus problem -- to give position of survivor after alternatively killing every kth person
    int jos(int n, int k) {
        if (n == 1) return 0;
        else return (jos(n - 1, k) + k) % n;
    }

}



