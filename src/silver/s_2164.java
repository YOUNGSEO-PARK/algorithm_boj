package silver;

import java.io.*;
import java.util.*;

// 카드2 - 큐
public class s_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 1; i < n+1; i++) {
            queue.offer(i);
        }

        while (queue.size() != 1) {
            queue.poll();
            queue.offer(queue.peek());
            queue.poll();
        }

        System.out.println(queue.peek());
    }
}
