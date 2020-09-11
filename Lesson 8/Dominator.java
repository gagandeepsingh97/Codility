import java.util.HashMap; 
import java.util.*;
class Solution {
    public int solution(int[] A) {
        HashMap<Integer, Integer> map = new HashMap<>(); 
        for(int i : A) {
            if(map.containsKey(i)) {
                int temp = map.get(i);
                map.put(i, temp+1);
            }
            else {
                map.put(i,1);
            }
        }
        int ans = -1;
        for (Map.Entry mapElement : map.entrySet()) { 
            int value = ((int)mapElement.getValue());
            if(value > A.length / 2)
                ans = (Integer)mapElement.getKey();
        }
        for(int i = 0; i < A.length; i++) {
            if(A[i] == ans) {
                return i;
            }
        }
        return -1;
    }
}