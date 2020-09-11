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
        int value = 0;
        for (Map.Entry mapElement : map.entrySet()) { 
            value = ((int)mapElement.getValue());
            if(value > A.length / 2) {
                ans = (Integer)mapElement.getKey();
                break;
            }
        }
        //System.out.println(ans);
        if(ans == -1)
            return 0;
        int count = 0;
        int a = 0;
        for(int i = 0; i < A.length; i++) {
            if(A[i] == ans) 
                count++;
            if(2 * count > i+1 && 2*(value-count) > A.length - i - 1)
                a++;
        }
        return a;
    }
}