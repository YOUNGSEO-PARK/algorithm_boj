package study;

public class CountingSort {
    public static void main(String[] args) {
        int[] a = {1, 4, 3, 2, 9, 9, 15, 3, 12};

        printArray(a);
        counting(a, a.length);
    }

    public static void counting(int[] a, int length) {

        int[] cnt = new int[20];
        int[] b = new int[length];

        for (int h = 0; h < length; h++) {
            cnt[a[h]]++;
        }

        for (int i = 1; i < cnt.length - 1; i++) {
            cnt[i + 1] += cnt[i];
        }
        for (int j = length - 1; j > -1; j--) {
            b[cnt[a[j]] - 1] = a[j];
            cnt[a[j]]--;
        }
        printArray(b);
    }

    public static void printArray(int[] a) {
        for (int i : a) {
            System.out.print(i+" ");
        }
        System.out.println(" ");
    }
}