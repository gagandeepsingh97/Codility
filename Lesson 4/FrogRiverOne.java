class Solution {
    public int solution(int X, int[] A) {
        int ans = -1;
	boolean arr[] = new boolean[X+1];
	int i = 0;
	int k = 1;
	boolean flag = false;
	while(i < A.length) {
		arr[A[i]] = true;
		while(arr[k] == true) {
			k++;
			if(k > X) {
				ans = i;
				flag = true;
				break;					
			}
		}
		if(flag == true)
			return ans;
		i++;
	}
	return ans;
    }
}