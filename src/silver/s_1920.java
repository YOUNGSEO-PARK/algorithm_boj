package silver;

import java.io.*;
import java.util.*;

// 수 찾기 - 이분 탐색
public class s_1920 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> a = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            a.add(i, sc.nextInt());
        }

        Collections.sort(a);

        int b;
        int m = sc.nextInt();
        for (int j = 0; j < m; j++) {
            b = sc.nextInt();
            System.out.println(binary(a, b));
        }
    }

    public static int binary(ArrayList<Integer> a, int b) {
        int start = 0;
        int end = a.size() - 1;
        while (end - start >= 0) {
            int index = (start + end) / 2;

            if (a.get(index).equals(b)) {
                return 1;
            } else if (a.get(index) > (b)) {
                end = index - 1;
            } else
                start = index + 1;
        }
        return 0;
    }
}
