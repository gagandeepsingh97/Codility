class Solution {
    public int solution(int[] A) {
        int n = A.length;
	double avg1 = Double.MAX_VALUE;
        double avg2 = Double.MAX_VALUE;
        double minValue = Double.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < n - 2; i++) {
            avg1 = (double)(A[i] + A[i+1]) / 2;
            if(avg1 < minValue) {
                minValue = avg1;
                ans = i;
            }
            avg2 = (double)(A[i] + A[i+1] + A[i+2]) / 3;
            if(avg2 < minValue) {
                minValue = avg2;
                ans = i;
            }
        }
        if((double)(A[n-2] + A[n-1]) / 2 < minValue)
            ans = n-2;
        return ans;
    }
}