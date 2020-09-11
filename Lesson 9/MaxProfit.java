class Solution {
    public int solution(int[] A) {
        int maxDiff = 0;
        int currDiff = 0;
        for(int i = 0; i < A.length-1; i++) {
            int diff = A[i+1] - A[i];
                currDiff += diff;
            if(currDiff < 0)
                currDiff = 0;
            maxDiff = Math.max(maxDiff, currDiff);
        }
        return maxDiff;
    }
}