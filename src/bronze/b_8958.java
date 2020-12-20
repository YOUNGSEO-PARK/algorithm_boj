package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// OX 퀴즈
public class b_8958 {
    public static void main(String[] args) throws IOException {

        int n, ans, chk;
        String s;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        while(n!=0){
            s = br.readLine();
            ans = 0;
            chk = 0;

            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(j) == 'O') {
                    chk++;
                    ans += chk;
                } else
                    chk = 0;
            }
            System.out.println(ans);
            n--;
        }
        br.close();
    }
}
