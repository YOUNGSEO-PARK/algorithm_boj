package bronze;

import java.io.*;
import java.util.*;

// 문자열 반복
public class b_2675 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for(int r =0;r <t ; r++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int n = Integer.parseInt(st.nextToken());
            String s = st.nextToken();

            for (int i = 0; i < s.length(); i++) {
                for (int j = 0; j < n; j++) {
                    bw.write(s.charAt(i));
                }
            }
            bw.write("\n");
        }
        bw.flush();
        bw.close();
    }
}
