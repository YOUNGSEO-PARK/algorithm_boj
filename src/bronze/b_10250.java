package bronze;

import java.io.*;
import java.util.*;

// ACM 호텔
public class b_10250 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int cnt = 1;

            for (int j = 1; h < n; j++) {
                n -= h;
                cnt = j + 1;
            }
            if (cnt < 10) {
                bw.write(n + "0" + cnt + "\n");
            } else {
                bw.write(n + "" + cnt + "\n");
            }
        }
        bw.close();
    }
}
