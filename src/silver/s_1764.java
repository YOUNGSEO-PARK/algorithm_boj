package silver;

import java.io.*;
import java.util.*;

// 듣보잡 - 이분 탐색
public class s_1764 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
//        HashSet<String> set = new HashSet<>();
        String[] set = new String[n];

        for (int i = 0; i < n; i++) {
//            set.add(br.readLine());
            set[i] = br.readLine();
        }
        Arrays.sort(set);

        ArrayList<String> res = new ArrayList<>();
        for (int j = 0; j < m; j++) {
            String s = br.readLine();
//            if (!set.add(s)) {      Hashset 중복 불가 특징 이용

            // 이분 탐색 라이브러리
            if (Arrays.binarySearch(set, s) >= 0) {
                res.add(s);
            }
        }

        Collections.sort(res);

        bw.write(res.size() + "\n");
        for (String s : res) {
            bw.write(s + "\n");
        }
        bw.flush();
        bw.close();
    }
}
