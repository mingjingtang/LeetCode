public class Solution {
    public int[] twoSum(int[] numbers, int target) {
    	int sum = 0;
    	int size = numbers.length;
    	int a, b;
    	int[] array = new int[2];
    	for(int i = 0; i < size; i++){
    		a = numbers[i];
    		for(int j=i+1; j < size; j++){
    			b = numbers[j];
    			sum = a + b;
                if (sum == target){
                    array[0]=i+1;
                    array[1]=j+1;
                    return array;
                }
            }
        }
    return null;
    }
}