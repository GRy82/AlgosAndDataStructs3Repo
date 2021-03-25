import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] numsArray = { 0, 1, 1, 3, 4 };
        Search search = new Search();
        System.out.println(search.binarySearchRecursive(numsArray, 2));
        //var sorter = new BubbleSort();
        //var sorter = new SelectionSort();
        //var sorter = new InsertionSort();
        //var sorter = new MergeSort();
        //var sorter = new QuickSort();
        //var sorter = new CountingSort();
        var sorter = new BucketSort();
        sorter.sort(numsArray, 5);
        System.out.println(Arrays.toString(numsArray));
    }  

}
