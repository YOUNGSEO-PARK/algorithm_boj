package bronze;

import java.io.*;
import java.math.*;

// Hashing - BigInteger
public class b_15829 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int l = Integer.parseInt(br.readLine());
        String s = br.readLine();

        BigInteger n;
        BigInteger sum = BigInteger.ZERO;
        BigInteger r = BigInteger.valueOf(31);
        for (int i = 0; i < l; i++) {
            // 'a' - 1 은 '`'
            // Math.pow 가 아닌 BigInteger 의 pow 를 사용
            n = r.pow(i).multiply(BigInteger.valueOf((s.charAt(i) - '`')));
            sum = sum.add(n);
        }
        System.out.print(sum.mod(BigInteger.valueOf(1234567891)));
    }
}