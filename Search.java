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
        return target < nums[divider] ? binarySearchRecursive(nums, target, start, divider - 1) :
            binarySearchRecursive(nums, target, divider, end);
    }

    public int binarySearchIterative(int[] nums, int target){
        int lastIndex = nums.length - 1;
        int firstIndex = 0;
        if(target > nums[lastIndex] || target < nums[0]) return -1;
        while(firstIndex <= lastIndex){
            var divider = (firstIndex + lastIndex) / 2;
            if(nums[divider] == target) 
                return divider;
            else if(nums[divider] < target)
                firstIndex = divider + 1;
            else
                lastIndex = divider - 1;
        }

        return -1;
    }

    public int ternarySearch(int[] nums, int target){
        var lastIndex = nums.length - 1;
        if(target < nums[0] || target > nums[lastIndex]) return -1;
        return ternarySearch(nums, target, 0, lastIndex);
    }

    private int ternarySearch(int[] nums, int target, int start, int end){
        if(start > end) return -1;

        int partitionSize = (end - start) / 3;
        int partitionOne = start + partitionSize;
        int partitionTwo = end - partitionSize;

        if(nums[partitionOne] == target) return partitionOne;
        if(nums[partitionTwo] == target) return partitionTwo;

        
        if(target < nums[partitionOne]) 
            return ternarySearch(nums, target, start, partitionOne - 1);
        else if(target > nums[partitionTwo]) 
            return ternarySearch(nums, target, partitionTwo + 1, end);
        else
            return ternarySearch(nums, target, partitionOne + 1, partitionTwo - 1);
    
    }
}
