package silver;

import java.io.*;
import java.util.*;

// 수 정렬하기 2
public class s_2751 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ArrayList<Integer> arr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr);
        for (Integer j : arr) {
            bw.write(j + "\n");
        }
        bw.close();
    }
}
