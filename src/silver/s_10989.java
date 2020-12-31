package silver;

import java.io.*;

// 수 정렬하기 3 - 카운팅 정렬
public class s_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        int[] cnt = new int[10001];
        int[] b = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(br.readLine());
            cnt[a[i]]++;
        }
        for (int j = 1; j < cnt.length - 1; j++) {
            cnt[j + 1] += cnt[j];
        }
        for (int k = n - 1; k > -1; k--) {
            b[cnt[a[k]] - 1] = a[k];
            cnt[a[k]]--;
        }
        for (int i : b) {
            bw.write(i + "\n");
        }
        bw.close();
    }
}
