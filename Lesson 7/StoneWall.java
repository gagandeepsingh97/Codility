import java.util.*;
class Solution {
    public int solution(int[] H) {
        int count = 0;
        Stack<Integer> st = new Stack<>();
        for(int i : H) {
            if(st.isEmpty())
                st.push(i);
            else if(!st.isEmpty())
            {
                if(i <= st.peek()) {
                    while(!st.isEmpty() && i <= (Integer)st.peek()) {
                        if(i == (Integer)st.peek()) {
                            count++;
                        }
                        if(!st.isEmpty())
                            st.pop();
                    }
                }
                st.push(i);
            }
        }
        return H.length - count;
    }
}