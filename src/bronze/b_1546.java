package bronze;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class b_1546 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double sum = 0;
        double ans = 0;
        double[] score = new double[n];

        for(int i = 0; i < n ; i++){
            score[i] = sc.nextDouble();
        }
        double max = Arrays.stream(score).max().getAsDouble();

        for(int j = 0; j < n ; j++){
            score[j] = score[j]/max*100;
            sum+=score[j];
        }
        ans = sum/n;
        System.out.println(ans);

        sc.close();
    }
}
