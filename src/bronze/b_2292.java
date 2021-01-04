package bronze;

import java.io.*;

// 벌집
public class b_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int end = 1, way = 1;

        while (true) {
            if (n <= end) {
                System.out.print(way);
                break;
            } else {
                end += 6 * way;
                way++;
            }
        }
    }
}