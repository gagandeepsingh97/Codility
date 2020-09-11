class Solution {
    public int solution(int[] A) {
        int x = 0;
	for(int i = 0; i < A.length; i++) {
		x ^= A[i];
	}
	return x;
    }
}