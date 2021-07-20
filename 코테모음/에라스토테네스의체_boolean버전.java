        int MAX = 1000000;
        boolean[] isPrime = new boolean[MAX+1];
        for(int i = 2; i <= MAX; i++) {
            isPrime[i] = true;
        }
        for(int i = 2; i <= MAX; i++) {
            for(int j = i * 2; j <= MAX; j += i) {
                if(!isPrime[j]) continue;
                isPrime[j] = false;
            }
        }
