import java.util.*;
class Solution {
    public int solution(int[] A) {
        int len = A.length;
        HashSet<Integer> arr = new HashSet<Integer>(); 
        int count = 0;
        for(int i = 1; i < A.length-1; i++) {
            if(A[i] > A[i-1] && A[i] > A[i+1]) {
                arr.add(i);
                count++;
            }
        }
        int numberOfBlocks = count;
        while(true) {
            while(true) {
                if(numberOfBlocks == 0)
                    return 0;
                if(len % numberOfBlocks == 0)
                    break;
                else
                    numberOfBlocks--;
                }
            int flag = 0;
            int blockSize = len / numberOfBlocks;
            for(int i = 0; i < numberOfBlocks; i++) {
                boolean check = false;
                for(int j = i*blockSize; j < (i+1)*blockSize; j++) {
                    if(arr.contains(j) == true) {
                        flag++;
                        check = true;
                        break;
                    }
                }
                if(check == false)
                    break;
            }
            if(flag == numberOfBlocks) {
                return numberOfBlocks;
            }
            else
                numberOfBlocks--;
        }
    }
}