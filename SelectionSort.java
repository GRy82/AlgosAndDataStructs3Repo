public class SelectionSort{

    public void sort(int[] numsArray){
        int length = numsArray.length;
        for(int i = 0; i < length; i++){
            int smallestIndex = 0;
            for(int j = i;  j < length; j++){
                if(numsArray[j] < numsArray[smallestIndex])
                    smallestIndex = j;
            }
            swap(numsArray, i, smallestIndex);
        }
    }

    private void swap(int[] numsArray, int nextSmallest, int otherIndex){
        int temp = numsArray[nextSmallest];
        numsArray[nextSmallest] = numsArray[otherIndex];
        numsArray[otherIndex] = temp;
    }
}
