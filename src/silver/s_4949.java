package silver;

import java.io.*;
import java.util.*;

// 균형잡힌 세상 - 스택
public class s_4949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();

        String s;
        while (!(s = br.readLine()).equals(".")) {

            // 스택 초기화
            stack.clear();
            String pass = "yes";

            // 문자열 -> 문자 배열
            for (char c : s.toCharArray()) {
                if (c == '(' || c == '[') {
                    stack.push(c);
                } else if (c == ')') {
                    // peek() 후에 pop()보다 pop()한 것을 체크
                    if (stack.isEmpty() || stack.pop() != '(') {
                        pass = "no";
                        break;
                    }
                } else if (c == ']') {
                    if (stack.isEmpty() || stack.pop() != '[') {
                        pass = "no";
                        break;
                    }
                }
            }
            if (!stack.isEmpty()) {
                pass = "no";
            }
            sb.append(pass).append("\n");
        }
        System.out.print(sb);
    }
}