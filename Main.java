import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] numsArray = { 5, 4, 3 };
        //var sorter = new BubbleSort();
        //var sorter = new SelectionSort();
        //var sorter = new InsertionSort();
        //var sorter = new MergeSort();
        var sorter = new QuickSort();
        sorter.sort(numsArray);
        System.out.println(Arrays.toString(numsArray));
    }  

}
