class Solution {
    fun solution(arr: IntArray): IntArray {
        if(arr.size != 1) {
            return arr.filter { it != arr.minOrNull() }.toIntArray()
        }
        return intArrayOf(-1)
    }
}