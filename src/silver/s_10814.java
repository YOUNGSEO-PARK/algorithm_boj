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

        Arrays.sort(strings, new Comparator<String[]>() {
            @Override
            public int compare(String[] o1, String[] o2) {
                return Integer.compare(Integer.parseInt(o1[0]), Integer.parseInt(o2[0]));
            }
        });

        for (String[] s : strings){
            System.out.println(s[0]+" "+s[1]);
        }
    }
}
