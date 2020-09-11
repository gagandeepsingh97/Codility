import java.util.*;
class Solution {
    public int solution(int[] A) {
        long[] start = new long[A.length];
        long[] ending = new long[A.length];
        for(int i=0; i<A.length; i++){
            start[i] = (long) i-A[i];
            ending[i] = (long) i+A[i];
        }
        Arrays.sort(start);
        Arrays.sort(ending);
        
        int noOfIntersection = 0;
        int noOfCircleOpen = 0;
        int startingPoint = 0;
        int endingPoint = 0;
        while(startingPoint<A.length){
            if(start[startingPoint]<=ending[endingPoint]){
                noOfCircleOpen++;
                noOfIntersection += noOfCircleOpen-1;
                if(noOfIntersection>10000000)
                    return -1;
                startingPoint++;
            }
            else{
                noOfCircleOpen--;
                endingPoint++;
            }
        }
        return noOfIntersection;
    }
}