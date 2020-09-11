class Solution {
    public int solution(int[] A) {
        long m = A.length + 1;
		long sum = m*(m+1)/2;
		long arrSum = 0;
		for(int i  = 0; i < A.length; i++) 
			arrSum += A[i];
		return (int)(sum - arrSum);
    }
}