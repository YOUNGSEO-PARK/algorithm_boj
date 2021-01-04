package silver;

import java.io.*;
import java.util.*;

// 요세푸스 문제 0 - 큐
public class s_11866 {
    public static void main(String[] args) throws IOException {
        Queue<Integer> queue = new LinkedList<>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        for (int i = 1; i <= n; i++) {
            queue.offer(i);
        }

        StringBuilder sb = new StringBuilder();
        sb.append("<");
        while (!queue.isEmpty()) {
            int cnt = k;
            for (int j = cnt; cnt > 1; cnt--) {
                queue.offer(queue.poll());
            }
            sb.append(queue.poll()).append(", ");
        }
        sb.delete(sb.length() - 2, sb.length()).append(">");
        System.out.print(sb);
    }
}