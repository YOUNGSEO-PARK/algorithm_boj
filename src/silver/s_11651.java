package silver;

import java.io.*;
import java.util.*;

// 좌표 정렬하기 2
public class s_11651 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][2];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr, Comparator.comparingInt(o->o[0]));
        Arrays.sort(arr, Comparator.comparingInt(o->o[1]));

        for (int i = 0; i < n; i++) {
            bw.write(arr[i][0] + " " + arr[i][1]+"\n");
        }
        bw.close();
    }
}
