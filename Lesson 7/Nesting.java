import java.util.*;

class Solution {
    public int solution(String S) {
        Stack<Character> st = new Stack<>();
        for (char c: S.toCharArray()) {
            if(c == '(') {
                st.push(c);
            }
            else {
                if(st.isEmpty())	return 0;
                st.pop();
            }
        }
        if(st.isEmpty())	return 1;
        return 0;

    }
}