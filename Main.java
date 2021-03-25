import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] numsArray = { 5, 4, 3, 3, 5, 4, 2, 1, 0, 5, 4 };
        //var sorter = new BubbleSort();
        //var sorter = new SelectionSort();
        //var sorter = new InsertionSort();
        //var sorter = new MergeSort();
        //var sorter = new QuickSort();
        var sorter = new CountingSort();
        sorter.sort(numsArray, 5);
        System.out.println(Arrays.toString(numsArray));
    }  

}
