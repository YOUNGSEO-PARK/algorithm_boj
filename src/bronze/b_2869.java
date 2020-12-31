package bronze;

import java.io.*;
import java.util.*;

// 달팽이는 올라가고 싶다
public class b_2869 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        double a = Integer.parseInt(st.nextToken());
        double b = Integer.parseInt(st.nextToken());
        double v = Integer.parseInt(st.nextToken());

        // 마지막 날
        int h = 1;

        // (목표 높이 - 마지막 날 낮에 올라가는 높이) / 하루 동안 올라가는 높이
        h += Math.ceil((v - a) / (a - b));
        System.out.println(h);
    }
}