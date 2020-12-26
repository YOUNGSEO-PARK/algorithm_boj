package silver;

import java.io.*;
import java.util.*;

// 나는야 포켓몬 마스터 이다솜
public class s_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        HashMap<Integer, String> mapi = new HashMap<>();
        HashMap<String, Integer> maps = new HashMap<>();
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 1; i <= n; i++) {
            String p = br.readLine();
            mapi.put(i, p);
            maps.put(p, i);
        }
        for (int j = 0; j < m; j++) {
            String q = br.readLine();

            // 입력받은 문자가 숫자인지 판별
            try {
                Integer.parseInt(q);
                bw.write(mapi.get(Integer.parseInt(q)) + "\n");
            } catch (NumberFormatException e) {
                bw.write(maps.get(q) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
