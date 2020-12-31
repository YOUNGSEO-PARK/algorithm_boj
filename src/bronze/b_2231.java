package bronze;

import java.io.*;
import java.util.HashMap;

// 분해합 - 브루트포스
public class b_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int res = 0;
        for (int i = 1; i < 1000001; i++) {
            int m = i;
            int l = i;
            while (l > 0) {
                m += l % 10;
                l /= 10;
            }
            if (m == n) {
                res = i;
                break;
            }
        }
//        맵으로 풀기
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 1; i < 1000001; i++) {
//            String s = String.valueOf(i);
//            int m = i;
//            for (int j = 0; j < s.length(); j++) {
//                m += Integer.parseInt(String.valueOf(s.charAt(j)));
//            }
//            if (!map.containsKey(m)) {
//                map.put(m, i);
//            }
//        }
        bw.write(res+"");
        bw.close();
    }
}