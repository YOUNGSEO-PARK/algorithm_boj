package bronze;

import java.io.*;
import java.util.*;

// 이항 계수 1
public class b_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        System.out.println(factorial(n) / (factorial(k) * factorial(n - k)));
    }

    public static int factorial(int c) {
        if (c == 0) {
            return 1;
        } else if (c == 1) {
            return c;
        }
        return c * factorial(c - 1);
    }
}