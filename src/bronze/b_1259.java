package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 팰린드롬 수
public class b_1259 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb  = new StringBuilder();

        while(true){

            String s = br.readLine();
            String r = null;
            for(int i = s.length() - 1 ; i >= 0 ; i--){

                r = sb.append(s.charAt(i)).toString();
            }
            if(s.equals("0")){
                return;
            }
            else if(s.equals(r)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
            // StringBuilder 초기화해줘야함
            sb.setLength(0);
        }
    }
}
