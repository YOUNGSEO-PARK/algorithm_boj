package bronze;

import java.io.*;
import java.util.*;

// 음계
public class b_2920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < 8; i++) {
            arr.add(Integer.parseInt(st.nextToken()));
        }

        boolean pass = true;
        for (int j = 0; j < 7; j++) {
            if (arr.get(j) != j + 1) {
                pass = false;
                break;
            }
        }
        if (pass) {
            bw.write("ascending");
            bw.flush();
            return;
        }

        pass = true;
        for (int j = 0; j < 7; j++) {
            if (arr.get(j) != 8 - j) {
                pass = false;
                break;
            }
        }
        if (pass) {
            bw.write("descending");
        } else {
            bw.write("mixed");
        }

        bw.flush();
        bw.close();
    }
}