package silver;

import java.io.*;
import java.util.*;

public class s_2805 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> tree = new ArrayList<>();
        String s = br.readLine();
        StringTokenizer st1 = new StringTokenizer(s, " ");
        int n = Integer.parseInt(st1.nextToken());
        int m = Integer.parseInt(st1.nextToken());

        StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < n; i++) {
            tree.add(i, Integer.parseInt(st2.nextToken()));
        }

        System.out.println(showHeight(tree, m, 0, Collections.max(tree)));
    }

    public static int showHeight(ArrayList<Integer> tree, int m, int left, int right) {
        int h = 0;
        while (left <= right) {
            int mid = (left + right) / 2;
            long sum = cutWood(tree, mid);

            if (sum == m) {
                h = mid;
                break;
            } else if (sum > m) {
                h = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return h;
    }

    public static long cutWood(ArrayList<Integer> tree, int mid) {
        long wood = 0;
        for (Integer integer : tree) {
            if (integer > mid) {
                wood += integer - mid;
            }
        }
        return wood;
    }
}