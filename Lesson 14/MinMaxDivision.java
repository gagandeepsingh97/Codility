class Solution {
    public int solution(int K, int M, int[] A) {
        int min = 0;
        int max = 0;
        for(int i = 0; i < A.length; i++) {
            max = max + A[i];
            min = Math.max(min, A[i]);
        }
        int mid = 0;
        int blockSize = 0;
        while(min <= max) {
            mid = (min + max)/2;
            int blocks = check(mid, K, A);
            if(blocks <= K) {
                blockSize = mid;
                max = mid-1;
            }
            else
                min = mid+1;
        }
        return blockSize;
    }
    public static int check(int mid, int k, int []A) {
        int blocks1 = 1;
        int sum = 0;
        for(int i = 0; i < A.length; i++) {
            if(sum + A[i] <= mid) {
                sum = sum + A[i];
            }
            else {
                blocks1++;
                sum = A[i];
            }
        }
        return blocks1;
    }
}