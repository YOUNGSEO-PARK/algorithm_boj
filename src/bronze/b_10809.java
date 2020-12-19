package bronze;

import java.io.IOException;
import java.util.*;

public class b_10809 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = new String();
        int idx[] = new int['z'-'a'+1];
        s = sc.nextLine();

        Arrays.fill(idx,-1);

        for(int i = 0 ; i < s.length(); i++){
            int chk = s.charAt(i)-'a';

            if(idx[chk] != -1) {
                continue;
            }
            idx[chk] =  i;
        }

        for(int j : idx)
            System.out.println(j);

        sc.close();
    }
}
