package silver;

import java.io.*;
import java.util.*;

public class s_10814 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[][] strings = new String[n][2];

        for(int i = 0; i < n ; i++){
            String s = br.readLine();
            StringTokenizer st = new StringTokenizer(s, " ");
            strings[i][0] = st.nextToken();
            strings[i][1] = st.nextToken();
        }

        // 오름차순이 자동으로 적용되어 있어서 비교할 필요 없는 람다식
        Arrays.sort(strings, Comparator.comparingInt(o -> Integer.parseInt(o[0])));

        // 내림차순을 위한 o1, o2를 교환한 람다식
        // Arrays.sort(strings, (o2, o1) -> Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0])));

        for (String[] s : strings){
            System.out.println(s[0]+" "+s[1]);
        }
    }
}
