class Solution {
    fun solution(x: Int): Boolean {
        var xts = x.toString().sumOf {it.digitToInt()}
        if(x % xts == 0) return true
        return false
    }
}