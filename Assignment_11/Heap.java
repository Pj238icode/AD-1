import java.util.Scanner;

public class Heap {
    // Build a Max Heap
    void create_Max_heap(int arr[]) {
        int length = arr.length;
        for (int i = length / 2 - 1; i >= 0; i--) {
            Max_Heapify(arr, i, length);
        }
        for (int i = length / 2 - 2; i >= 0; i--) {
            Max_Heapify(arr, i, length);
        }
    }

    void Max_Heapify(int arr[], int start, int end) {
        int largest = start;
        int left = 2 * start + 1;
        int right = 2 * start + 2;
        if (left < end && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < end && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != start) {
            int temp = arr[largest];
            arr[largest] = arr[start];
            arr[start] = temp;
            Max_Heapify(arr, start, end);
        }

    }

    // Heap Sort
    void HeapSort(int arr[]) {
        int length = arr.length;
        for (int i = length - 1; i >= 0; i--) {
            int temp = arr[i];
            arr[i] = arr[0];
            arr[0] = temp;
            Max_Heapify(arr, 0, i);
        }

    }

    // Check whether the given list of elements is in max heap or not
    int Ensure_MaxHeap(int arr[]) {
        int start = 0;
        int end = arr.length;
        int largest = start;
        int left = 2 * start + 1;
        int right = 2 * start + 2;
        if (left < end && arr[left] > arr[largest]) {
            return 1;
        }
        if (right < end && arr[right] > arr[largest]) {
            return 1;
        } else {
            return 0;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the heap: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Heap h = new Heap();

        h.create_Max_heap(arr);
        System.out.print("The elements after max heapify: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print("The sorted elements are: ");

        h.HeapSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
        System.out.println();
        int res = h.Ensure_MaxHeap(arr);
        if (res == 1) {
            System.out.println("The given array is a max heap");
        } else {
            System.out.println("The given array is not a max heap");
        }

    }

}