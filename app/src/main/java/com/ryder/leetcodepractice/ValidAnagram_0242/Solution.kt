package com.ryder.leetcodepractice.ValidAnagram_0242

class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }
        val chars = IntArray(26)
        for (i in s.indices) {
            chars[s[i] - 'a']++
            chars[t[i] - 'a']--
        }
        for (c in chars) {
            if (c != 0) {
                return false
            }
        }
        return true
    }
}