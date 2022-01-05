    public static int solution(int[] A) {
        // write your code in Java SE 8
        boolean [] visited = new boolean[A.length];
        visited[0] = true;
        int idx = 0;
        int result = 0;
        while(true){
            result++;
            int next = A[idx];
            if(next == -1 || visited[next]){
                break;
            }
            visited[next] = true;
            idx = A[idx];
        }
        return result;    
    }
