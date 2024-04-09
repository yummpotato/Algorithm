class Solution {
    fun solution(t: String, p: String): Long {
        var start = 0
        var end = p.length
        var count = 0L
        for(i in 0 until t.length - p.length + 1) {
            if((t.substring(start, end)).toLong() <= p.toLong()) count++
            start++
            end++
        }
        return count
    }
}