class Solution {
    public int[] solution(int N, int[] P, int[] Q) {
        int arr[] = new int[N+1];
        for(int i = 2; i*i <= N; i++) {
            if(arr[i] == 0) {
                for(int j = 2*i; j <= N; j+=i) {
                    if(arr[j] == 0)
                        arr[j] = i;
                }
            }
        }
        int n = P.length;
        int semiPrime[] = new int[N+1];
        int output[] = new int[n];
        int count = 0;
        for(int j = 1; j <= N; j++) {
            if(arr[j] != 0 && arr[j/arr[j]] == 0) {
                count++;
                semiPrime[j] = count;
            }
            else {
                semiPrime[j] = count;
            }
        }
        for(int i = 0; i < n; i++) {
            output[i] = semiPrime[Q[i]] - semiPrime[P[i]-1];
        }
        return output;
    }
}