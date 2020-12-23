package silver;

import java.io.*;

// 괄호
public class s_9012 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            int open = 0, close = 0;
            String s = br.readLine();

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == '(') {
                    open++;
                } else {
                    close++;
                }
                if (open < close) {
                    System.out.println("NO");
                    break;
                }
            }
            if (open == close) {
                System.out.println("YES");
            }
            else if(open > close){
                System.out.println("NO");
            }
        }
    }
}