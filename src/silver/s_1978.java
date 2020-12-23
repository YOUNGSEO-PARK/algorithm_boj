package silver;

import java.io.*;
import java.util.*;

// 소수 찾기 - 에라토스테네스의 체
public class s_1978 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[1001];

        for (int i = 2; i < arr.length; i++) {
            arr[1] = 1;
            for (int j = 2; i * j <= 1000; j++) {
                arr[i * j] = 1;
            }
        }

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int j = 0; j < n; j++) {
            int m = Integer.parseInt(st.nextToken());
            if (arr[m] == 0) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
