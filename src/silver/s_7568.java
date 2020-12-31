package silver;

import java.io.*;
import java.util.*;

// 덩치 - 브루트포스
public class s_7568 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());

        }

        for (int j = 0; j < n; j++) {
            int rank = 1;
            for (int k = 0; k < n; k++) {
                if (arr[j][0] < arr[k][0] && (arr[j][1] < arr[k][1])) {
                    rank++;
                }
            }
            bw.write(rank + " ");
        }
        bw.flush();
        bw.close();
    }
}