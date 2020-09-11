import java.util.Arrays; 
class Solution {
    public int solution(int[] A) {
        Arrays.sort(A);
        return Math.max(A[0]*A[1]*A[A.length-1], A[A.length-1]*A[A.length-2]*A[A.length-3]);
    }
}