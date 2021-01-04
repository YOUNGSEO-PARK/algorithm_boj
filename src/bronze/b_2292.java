package bronze;

import java.io.*;

// 벌집
public class b_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long start = 1, end = 1;
        int way = 1, i = 1;

        while (true) {
            if (n >= start && n <= end) {
                System.out.print(way);
                break;
            } else {
                way++;
                start = end + 1;
                end += 6L * i;
            }
            i++;
        }
    }
}