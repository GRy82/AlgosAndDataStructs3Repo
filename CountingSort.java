public class CountingSort {
    public void sort(int[] numsArray, int k){
        int[] tallyArray = new int[k + 1];
        for(var num : numsArray)
            tallyArray[num]++;

        for(int i = 0, j = 0; i < numsArray.length; i++){
            while(tallyArray[j] > 0){
                numsArray[i++] = j;
                tallyArray[j]--;
            } 
            if(tallyArray[j] == 0) i--;
            j++;
        }
    }
}
