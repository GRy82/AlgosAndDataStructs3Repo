public class SelectionSort{

    public void sort(int[] numsArray){
        int length = numsArray.length;
        for(int i = 0; i < length; i++){
            int smallest = Integer.MAX_VALUE;
            int smallestIndex = Integer.MAX_VALUE;
            for(int j = i;  j < length; j++){
                if(numsArray[j] < smallest){
                    smallest = numsArray[j];
                    smallestIndex = j;
                }
            }
            if(smallestIndex == Integer.MAX_VALUE) return;
            swap(numsArray, i, smallestIndex);
        }
    }

    private void swap(int[] numsArray, int nextSmallest, int otherIndex){
        int temp = numsArray[nextSmallest];
        numsArray[nextSmallest] = numsArray[otherIndex];
        numsArray[otherIndex] = temp;
    }
}
