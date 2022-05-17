package com.ryder.leetcodepractice.array._0049_GroupAnagrams

class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        if (strs.isEmpty()) return ArrayList()
        val map: MutableMap<String, MutableList<String>> = HashMap()
        for (s in strs) {
            val ca = CharArray(26)
            for (c in s.toCharArray()) ca[c - 'a']++
            val keyStr = String(ca)
            if (!map.containsKey(keyStr)) map[keyStr] = ArrayList()
            map[keyStr]!!.add(s)
        }
        return ArrayList(map.values)
    }
}