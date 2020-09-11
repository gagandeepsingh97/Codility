class Solution {
    public int solution(int[] A) {
        int[] end = new int[A.length];
        int[] start = new int[A.length];
        for(int i = 1; i < A.length-1; i++) {
    		end[i] = Math.max(end[i-1] + A[i], 0); 
    	} 
    	for(int i = A.length-2; i > 0; i--){
          start[i] = Math.max(start[i+1]+A[i], 0);
        }
        int mDS = 0;
        for(int i = 1; i < A.length-1; i++) {
          mDS = Math.max(mDS, end[i-1] + start[i+1]);
        }
        return mDS;
    }
}