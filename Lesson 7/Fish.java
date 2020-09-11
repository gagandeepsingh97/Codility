import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        Stack<Integer> index = new Stack();
		boolean flag= false;
		int attack=-1;
		for(int i= 0; i<A.length; i++) {
			if(B[i]==1) {
				index.push(i);
			}
			else {
				if(index.isEmpty()) {
					index.push(i);
				}
				else {
					while(!index.isEmpty() && B[i]-B[index.peek()]==-1 && A[i]>A[index.peek()]) {
						index.pop();
					}
					if(!index.isEmpty()) {
						if(B[i]-B[index.peek()]!=-1) {
							index.push(i);
						}
					}
					else {
						index.push(i);
					}
				}
			}
		}
		return index.size();
    }
}