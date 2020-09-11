class Solution {
   public int solution(int[] A) {
	boolean output[] = new boolean[A.length+1];
	for(int i : A) {
		if(i > A.length || output[i] == true) return 0;
		output[i] = true;
	}
	return 1;
    }
}