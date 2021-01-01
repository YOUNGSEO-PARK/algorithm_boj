package silver;

import java.io.*;
import java.util.*;

// 통계학 - 최빈값
public class s_2108 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        // 평균값은 반올림하라고 했으므로 int 는 불가능하다
        double sum = 0;
        int mode = 0, chk = 0;
        Vector<Integer> v = new Vector<>();
        Vector<Integer> ans = new Vector<>(4);

        // 입력할 수 있는 최대 절댓값이 4000이므로 음양수를 고려한다
        int[] idx = new int[8001];
        for (int i = 0; i < n; i++) {
            v.add(Integer.parseInt(br.readLine()));
            sum += v.get(i);
        }

        // 벡터 오름차순 정렬
        Collections.sort(v);

        ans.add((int) Math.round(sum / n));
        ans.add(v.get(n / 2));

        for (int j = 0; j < n; j++) {
            idx[4000 + v.get(j)]++;
        }

        int max = Arrays.stream(idx).max().getAsInt();
        for (int k = 0; k < idx.length; k++) {
            if (idx[k] == max) {
                mode = k - 4000;
                chk++;
                if (chk == 2)
                    break;
            }
        }

        ans.add(mode);
        ans.add(v.get(n - 1) - v.get(0));

        StringBuilder sb = new StringBuilder();
        for (Integer i : ans) {
            sb.append(i).append("\n");
        }

        System.out.print(sb);
    }
}