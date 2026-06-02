import java.util.ArrayList;
import java.util.Arrays;

public class alternate_array {

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        for (int i = 0; i < arr.size(); i += 2) {
            System.out.print(arr.get(i) + ",");
        }
    }

}

// Output: 1,3,5,