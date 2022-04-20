package com.ryder.leetcodepractice.MergeIntervals_0056

import java.util.*

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        Arrays.sort(intervals) { a, b -> a[0].compareTo(b[0]) }
        var start = -1
        var end = -1
        val res: MutableList<IntArray> = ArrayList()
        for (item in intervals) {
            if (end < item[0]) {
                if (start != -1) {
                    res.add(intArrayOf(start, end))
                }
                start = item[0]
                end = item[1]
            } else {
                end = Math.max(end, item[1])
            }
        }
        if (start != -1) {
            res.add(intArrayOf(start, end))
        }
        return res.toTypedArray()
    }
}