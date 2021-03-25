import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BucketSort {
    public void sort(int[] numsArray, int bucketsQty){
        var counter = 0;
        for(var bucket : bucketCreation(numsArray, bucketsQty)){
            Collections.sort(bucket);
            for(var num : bucket)
                numsArray[counter++] = num;
        }
    }

    private List<List<Integer>> bucketCreation(int[] numsArray, int bucketsQty){
        List<List<Integer>> buckets = new ArrayList<>();
        for(var i = 0; i < bucketsQty; i++)
            buckets.add(new ArrayList<>());

        for(var num : numsArray)
            buckets.get(num / bucketsQty).add(num);

        return buckets;
    }
}
