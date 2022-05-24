package com.ryder.leetcodepractice.array._0034_FindFirstandLastPositionofElementinSortedArray

// nums = [5,7,7,8,8,10], target = 8
// nums = [5,7,7,8,8,10], target = 7
class Solution {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        val leftBorder = getLeftBorder(nums, target)
        val rightBorder = getRightBorder(nums, target)
        if (leftBorder == -2 || rightBorder == -2) return intArrayOf(-1, -1)
        return intArrayOf(leftBorder, rightBorder)
    }

    fun getLeftBorder(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var leftBorder = -2
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (target == nums[middle]) {
                leftBorder = middle
                right = middle - 1
            } else if (target < nums[middle]) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return leftBorder
    }

    fun getRightBorder(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var rightBorder = -2
        while (left <= right) {
            val middle = left + (right - left) / 2
            if (target == nums[middle]) {
                rightBorder = middle
                left = middle + 1
            } else if (target < nums[middle]) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return rightBorder
    }
}

//class Solution {
//    fun searchRange(nums: IntArray, target: Int): IntArray {
//        val index = binarySearch(nums, target) // 二分查找
//        if (index == -1) { // nums 中不存在 target，直接返回 {-1, -1}
//            return intArrayOf(-1, -1) // 匿名数组
//        }
//        // nums 中存在 targe，则左右滑动指针，来找到符合题意的区间
//        var left = index
//        var right = index
//        // 向左滑动，找左边界
//        while (left - 1 >= 0 && nums[left - 1] == nums[index]) { // 防止数组越界。逻辑短路，两个条件顺序不能换
//            left--
//        }
//        // 向左滑动，找右边界
//        while (right + 1 < nums.size && nums[right + 1] == nums[index]) { // 防止数组越界。
//            right++
//        }
//        return intArrayOf(left, right)
//    }
//
//    /**
//     * 二分查找
//     * @param nums
//     * @param target
//     */
//    fun binarySearch(nums: IntArray, target: Int): Int {
//        var left = 0
//        var right = nums.size - 1 // 不变量：左闭右闭区间
//        while (left <= right) { // 不变量：左闭右闭区间
//            val mid = left + (right - left) / 2
//            if (nums[mid] == target) {
//                return mid
//            } else if (nums[mid] < target) {
//                left = mid + 1
//            } else {
//                right = mid - 1 // 不变量：左闭右闭区间
//            }
//        }
//        return -1 // 不存在
//    }
//}