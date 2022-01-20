public class MinHeap {
    int arr[];
    int size;
    int capacity;

    MinHeap(int c) {
        capacity = c;
        size = 0;
        arr = new int[c];

    }

    int left(int i) {
        return 2 * i + 1;
    }

    int right(int i) {
        return 2 * i + 2;
    }

    int parent(int i) {
        return (i - 1) / 2;
    }

    void insert(int x) {
        if (size == capacity) return;
        size++;
        arr[size - 1] = x;
        for (int i = size - 1; i != 0 && arr[parent(i)] > arr[i]; ) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
        }
    }

    void minHeapify(int i) {
        int lt = left(i);
        int rt = right(i);
        int smallest = i;

        if (lt < size && arr[lt] < arr[smallest]) {
            smallest = lt;
        }
        if (rt < size && arr[rt] < arr[smallest]) {
            smallest = rt;
        }
        if (smallest != i) {
            int temp = arr[i];
            arr[i] = arr[smallest];
            arr[smallest] = temp;
            minHeapify(smallest);
        }
    }

    int extractMin() {
        if (size == 0) return Integer.MAX_VALUE;
        if (size == 1) {
            size--;
            return arr[0];
        }

        int temp = arr[0];
        arr[0] = arr[size - 1];
        arr[size - 1] = temp;

        minHeapify(0);
        return arr[size];
    }

    void decreaseKey(int i, int x) {
        arr[i] = x;
        while (i != 0 && arr[parent(i)] > arr[i]) {
            int temp = arr[i];
            arr[i] = arr[parent(i)];
            arr[parent(i)] = temp;
            i = parent(i);
        }
    }

    void deleteKey(int i) {
        decreaseKey(i, Integer.MIN_VALUE);
        extractMin();
    }

    //rearranges a given array to make a min heap.
    void buildHeap() {
        for (int i = (size - 2) / 2; i >= 0; i--) {
            minHeapify(i);
        }
    }

}
