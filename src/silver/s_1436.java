package silver;

import java.io.*;

// 영화감독 숌
public class s_1436 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 666; cnt <= 10000; i++) {
            // 문자열 포함 여부 확인
            if (Integer.toString(i).contains("666")) {
                cnt++;
            }
            if (cnt == n) {
                System.out.println(i);
                return;
            }
        }
    }
}
