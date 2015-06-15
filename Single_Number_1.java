public class Solution {
    public int singleNumber(int[] A) {
    	int t = A[0];
    	for(int i = 0; i < A.length-1; i++){
    		t = t^A[i+1];
    	}
    	return t;
    }
}