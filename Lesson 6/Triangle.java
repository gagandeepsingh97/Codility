import java.util.Arrays;
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        for (int i = 0; i < A.length-2; i++) {
            if((long)A[i]+(long)A[i+1] > (long)A[i+2])
                return 1;
        }
        return 0;
    }
}