package study;

public class Quick {
    public static void main(String[] args) {
        int[] arr = {0, 3, -1, 4, 5, 2, 10, 1, 1, 4};
        printArray(arr);
        quick(arr);
        printArray(arr);
    }

    public static void quick(int[] arr) {
        quicksort(arr, 0, arr.length - 1);
    }

    public static void quicksort(int[] arr, int start, int end) {
        // 오른쪽 파티션의 start index
        int right_start = partition(arr, start, end);

        // 왼쪽 파티션 정렬
        if (start < right_start - 1) {
            quicksort(arr, start, right_start - 1);
        }

        // 오른쪽 파티션 정렬
        if (right_start < end) {
            quicksort(arr, right_start, end);
        }
    }
    public static int partition(int[] arr, int start, int end) {
        int pivot = arr[(start + end) / 2];
        while (start <= end) {
            while (arr[start] < pivot) start++;
            while (arr[end] > pivot) end--;

            // start, end 가 서로 지나치지 않았다면 자리 바꾸기
            if (start <= end) {
                swap(arr, start, end);
                start++;
                end--;
            }
        }
        // 새로 나눌 오른쪽 파티션의 start index 리턴
        return start;
    }
    public static void swap(int[] arr, int start, int end){
    int tmp = arr[start];
    arr[start] = arr[end];
    arr[end] = tmp;
    }

    public static void printArray(int[] arr){
        for( int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
