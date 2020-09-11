class Solution {
    public int solution(int[] A) {
        int m = Integer.MAX_VALUE-1;
        boolean output[] = new boolean[100000000];
        for (int i : A) {
            if(i <= 0) continue;
            output[i] = true;
        }
            int i = 0;
        for(i = 1; i < output.length; i++) 
            if(output[i] == false) break;
        return i;
    }
}