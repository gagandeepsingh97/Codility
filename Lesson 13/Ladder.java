import java.lang.Math; 
import java.math.BigInteger;
class Solution {
    public int[] solution(int[] A, int[] B) {
        int max = 0;
        for(int i = 0; i < A.length; i++) {
            max = Math.max(max, A[i]);
        }
        int arr[] = new int[max+1];
        arr[0] = 1;
        arr[1] = 1;
        int i = 2;
        while(i <= max) {
            arr[i] = (arr[i-1] + arr[i-2]) % (int)Math.pow(2,30);
            i++;
        }
        int output[] = new int[A.length];
        for(int j = 0; j < A.length; j++) {
            output[j] = (int)(arr[A[j]] % Math.pow(2, B[j]));
        }
        return output;
    }
}