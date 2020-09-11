class Solution {
    public int[] solution(int[] A, int K) {
        int output[] = new int[A.length];
		if(A.length == 0)
			return output;
		if(K % A.length == 0)
			return A;
		for(int i = 0; i < A.length; i++)
			output[(i+K)%A.length] = A[i];
		return output;
    }
}