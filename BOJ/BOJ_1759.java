package com.company;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {


    static int L, C;
    static char alpa[], sel[];
    static StringBuilder sb;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb = new StringBuilder();

        L = Integer.parseInt(st.nextToken()); // 암호 자리수
        C = Integer.parseInt(st.nextToken()); // 사용했을 법한 문자의 종류

        alpa = new char[C];
        sel = new char[L];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < C; i++) {
            alpa[i] = st.nextToken().charAt(0);
        }
        // 조교들은 정렬된 문자열을 선호
        Arrays.sort(alpa);

        process(0, 0, 0, 0);

        System.out.println(sb);
    }

    // 최소 한 개의 모음과 최소 두 개의 자음으로 구성
    private static void process(int idx, int cnt, int v, int c) {
        // 조합이 완성되었을 경우
        if(cnt == L) {
            if(v >= 1 && c >= 2) {
                for (int i = 0; i < L; i++) {
                    sb.append(sel[i]);
                }
                sb.append('\n');
            }

            return;
        }

        for (int i = idx; i < C; i++) {
            sel[cnt] = alpa[i];

            if(alpa[i] == 'a' || alpa[i] == 'e' || alpa[i] == 'i' || alpa[i] == 'o' || alpa[i] == 'u')
                process(i + 1, cnt + 1, v + 1, c);
            else
                process(i + 1, cnt + 1, v , c + 1);
        }
    }
}
