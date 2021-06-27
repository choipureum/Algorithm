    private ArrayList<Integer> getPrime(int N) {
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
