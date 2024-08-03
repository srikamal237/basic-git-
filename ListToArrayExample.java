import java.util.ArrayList;
import java.util.List;

public class ListToArrayExample {
    public static void main(String[] args) {
        // Create a list of integers
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);

        // Convert list to array
        Integer[] arr = new Integer[nums.size()];
        arr = nums.toArray(arr);

        // Print the array
        for (Integer num : arr) {
            System.out.println(num);
        }
    }
}
