package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// 나머지
public class b_3052 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int[] ans = new int[42];
        int sum = 0;

        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            ans[arr[i]%42] = 1;
        }
        for(int k : ans){
            sum+=k;
        }
        System.out.println(sum);
    }
}
