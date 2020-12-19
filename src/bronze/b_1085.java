package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class b_1085 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        StringTokenizer st = new StringTokenizer(s," ");
        int[] f = new int[4];

        f[0] = Integer.parseInt(st.nextToken());
        f[1] = Integer.parseInt(st.nextToken());
        f[2] = Integer.parseInt(st.nextToken()) - f[0];
        f[3] = Integer.parseInt(st.nextToken()) - f[1];

        int min = Arrays.stream(f).min().getAsInt();

        System.out.println(min);
    }
}
