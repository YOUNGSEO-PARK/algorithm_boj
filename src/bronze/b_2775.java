package bronze;

import java.io.*;

// 부녀회장이 될테야
public class b_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());

            int[][] house = new int[k + 1][n + 1];
            for (int j = 1; j <= n; j++) {
                house[0][j] = j;
            }

            for (int l = 1; l <= k; l++) {
                // house[][1] = 1 로 초기화 한 것 + 아래층의 같은 호의 인원 수
                house[l][1] = 1;
                for (int m = 2; m <= n; m++) {
                    house[l][m] = house[l][m - 1] + house[l - 1][m];

                    // 아래층의 모든 호의 인원 수 합하기 (최대 호 수가 많을 경우 불리하다)
//                int cnt = n;
//                while (cnt != 0) {
//                    for (int m = cnt; m > 0; m--) {
//                        house[l][cnt] += house[l - 1][m];
//                    }
//                    cnt--;
//                }
                }
            }
            bw.write(house[k][n] + "\n");
        }
        bw.flush();
        bw.close();
    }
}
