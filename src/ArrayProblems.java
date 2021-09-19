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



}


