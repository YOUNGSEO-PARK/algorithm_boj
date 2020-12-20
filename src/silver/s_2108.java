package silver;

import java.io.IOException;
import java.util.*;

// 통계학 - 최빈값
public class s_2108 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // 평균값 반올림하라고 했으니 int 안됨
        double sum = 0;
        int mode = 0;
        int chk = 0;
        Vector<Integer> v = new Vector<Integer>();
        Vector<Integer> ans = new Vector<Integer>(4);

        // 입력할 수 있는 최대 절댓값이 4000이므로 음양수 고려
        int[] idx = new int[8001];

        for (int i = 0; i < n; i++) {
            v.add(sc.nextInt());
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

        for (Integer i : ans) {
            System.out.println(i);
        }
        sc.close();
    }
}
