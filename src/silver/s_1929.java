package silver;

import java.io.*;
import java.util.*;

// 소수 구하기 - 에라토스테네스의 체
public class s_1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        int[] a = new int[n + 1];
        a[1] = 1;
        for (int i = 2; i < a.length; i++) {
            for (int j = 2; i * j < a.length; j++) {
                a[i * j] = 1;
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int k = m; k < a.length; k++) {
            if (a[k] == 0) {
                sb.append(k).append("\n");
            }
        }
        System.out.print(sb);
    }
}