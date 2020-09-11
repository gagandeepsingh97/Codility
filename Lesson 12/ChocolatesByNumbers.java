class Solution {
   static int Gcd(int a, int b) {
		if(a%b==0)
			return b;
		else
			return Gcd(b, a%b); 
	}
	public int  solution(int N, int M) {
		int gcd = Gcd(N, M);
		return N/gcd;
	}
}