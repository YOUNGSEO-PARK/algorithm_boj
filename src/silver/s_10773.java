package silver;

import java.io.*;
import java.util.*;

// 제로 - 스택
public class s_10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> s = new Stack<>();
        int n = Integer.parseInt(br.readLine());
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int k = Integer.parseInt(br.readLine());
            if (k == 0) {
                s.pop();
                continue;
            }
            s.push(k);
        }
        while (!s.isEmpty()) {
            sum += s.peek();
            s.pop();
        }
        System.out.println(sum);
    }
}
