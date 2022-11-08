import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class medianOfTwoSortedArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,3};
        int[] arr2 = {2};

        //int[] arr1 = {1,2};
        //int[] arr2 = {3,4};

        List<Integer> array = new ArrayList<>();

        int loop = arr1.length + arr2.length;

        for (int i = 0; i < loop; i++) {
            if (i<arr1.length){
                array.add(arr1[i]);
            }
            else
                array.add(arr2[arr1.length-i]);
        }

        Collections.sort(array);
        System.out.println(array);
        if (array.size()%2!=0){
            System.out.println(array.get((array.size()-1)/2));
        }
        else{
            System.out.println((Double.valueOf(array.get((array.size() - 1) / 2)) + Double.valueOf(array.get(((array.size() - 1) / 2) + 1))) /2);
        }

    }
}
