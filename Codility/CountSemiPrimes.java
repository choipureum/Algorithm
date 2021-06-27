package com.company;
import java.util.*;

public class Main {
    //LikedList
    // reverse LinkedLists
    //  singly linked list vs doubly linked list
    public static void main(String[] args) {
        int N = 26;
        int [] P ={1,4,16};
        int [] Q ={26,10,20};
        int [] res = solution(N,P,Q);
        
        System.out.println(Arrays.toString(res));
    }
        public static int[] solution(int N, int[] P, int[] Q) {
            // write your code in Java SE 8
            int M = P.length;
            int[] result = new int[M];
            int[] accSemiprimes = getAccumulatedSemiprimes(N);

            for(int i=0; i<M; i++) {
                result[i] = accSemiprimes[Q[i]] - accSemiprimes[P[i] - 1];
            }

            return result;
        }


        private static int[] getAccumulatedSemiprimes(int N) {
            ArrayList<Integer> primes = getPrime(N);
            int[] semiprimes = new int[N+1];
            for(int prime1 : primes) {
                for(int prime2 : primes) {
                    int semiprime = prime1 * prime2;
                    if(semiprime > N) {
                        break;
                    }
                    semiprimes[semiprime] = 1;
                }
            }

            for(int i=1; i<=N; i++) {
                semiprimes[i] +=semiprimes[i-1];
            }

            // for(int i : semiprimes) {
            //     System.out.print(i + " ");
            // }

            return semiprimes;
        }

        private static ArrayList<Integer> getPrime(int N) {
            boolean[] isPrime = new boolean[N+1];
            ArrayList<Integer> primes = new ArrayList<>();

            for(int i=2; i*i<=N; i++) {
                if(isPrime[i] == false) {
                    for(int j=i*i; j<=N; j+=i) {
                        isPrime[j] = true;
                    }
                }
            }

            for(int i=2; i<=N; i++) {
                isPrime[i] = !isPrime[i];
            }

            for(int i=2; i<=N; i++) {
                if(isPrime[i]) {
                    primes.add(i);
                }
            }

            return primes;
        }
    }


