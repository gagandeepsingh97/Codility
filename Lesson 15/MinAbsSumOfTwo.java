import java.util.*;
class Solution {
    public int solution(int[] A) {
         int start = 0;
         int end = A.length - 1;
         Arrays.sort(A);
         int min = Integer.MAX_VALUE;
         while(start <= end) {
             min = Math.min(min, (Math.abs(A[start] + A[end])));
             //System.out.println(min);
             if(Math.abs(A[start]) < Math.abs(A[end]))
                end--;
             else
                start++;
         }
         return min;
    }
}