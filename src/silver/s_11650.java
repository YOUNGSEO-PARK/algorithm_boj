package silver;

import java.io.*;
import java.util.*;

// 좌표 정렬하기
public class s_11650 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }

        Arrays.sort(arr, Comparator.comparingInt(o->o[1]));
        Arrays.sort(arr, Comparator.comparingInt(o->o[0]));

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i][0] + " " + arr[i][1]);
        }
    }
}
