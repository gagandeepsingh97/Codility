class Solution {
    public int solution(int[] A) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i < A.length; i++) {
            sum += A[i];
            maxSum = Math.max(maxSum, sum);
            if(sum < 0)
                sum = 0;
        }
        return maxSum;
    }
}