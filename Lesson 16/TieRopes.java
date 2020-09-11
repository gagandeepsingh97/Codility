class Solution {
    public int solution(int K, int[] A) {
        int len = 0;
        int ans = 0;
        for(int i : A) {    
            len += i;
            if(len >= K) {
                ans++;
                len = 0;
            }
        }
        return ans;
    }
}