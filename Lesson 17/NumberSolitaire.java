class Solution {
    public int solution(int[] A) {
        int n = A.length;
        int output[] = new int[n];
        output[0] = A[0];
        for(int i = 1; i < n; i++) {
            int max = Integer.MIN_VALUE;
            for(int j = i-1; j>=0 && j >= i- 6 ; j--)
                max = Math.max(max, output[j]);
            output[i] = A[i] + max;
        }
        return output[n-1];
    }
}