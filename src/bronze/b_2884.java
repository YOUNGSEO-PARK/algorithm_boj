package bronze;

import java.io.*;
import java.util.*;

// 알람 시계
public class b_2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int h = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        if(m<45){
            m = 60 + (m - 45);
            if(h==0){
                h = 23;
            } else {
                h-=1;
            }
        } else{
            m -= 45;
        }

        bw.write(h+" "+m);
        bw.close();
    }
}
