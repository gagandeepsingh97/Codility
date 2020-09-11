class Solution {
    public int[] solution(int[] A) {
        int n = A.length;
        int arr[] = new int[2*n + 1];
        for(int i = 0; i < n; i++) 
            arr[A[i]]++;
        int ans[] = new int[n];
        int count = 0;
        for(int i = 0; i < n; i++) {
            count = 0;
            for(int j = 1; j*j <= A[i]; j++) {
                if(A[i] % j == 0)
                    count = count + arr[j];
                if(A[i] % (A[i]/j) == 0 && j != A[i]/j)
                    count = count + arr[A[i]/j];
            }
            ans[i] = n - count;
        }
        return ans;
    }
}