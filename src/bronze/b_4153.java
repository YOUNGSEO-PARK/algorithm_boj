package bronze;

import java.io.*;
import java.util.*;

// 직각삼각형
public class b_4153 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] arr = new int[3];
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[0] = Integer.parseInt(st.nextToken());
            arr[1] = Integer.parseInt(st.nextToken());
            arr[2] = Integer.parseInt(st.nextToken());

            if (arr[0] == 0 && arr[1] == 0 && arr[2] == 0) {
                bw.close();
                break;
            }

            Arrays.sort(arr);

            if ((Math.pow(arr[0], 2) + Math.pow(arr[1], 2)) == Math.pow(arr[2], 2)) {
                bw.write("right" + "\n");
            } else {
                bw.write("wrong" + "\n");
            }

            bw.flush();
        }
    }
}