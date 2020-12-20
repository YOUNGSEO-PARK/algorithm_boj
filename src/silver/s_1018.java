package silver;

import java.io.*;
import java.util.*;

// 체스판 다시 칠하기
public class s_1018 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String size = br.readLine();
        StringTokenizer st = new StringTokenizer(size, " ");
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        Vector<Integer> change = new Vector<Integer>();
        String[] s = new String[n];
        char[][] board = new char[n][m];

        for (int i = 0; i < n; i++) {
            s[i] = br.readLine();
        }

        // 체스판 이동
        for (int r = 0; r < n - 7; r++) {
            for (int c = 0; c < m - 7; c++) {
                // 체스판 한 장씩 체크
                int cnt = 0;
                char idx = s[r].charAt(c);

                for (int a = 0; a < 8; a++) {
                    for (int b = 0; b < 8; b++) {
                        char chk = s[r + a].charAt(c + b);

                        // 퐁당퐁당 구분하는 요령
                        if ((a + b) % 2 == 0) {
                            if (idx != chk) {
                                cnt++;
                            }
                        } else {
                            if (idx == chk) {
                                cnt++;
                            }
                        }
                    }
                }
                change.add(cnt);
                // 색 반전
                change.add(64 - cnt);
            }
        }
        Collections.sort(change);
        System.out.print(change.get(0));
    }
}