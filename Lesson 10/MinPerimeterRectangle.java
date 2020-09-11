class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int n = (int)Math.sqrt(N);
        for(int i = n; i >= 0; i--) {
            if(N % i == 0) {
                return 2*(i + N/i);
            }
        }
        return 1;
    }
}