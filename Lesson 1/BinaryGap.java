class Solution {
    public int solution(int N) {
	int max = 0;
	boolean start = false;
	int curr = 0;
	while(N > 0) {
		int temp = N % 2;
		N = N / 2;
		if(start == true && temp == 0) {
			curr++;
		}
		else if(start == true && temp == 1) {
			if(curr > max)
				max = curr;
			curr = 0;
		}
		else if(start == false && temp == 1) {
			start = true;
			curr = 0;
		}
	}
	return max;
    }
}