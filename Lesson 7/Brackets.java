import java.util.*;
class Solution {
    public int solution(String S) {
        Stack<Character> st = new Stack<>();
        for (char c: S.toCharArray()) {
            if(c == '(' || c == '[' || c == '{') {
                st.push(c);
            }
            else {
                if(st.isEmpty())
                    return 0;
                char temp = (char)st.pop();
                if(temp == '{' && c == '}' || temp == '[' && c == ']' || temp    == '(' && c == ')')
                    continue;
                else
                    return 0;
            }
        }
        if(st.isEmpty())
            return 1;
        return 0;
    }
}