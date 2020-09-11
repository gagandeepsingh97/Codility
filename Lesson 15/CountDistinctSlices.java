import java.util.*;
class Solution {
    public int solution(int M, int[] A) {
        HashSet<Integer> map = new HashSet<Integer>();
        int ans = 0;
        int start = 0;
        int end = 0;
        while(end < A.length) {
            if(!map.contains(A[end])) {
                map.add(A[end]);
                end++;
                ans += end-start;
                if(ans > 1000000000)
                    return 1000000000;
            }
            else {
                map.remove(A[start]);
                start++;
            }
        }
        return ans;
    }
}