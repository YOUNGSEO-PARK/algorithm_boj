package silver;

import java.io.*;

// 한수 - 브루트포스
public class s_1065 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 99;

        if(n < 100){
            cnt = n;
        }
        for (int i = 100; i <= n; i++) {
            String s = Integer.toString(i);
            if (s.length() == 3) {
                int a = i%10; // 일의 자리
                int b = (i/10)%10; // 십의 자리
                int c = i/100; // 벡의 자리
                if ((a - b) == (b - c)) {
                    cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

