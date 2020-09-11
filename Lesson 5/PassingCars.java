class Solution {
    public int solution(int[] A) {
        int count1 = 0;
        int ans = 0;
        for(int i = A.length-1; i >= 0; i--) {
            if(A[i] == 1)
                count1++;
            else {
                ans += count1;
                if(ans > 1000000000)
                    return -1;
            }
        }
        return ans;
    }
}