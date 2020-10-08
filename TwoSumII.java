package pratice;

public class TwoSumII {

    public int[] twoSum(int[] numbers, int target) {
        if(numbers != null && numbers.length > 0){
            int left = 0;
            int right = numbers.length-1;
            while(left < right){
                int sum = numbers[left] + numbers[right];
                if(sum == target)
                    return new int[]{left+1, right+1};
                if(sum < target)
                    left++;
                else
                    right--;
            }
        }
        return new int[]{-1,-1};
    }
}