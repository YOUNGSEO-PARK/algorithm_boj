package silver;

import java.io.*;
import java.util.*;

// 비밀번호 찾기
public class s_17219 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        HashMap<String, String> map = new HashMap<>();

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        for (int i = 0; i < n; i++) {
            String s = br.readLine();
            st = new StringTokenizer(s, " ");
            map.put(st.nextToken(), st.nextToken());
        }
        for (int j = 0; j < m; j++) {
            String q = br.readLine();
            bw.write(map.get(q)+"\n");
        }
        bw.flush();
        bw.close();
    }
}