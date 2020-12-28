package bronze;

import java.io.*;
import java.util.*;

// 상수
public class b_2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        String a = st.nextToken();
        String b = st.nextToken();
        String aa="", bb="";
        for(int i = 2 ; i >= 0 ;i--){
            aa = sb1.append(a.charAt(i)).toString();
            bb = sb2.append(b.charAt(i)).toString();
        }
        bw.write(Integer.parseInt(aa) > Integer.parseInt(bb) ? aa : bb);
        bw.close();
    }
}
