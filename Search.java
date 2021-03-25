public class Search {
    public int linearSearch(int[] nums, int number){
        for(int index = 0; index < nums.length; index++)
            if(nums[index] == number) return index;
        
        return -1;
    }
}
