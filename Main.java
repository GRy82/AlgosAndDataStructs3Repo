import java.util.Arrays;

public class Main {

    public static void main(String[] args){
        int[] numsArray = { 8, 8, 7, 2, 2 };
        //var sorter = new BubbleSort();
        var sorter = new SelectionSort();
        sorter.sort(numsArray);
        System.out.println(Arrays.toString(numsArray));
    }  

}
