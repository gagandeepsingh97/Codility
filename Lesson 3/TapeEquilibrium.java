class Solution {
    public int solution(int[] A) {
        int end = 0;
	for (int i = 0; i < A.length; i++)
		end += A[i];
	int min = Integer.MAX_VALUE;
	int start = 0;
	for (int i = 0; i < A.length-1; i++) {
		start += A[i];
		end -= A[i];
		min = Math.min(Math.abs(end - start), min);
	}
	return min;
    }
}