public class MergeSort {
    public void sort(int[] numsArray){
        if(numsArray.length == 1) return;

        var divider = numsArray.length / 2;

        int[] left = new int[divider];
        for(var i = 0; i < divider; i++)
            left[i] = numsArray[i];

        int[] right = new int[numsArray.length - divider];
        for(var i = divider; i < numsArray.length; i++)
            right[i - divider] = numsArray[i];

        sort(left);
        sort(right);

        merge(left, right, numsArray);
    }

    private void merge(int[] left, int[] right, int[] result){
        int i = 0, j = 0, k = 0;

        while(i < left.length && j < right.length){
            result[k++] = left[i] < right[j] ? left[i++] : right[j++];
        }

        while(i < left.length)
            result[k++] = left[i++];

        while(j < right.length)
            result[k++] = right[j++];
    }
}
