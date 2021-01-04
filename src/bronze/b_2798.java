package bronze;

import java.io.*;
import java.util.*;

// 블랙잭스 - 브루트포스
public class b_2798 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> card = new ArrayList<>();
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            card.add(Integer.parseInt(st.nextToken()));
        }

        ArrayList<Integer> sum = new ArrayList<>();
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                for (int l = k + 1; l < n; l++) {
                    int pass = card.get(j) + card.get(k) + card.get(l);
                    if (pass == m) {
                        System.out.print(pass);
                        return;
                    } else if (pass < m) {
                        sum.add(pass);
                    }
                }
            }
        }
        System.out.print(Collections.max(sum));
    }
}