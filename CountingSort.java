public class CountingSort {
    public void sort(int[] numsArray, int max){
        int[] tallyArray = new int[max + 1];
        for(var num : numsArray)
            tallyArray[num]++;

        var k = 0;
        for(int i = 0; i < tallyArray.length; i++)
            for(var j = 0; j < tallyArray[i]; j++)
                numsArray[k++] = i;
    }
}
