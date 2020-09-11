class Solution {
    public int solution(int[] A) {
        if(A.length < 3)
			return 0;
		boolean[] indexPeak = new boolean[A.length];
		for(int i = 1; i < A.length-1; i++) {
			if(A[i] > A[i+1] && A[i] > A[i-1]) {
				indexPeak[i] = true;
			} 
		}
		int[] next = new int[A.length];
		int currentPeak = A.length;
		next[A.length-1] = currentPeak;
		for(int i = A.length-2; i > 0 ; i--) {
			if(indexPeak[i]) {
				currentPeak = i;
			}
			next[i] = currentPeak;
		}
		next[0] = next[1];
		int noOfFlagsPossible = (int) (Math.sqrt(A.length) + 1);
		int noOfFlagsPlaced = 0;
		for(int noOfFlags = 1; noOfFlagsPlaced <= noOfFlagsPossible; noOfFlags ++) {
			if(canWePlaceFlags(next, noOfFlags))
				noOfFlagsPlaced ++;
			else
				break;
		}
		return noOfFlagsPlaced;
	}
	
	private boolean canWePlaceFlags(int[] peaks, int flagsToPlace) {
		int currentPosition = 1 - flagsToPlace;
		int distanceBetweenThePeaks = flagsToPlace;
		for(int i=0; i<flagsToPlace; i++) {
			if(currentPosition + distanceBetweenThePeaks > peaks.length - 1)
				return false;
			currentPosition = peaks[currentPosition + distanceBetweenThePeaks];
		}
		return currentPosition < peaks.length;
	}
}