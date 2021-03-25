public class QuickSort {
    public void sort(int[] numsArray){
        sort(numsArray, 0, numsArray.length - 1);
    }

    private void sort(int[] numsArray, int start, int end){
        if(start >= end) return;

        var boundary = partition(numsArray, start, end);

        sort(numsArray, start, boundary - 1);
        sort(numsArray, boundary + 1, end);
    }

    public void swap(int firstIndex, int secondIndex, int[] numsArray){
        int temp  = numsArray[firstIndex];
        numsArray[firstIndex] = numsArray[secondIndex];
        numsArray[secondIndex] = temp;
    }

    private int partition(int[] numsArray, int start, int end){
        var pivot = numsArray[end];
        var boundary = start - 1;
        for(var i = start ; i <= end; i++)
            if(numsArray[i] <= pivot)
                swap(i, ++boundary, numsArray);
        return boundary;
    }
}
