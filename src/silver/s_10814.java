package silver;

import java.io.*;
import java.util.*;

// 나이순 정렬 - Comparator()
public class s_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        String[][] strings = new String[n][2];
        for(int i = 0; i < n ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            strings[i][0] = st.nextToken();
            strings[i][1] = st.nextToken();
        }

        // 오름차순이 자동으로 적용되어 있어서 비교할 필요 없는 람다식
        Arrays.sort(strings, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        // 내림차순을 위한 o1, o2를 교환한 람다식
        // Arrays.sort(strings, (o2, o1) -> Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0])));

        StringBuilder sb = new StringBuilder();
        for (String[] s : strings){
            sb.append(s[0]).append(" ").append(s[1]).append("\n");
        }
        System.out.print(sb);
    }
}