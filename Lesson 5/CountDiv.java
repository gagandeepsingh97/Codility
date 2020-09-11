class Solution {
    public int solution(int A, int B, int K) {
	return (int)Math.floor((double)B / (double)K)-(int)Math.ceil((double)A / (double)K) + 1;
    }
}