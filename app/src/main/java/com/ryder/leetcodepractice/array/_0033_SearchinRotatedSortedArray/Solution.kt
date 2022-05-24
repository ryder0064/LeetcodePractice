package com.ryder.leetcodepractice.array._0033_SearchinRotatedSortedArray

class Solution {
    //4 5 6 7 1 2 3, 5
    fun search(nums: IntArray, target: Int): Int {
        var start = 0
        var end = nums.size - 1
        while (start <= end) {
            val mid = (start + end) / 2
            if (target == nums[mid]) {
                return mid
            }
            //左半段是有序的
            if (nums[start] <= nums[mid]) {
                //target 在这段里
                if (target >= nums[start] && target < nums[mid]) {
                    end = mid - 1
                } else {
                    start = mid + 1
                }
                //右半段是有序的
            } else {
                if (target > nums[mid] && target <= nums[end]) {
                    start = mid + 1
                } else {
                    end = mid - 1
                }
            }
        }
        return -1
    }
}