import java.util.*; 
class Solution {
    public int solution(int[] A) {
        HashSet h = new HashSet ();
        for (int i : A)
            h.add(i);
        return h.size();
    }
}