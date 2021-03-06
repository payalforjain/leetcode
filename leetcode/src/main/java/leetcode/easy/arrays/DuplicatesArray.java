package leetcode.easy.arrays;

import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Set;

public class DuplicatesArray {

  /*  Given an array of integers, 1 ≤ a[i] ≤ n (n = size of array), some elements appear twice and others appear once.

    Find all the elements that appear twice in this array.

    Could you do it without extra space and in O(n) runtime

    Input:
[4,3,2,7,8,2,3,1]

Output:
[2,3]*/


    public List<Integer> findDuplicates(int[] nums) {

        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; ++i) {
            int index = Math.abs(nums[i])-1;
            if (nums[index] < 0)
                res.add(Math.abs(index+1));
            nums[index] = -nums[index];
        }
        return res;

    }




}
