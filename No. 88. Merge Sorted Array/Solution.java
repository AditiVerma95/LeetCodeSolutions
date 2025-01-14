import java.util.Arrays;

public class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {

    if (n == 0) {
        return;
    }

    int i = m + n - 1;
    int ptr1 = m - 1;
    int ptr2 = n - 1;

    while(ptr2 >= 0 && ptr1 >= 0 && m > 0 && n > 0) {
        if (nums1[ptr1] > nums2[ptr2]) {
            nums1[i] = nums1[ptr1];
            ptr1--;
        }
        else {
            nums1[i] = nums2[ptr2];
            ptr2--;
        }
        i--;
    }

    // placing all the remaining elements of the nums2 in nums1
    while(ptr2 >= 0) {
        nums1[i] = nums2[ptr2];
        ptr2--;
        i--;
    }
    System.out.println(Arrays.toString(nums1));
}
}
