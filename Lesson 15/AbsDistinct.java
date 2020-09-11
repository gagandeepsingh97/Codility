import java.util.*; 
class Solution {
    public int solution(int[] A) {
        HashSet<Integer> h = new HashSet<Integer>();
        for(int i : A) {
            h.add(Math.abs(i));
        }
        return h.size();
    }
}