class Solution {
    public int[] solution(String S, int[] P, int[] Q) {
        int input[] = new int[S.length()];
        for(int i = 0; i < S.length(); i++) {
        	if(S.charAt(i) == 'A')
        		input[i] = 1;
        	else if(S.charAt(i) == 'C')
        		input[i] = 2;
        	else if(S.charAt(i) == 'G')
        		input[i] = 3;
        	else if(S.charAt(i) == 'T')
        		input[i] = 4;
        }
        int numsqrt = (int)Math.sqrt(S.length());
        int inputsqrt[] = new int[numsqrt];
        int index = -1;
        for (int i = 0; i < numsqrt*numsqrt; i++) {
        	if(i % numsqrt == 0) {
        		index++;
        		inputsqrt[index] = Integer.MAX_VALUE;
        	}
        	inputsqrt[index] = Math.min(inputsqrt[index], input[i]); 
        }
        int output[] = new int[P.length];
        for (int i = 0; i < P.length; i++) {
        	output[i] = getAns(input, inputsqrt, P[i], Q[i]);
        }
        return output;
    }
    public static int getAns(int [] input, int [] inputsqrt, int P, int Q) {
		int ans = Integer.MAX_VALUE;
		while(P < Q && P % inputsqrt.length != 0) {
			ans = Math.min(ans, input[P]);
			P++;
		}
		while(P + inputsqrt.length < Q && (P / inputsqrt.length) < inputsqrt.length) {
			ans = Math.min(ans, inputsqrt[P / inputsqrt.length]);
			P += inputsqrt.length;
		}
		while(P <= Q) {
			ans = Math.min(ans, input[P]);
			P++;
		}
		return ans;
	}
}