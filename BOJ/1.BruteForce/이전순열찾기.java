// Authored by : choipureum
// Co-authored by : -
// Link : http://boj.kr/d03dd43fa80e4eefb26138fb5ae36b64

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); //4
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int [] arr = new int[N];

        for(int i=0;i<N;i++)
        {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        if(preLevel(arr))
        {
            for(int tmp : arr)
            {
                sb.append(tmp+" ");
            }
        }
        else
        {
            sb.append(-1);
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
    public static boolean preLevel(int [] arr)//1234
    {
        int first_idx = arr.length-1; //3

        while(first_idx>0 && arr[first_idx]>arr[first_idx-1]) //4>3
        {
            first_idx--; //2
        }
        if(first_idx ==0) //맨처음
            return false;

        int last_idx = arr.length-1;
        while(arr[first_idx-1]<arr[last_idx]) //4>3
        {
            last_idx--; //2
        }
        swap(arr, first_idx-1, last_idx);

        last_idx = arr.length-1;
        while(first_idx < last_idx) {
            swap(arr, first_idx, last_idx);
            first_idx++;
            last_idx--;
        }
        return true;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
