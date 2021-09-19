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
    int maxKSum(int arr[],int k){
        int max=Integer.MIN_VALUE;
        int win_sum=0;
        for (int i=0; i<k; i++){
            win_sum+=arr[i];
        }
        max=win_sum;

        for (int i=0; i<arr.length-k; i++){
            win_sum=win_sum-arr[i]+arr[i+k];

            if (win_sum>max)
                max=win_sum;
        }
        return max;
    }

}


