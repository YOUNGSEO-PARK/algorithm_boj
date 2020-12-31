package silver;

import java.io.*;
import java.util.*;

// 집합 - 비트마스크
public class s_11723 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = Integer.parseInt(br.readLine());
        int k = 0;
        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            String s = st.nextToken();
            int n;
            switch (s) {
                case "add":
                    n = Integer.parseInt(st.nextToken());
                    k = add(n, k);
                    break;
                case "remove":
                    n = Integer.parseInt(st.nextToken());
                    if (check(n, k) == 0) {
                        continue;
                    }
                    k = remove(n, k);
                    break;
                case "check":
                    n = Integer.parseInt(st.nextToken());
                    bw.write(check(n, k) + "\n");
                    break;
                case "toggle":
                    n = Integer.parseInt(st.nextToken());
                    k = toggle(n, k);
                    break;
                case "all":
                    k = all();
                    break;
                case "empty":
                    k = empty();
                    break;
            }
        }
        bw.flush();
        bw.close();
    }

    public static int add(int n, int k) {
        k |= 1 << n - 1;
        return k;
    }

    public static int remove(int n, int k) {
        k &= ~(1 << n - 1);
        return k;
    }

    public static int check(int n, int k) {
        return (k & (1 << n - 1)) != 0 ? 1 : 0;
    }

    public static int toggle(int n, int k) {
        k ^= (1 << n - 1);
        return k;
    }

    public static int all() {
        return (1 << 20) - 1;
    }

    public static int empty() {
        return 0;
    }
}