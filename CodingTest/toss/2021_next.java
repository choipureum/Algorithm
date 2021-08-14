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
    public static void main(String[] args) {


    }
    public static long solution_01(int numOfStairs) {
        if(numOfStairs <= 0)
            return 1;
        if(numOfStairs == 1)
            return 1;
        else if(numOfStairs == 2)
            return 2;
        else if(numOfStairs == 3)
            return 4;
        return solution_01(numOfStairs - 1) + solution_01(numOfStairs - 2) + solution_01(numOfStairs - 3);
    }
    public static int[] solution_02(int[] fruitWeights, int k)
    {
        Set <Integer>set = new HashSet<>();
        ArrayList<Integer>list = new ArrayList<>();
        int [] arr;

        for (int i=0; i<fruitWeights.length-k+1; i++)
        {
            PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
            for(int j=i;j<i+k;j++)
            {
                maxHeap.add(fruitWeights[j]);
            }
            set.add(maxHeap.poll());
        }
        Iterator<Integer> iter = set.iterator();
        int i=0;
        while(iter.hasNext())
        {
            list.add(iter.next());
            i++;
        }
        Collections.sort(list,Collections.reverseOrder());
        arr = new int[list.size()];
        for(int j=0;j<list.size();j++)
        {
            arr[j]=list.get(j);
        }
        return arr;
    }
    public static long solution_03(long orderAmount, long taxFreeAmount, long serviceFee) {
        // orderAmount : 주문금액
        // taxFreeAmount : 비과세금액
        // serviceFee : 봉사료
        double vat = 0;
        long orderDaega = orderAmount-serviceFee; //공급대가
        //error check
        if(orderDaega-taxFreeAmount ==1) return 0;
        vat = (orderDaega-taxFreeAmount)/11.00;
        long answer = (long)Math.ceil(vat);
        return answer;
    }
}
