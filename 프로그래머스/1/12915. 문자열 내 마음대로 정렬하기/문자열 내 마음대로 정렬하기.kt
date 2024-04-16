class Solution {
    fun solution(strings: Array<String>, n: Int): List<String> = strings.sortedWith(compareBy({ it.getOrNull(n) }, { it }))
}