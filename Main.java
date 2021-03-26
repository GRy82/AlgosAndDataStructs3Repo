import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] numsArray = { 7, 9 };
        Search search = new Search();
        System.out.println(search.binarySearchIterative(numsArray, 8));
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
