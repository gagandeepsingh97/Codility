class Solution {
    public int solution(int N) {
        int count = 0;
        int i = 1;
        int n = (int)Math.sqrt(N);
        while(i <= n) {
            if(N % i == 0)
                count += 2;
            i++;
        }
        if(n*n == N)
            count--;
        return count;
    }
}