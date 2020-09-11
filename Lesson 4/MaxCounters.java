class Solution {
    public int[] solution(int N, int[] A) {
        int maxElement = 0;
        int stepMax = 0;
        int output[] = new int[N];
        for (int i = 0; i < A.length; i++) {
            if(A[i] == N + 1) {
                stepMax = maxElement;
            }
            else {
                if(output[A[i] - 1] < stepMax)
                    output[A[i]-1] = stepMax + 1;
                else 
            	    output[A[i]-1] = output[A[i]-1] + 1;
            	maxElement = Math.max(maxElement, output[A[i]-1]);
            }
        }
        for (int i = 0; i < N; i++) {
            if (output[i] < stepMax)
                output[i] = stepMax;
        }
        return output;
    }
}