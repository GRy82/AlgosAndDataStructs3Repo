public class BubbleSort{

    public void sort(int[] numsArray){
        boolean sorted;

        for(int i = 0; i < numsArray.length; i++){
            sorted = true;
            for(int j = 1; j < numsArray.length - i; j++){
                if(numsArray[j] < numsArray[j - 1]){
                    swap(numsArray, j);
                    sorted = false;
                }
            }
            if(sorted) break;
        }
    }

    private void swap(int[] numsArray, int rightIndex){
        int temp = numsArray[rightIndex];
        numsArray[rightIndex] = numsArray[rightIndex - 1];
        numsArray[rightIndex - 1] = temp;
    }
}