package bronze;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

// 단어 공부 - 최빈 알파벳
public class b_1157 {
    public static void main(String[] args) throws IOException{

        int[] idx = new int['Z'-'A'+1];
        int chk = 0;
        int ans = 0;
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        // 대문자로 바꾸고 저장하기
        s = s.toUpperCase();

        for(int i = 0 ; i < s.length() ; i++){
           idx[s.charAt(i)-'A']++;
        }
        int max = Arrays.stream(idx).max().getAsInt();

        for(int j = 0 ; j < idx.length ; j++){
            if(max == idx[j]) {
                chk++;
                ans = 'A'+j;

            }
        }
        if(chk!=1) {
            ans = '?';
        }

        System.out.println((char) ans);

        sc.close();

    }
}
