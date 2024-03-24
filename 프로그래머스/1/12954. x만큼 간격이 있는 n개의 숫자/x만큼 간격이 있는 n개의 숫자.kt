class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = longArrayOf()
        for(i: Long in 0..(n - 1).toLong()) {
            answer = answer.plus(x.toLong() + (i * x).toLong())
        }
        return answer
    }
}