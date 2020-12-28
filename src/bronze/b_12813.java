package bronze;

import java.io.*;

// 이진수 연산
public class b_12813 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = br.readLine();
        String b = br.readLine();

        // AND
        for(int i = 0 ; i < 100000 ;i++){
            bw.write((Integer.parseInt(String.valueOf(a.charAt(i))) & Integer.parseInt(String.valueOf(b.charAt(i)))) +"");
        }
        bw.newLine();

        // OR
        for(int i = 0 ; i < 100000 ;i++){
            bw.write((Integer.parseInt(String.valueOf(a.charAt(i))) | Integer.parseInt(String.valueOf(b.charAt(i)))) +"");
        }

        // XOR
        bw.newLine();
        for(int i = 0 ; i < 100000 ;i++){
            bw.write((Integer.parseInt(String.valueOf(a.charAt(i))) ^ Integer.parseInt(String.valueOf(b.charAt(i)))) +"");
        }
        bw.newLine();

        // NOT a
        for(int i = 0 ; i < 100000 ;i++){
            bw.write((a.charAt(i) == '0' ? 1 : 0) + "");
        }
        bw.newLine();

        // NOT b
        for(int i = 0 ; i < 100000 ;i++){
            bw.write((b.charAt(i) == '0' ? 1 : 0) + "");
        }
        bw.newLine();

        bw.flush();
        bw.close();
    }
}
