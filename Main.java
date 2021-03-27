import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        String input = "Okey Doke Then";
        System.out.println(StringManipulation.mostRepeatedCharacter("racecar"));

        int[] numsArray = { 7 };
        Search search = new Search();
        System.out.println(search.exponentialSearch(numsArray, 8));
        //var sorter = new BubbleSort();
        //var sorter = new SelectionSort();
        //var sorter = new InsertionSort();
        //var sorter = new MergeSort();
        //var sorter = new QuickSort();
        //var sorter = new CountingSort();
        var sorter = new BucketSort();
        sorter.sort(numsArray, 3);
        System.out.println(Arrays.toString(numsArray));
    }  

}
