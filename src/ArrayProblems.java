import java.util.Collection;
import java.util.Collections;

public class ArrayProblems {

    //to reverse the array
    void arrayReverse(int arr[]) {
        int low = 0, high = arr.length - 1, temp = 0;
        while (low < high) {
            temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;

        }
    }


    //to find maximum k consecutive elements
    //sliding window technique
    int maxKSum(int arr[], int k) {
        int max = Integer.MIN_VALUE;
        int win_sum = 0;
        for (int i = 0; i < k; i++) {
            win_sum += arr[i];
        }
        max = win_sum;

        for (int i = 0; i < arr.length - k; i++) {
            win_sum = win_sum - arr[i] + arr[i + k];

            if (win_sum > max)
                max = win_sum;
        }
        return max;
    }

    // to insert an element in the array

    int insert(int arr[], int pos, int cap, int x, int n) {
        if (arr.length == cap)
            return n;

        int idx = pos - 1;
        for (int i = n - 1; i >= idx; i--)
            arr[i + 1] = arr[i];

        arr[idx] = x;
        return n + 1;

    }
    //to return position of largest element in an array

    int maxPos(int arr[]){

        int pos=0;
        for (int i=0; i<arr.length;i++){
            if (arr[i]>arr[pos]){

                pos=i;
            }
        }
        return pos+1;

    }



}


