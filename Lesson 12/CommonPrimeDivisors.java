class Solution {
   static int Gcd(int a, int b) {
		if(a%b==0)
			return b;
		else
			return Gcd(b, a%b); 
	}
	
	public int solution(int[] A, int[] B)
	{
		int count  =0;
		for(int i =0; i< A.length; i++)
			if(checkPrime(A[i], B[i])  && checkPrime(B[i], A[i]))
				count++;
		return count;
	}
	static boolean checkPrime(int a, int b) {
		while(true) {
			int div = Gcd(a,b);
			if(div ==1) {
				return a==div;
			}
			a/= div;
		}
	}
}