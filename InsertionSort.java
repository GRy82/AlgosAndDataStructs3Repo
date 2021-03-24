public class InsertionSort {
    public void sort(int[] numsArray){
        int length = numsArray.length;
        for(int i = 1; i < length; i++){
            var current = numsArray[i];
            int j = i - 1;
            while(j >= 0 && numsArray[j] > current){
                numsArray[i] = numsArray[j];
                j--;
            }
            numsArray[j + 1] = current;
        }
    }
}
