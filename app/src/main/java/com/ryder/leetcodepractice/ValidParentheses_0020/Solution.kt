package com.ryder.leetcodepractice.ValidParentheses_0020

import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        val chars = s.toCharArray()
        val q: Deque<Char> = ArrayDeque()
        for (ch in chars) {
            val left = ch == '(' || ch == '[' || ch == '{'
            if (left) q.push(ch) else if (q.isEmpty() || !match(q.pop(), ch)) return false
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