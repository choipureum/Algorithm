package mainproject;

import java.io.*;
import java.util.*;
import java.util.stream.*;

public class Main{
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] dp = new int[n+1];
    int[] arr = new int[n+1];

    for (int i = 1; i <= n; i++) {
        arr[i] = sc.nextInt();
    }

    dp[1] = arr[1];
    int max = dp[1];
    for (int i = 2; i <= n; i++) {
        //이전 연속합과 자신의 값을 합한 값과 자기 자신을 포함하지 않고 새롭게 시작하는 값인 자신의 값 중 크기에 따라
        //분기 처리
        if (dp[i-1] + arr[i] > arr[i]) {
            //포함하는 경우
            dp[i] = dp[i-1] + arr[i];
        } else {
            //새롭게 합을 시작하는 경우
            dp[i] = arr[i];
        }

        max = Math.max(max, dp[i]);
    }
    System.out.println(Arrays.toString(dp));
    System.out.println(max);

}

}
/*

 */