public class InsertionSort {
    public void sort(int[] numsArray){
        int length = numsArray.length;
        int firstUnsortedIndex = 1;
        for(int i = 0; i < length - 1; i++){
            if(numsArray[i] > numsArray[firstUnsortedIndex++])
                shift(numsArray, firstUnsortedIndex-1);
        }

    }

    private void shift(int[] numsArray, int lastSortedIndex){
        for(int i = lastSortedIndex; i > 0; i--){
            if(numsArray[i-1] < numsArray[i]) return;    
            
            int temp = numsArray[i - 1];
            numsArray[i - 1] = numsArray[i];
            numsArray[i] = temp; 
        }
    }
}
