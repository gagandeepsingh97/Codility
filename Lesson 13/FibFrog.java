import java.util.*;
class Solution {
    class Jump {
		int position;
		int counter;
		
		Jump(int position, int counter) {
			this.position = position;
			this.counter = counter;
		}
	}
	
	public int solution(int[] A) {
		List<Integer> fibs = new ArrayList<>();
		fibs.add(1);
		fibs.add(2);
		for (int i = 2; i < A.length + 2; i++) {
			int no = fibs.get(i - 1) + fibs.get(i - 2);
			if (no < A.length + 2)
				fibs.add(no);
			else
				break;
		}
		Collections.reverse(fibs);
		boolean[] visited = new  boolean[A.length];
		List<Jump> jumps = new ArrayList<>();
		jumps.add(new Jump(-1, 0));
		int step = 0;
		while(true) {
			if(step == jumps.size())
				return -1;
			Jump jump = jumps.get(step);
			step++;
			for(int fib : fibs) {
				if(jump.position + fib == A.length)
					return jump.counter + 1;
				else if(jump.position + fib > A.length || A[jump.position + fib] == 0 || visited[jump.position + fib])
					continue;
				jumps.add(new Jump(jump.position + fib, jump.counter + 1));
				visited[jump.position + fib] = true;
			}
		}
    }
}