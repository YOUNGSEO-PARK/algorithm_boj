package silver;

import java.io.*;

// 팩토리얼 0의 개수
public class s_1676 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 0개수 누적 계산 (5의 1승, 5의 2승, 5의 3승)
        // 나누어떨어지지 않은 수도 이미 계산된 수들의 5의 개수를 누적한다
        System.out.print(n / 5 + n / 25 + n / 125);
    }
}
