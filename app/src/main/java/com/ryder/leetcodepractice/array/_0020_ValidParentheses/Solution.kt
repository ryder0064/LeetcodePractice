package com.ryder.leetcodepractice.array._0020_ValidParentheses

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val chars = s.toCharArray()
        val q: Deque<Char> = ArrayDeque()
        for (ch in chars) {
            val isLeft = ch == '(' || ch == '[' || ch == '{'
            if (isLeft) q.push(ch) else if (q.isEmpty() || !match(q.pop(), ch)) return false
        }
        return q.isEmpty()
    }

    private fun match(l: Char, r: Char): Boolean {
        return l == '(' && r == ')' || l == '{' && r == '}' || l == '[' && r == ']'
    }
}

//class Solution {
//    fun isValid(s: String): Boolean {
//        val deque: Deque<Char> = LinkedList()
//        var ch: Char
//        for (element in s) {
//            ch = element
//            if (ch == '(') {
//                deque.push(')')
//            } else if (ch == '{') {
//                deque.push('}')
//            } else if (ch == '[') {
//                deque.push(']')
//            } else if (deque.isEmpty() || deque.peek() !== ch) {
//                return false
//            } else {
//                deque.pop()
//            }
//        }
//        return deque.isEmpty()
//    }
//}