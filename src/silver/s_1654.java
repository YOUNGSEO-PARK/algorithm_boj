package silver;

import java.io.*;
import java.util.*;

// 랜선 자르기 - 이분 탐색
public class s_1654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int k = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<Integer> line = new ArrayList<>();
        for (int i = 0; i < k; i++) {
            line.add(Integer.parseInt(br.readLine()));
        }

        // 이분 탐색
        long start = 1;
        long end = Collections.max(line);
        long bin = end;

        ArrayList<Long> pass = new ArrayList<>();
        long cnt;
        // 이분 탐색 종료 조건 : start 가 end 를 넘어갈 때
        while (start <= end) {
            cnt = 0;
            for (int j = 0; j < k; j++) {
                cnt += line.get(j) / bin;
            }

            if (cnt < n) {
                end = bin - 1;
            }
            // cnt(자른 도막 개수)가 n(필요한 도막 개수) 과 같거나 크면 pass
            else {
                start = bin + 1;
                // 길이 저장 (길이가 짧을 수록 도막 개수가 많다)
                pass.add(bin);
            }
            bin = (start + end) / 2;
        }
        // pass 된 길이들 중 가장 긴 길이 출력
        System.out.println(Collections.max(pass));
    }
}