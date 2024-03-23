class Solution {
    fun solution(s: String): String {
        val list = s.split(" ").map { it.toInt() }
        val answer = "${list.minOrNull()} ${list.maxOrNull()}"
        return answer
    }
}