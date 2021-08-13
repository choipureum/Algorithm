// Authored by : choipureum
// Co-authored by : -
// Link : -

package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
    // Coin Change
    // DP
    // DP란 답을 알고 이전을 탐색한다 => 큰것에서 작은것으로

    public static void main(String[] args) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        int [] coins= {1,2,5};
        int amount = 11;

        System.out.println(CoinChange(coins,amount)); // 3
    }
    public static int CoinChange(int [] coins, int amount)
    {
        int max = amount+1;
        int [] dp = new int[max];

        Arrays.fill(dp,max);
        dp[0] = 0;

        //2
        for(int i=1;i<=amount;i++) //1~11
        {
            for(int j=0;j<coins.length;j++) //coin = [1,2,5]
            {
                if(i>=coins[j])
                {
                    dp[i] = Math.min(dp[i],dp[i-coins[j]]+1);
                }
            }
        }
        return dp[amount]>amount?-1:dp[amount];
    }

}
