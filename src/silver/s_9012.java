package silver;

import java.io.*;
import java.util.*;

// 괄호 - 스택
public class s_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            String pass = "YES";
            stack.clear();
            for (char c : s.toCharArray()) {

                if (c == '(') {
                    stack.push(c);
                } else {
                    if (stack.isEmpty() || stack.pop() != '(') {
                        pass = "NO";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                pass = "NO";
            }
            sb.append(pass).append("\n");
        }
        System.out.print(sb);
    }
}