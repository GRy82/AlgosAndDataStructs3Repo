public class Search {
    public int linearSearch(int[] nums, int number){
        for(int index = 0; index < nums.length; index++)
            if(nums[index] == number) return index;
        
        return -1;
    }

    public int binarySearchRecursive(int[] nums, int target){
        var lastIndex = nums.length - 1;
        if(target > nums[lastIndex] || target < nums[0]) return -1;
        return binarySearchRecursive(nums, target, 0, lastIndex);
    }

    private int binarySearchRecursive(int[] nums, int target, int start, int end){
        int divider = (start + end) / 2;
        if(start == end && nums[divider] != target) return -1;
        if(target == nums[divider]) return divider;
        return target < nums[divider] ? binarySearchRecursive(nums, target, start, divider) :
            binarySearchRecursive(nums, target, divider + 1, end);
    }

    public int binarySearchIterative(int[] nums, int start, int end){

    }
}
