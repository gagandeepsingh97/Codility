class Solution {
    public int solution(int X, int Y, int D) {
        int dist = Y - X;
		double jumps = (double)dist / (double)D;
		double a = Math.ceil(jumps);
		return (int)a;
    }
}