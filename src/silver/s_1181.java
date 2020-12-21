package silver;

import java.io.*;
import java.util.*;

// 단어 정렬
public class s_1181 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        String tmp;
        for (int i = 0; i < n; i++) {
            arr.add(br.readLine());
        }

        // 사전 정렬 먼저
        Collections.sort(arr);
        // 길이 정렬
        arr.sort(Comparator.comparingInt(String::length));

        System.out.println(arr.get(0));
        for (int l = 0; l < arr.size()-1; l++) {
            if(arr.get(l).equals(arr.get(l+1))) {
                continue;
            }
            System.out.println(arr.get(l+1));
        }
    }
}