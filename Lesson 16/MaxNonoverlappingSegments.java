class Solution {
    public int solution(int[] A, int[] B) {
        if(A.length == 0)
            return 0;
        int ans = 1;
        int lastB = 0;
        for(int i = 1; i < A.length; i++) {
            if(A[i] > B[lastB]) {
                ans++;
                lastB = i;
            }
        }
        return ans;
    }
}