class Solution {
     fun solution(n: Int): Int {
        val answer = IntArray(n + 1) { 0 }
        answer[1] = 1
        for (i in 2..n) answer[i] = (answer[i - 1] + answer[i - 2]) % 1234567
        return answer[n]
    }
}