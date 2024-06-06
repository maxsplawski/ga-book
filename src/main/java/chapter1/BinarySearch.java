package chapter1;

import java.util.Optional;

public class BinarySearch {
    public static void main(String[] args) {
        System.out.println(binarySearch(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 54).orElse(-1));
    }

    public static Optional<Integer> binarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = nums[mid];

            if (guess == target) return Optional.of(mid);

            if (guess > target) {
                 high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return Optional.empty();
    }
}
