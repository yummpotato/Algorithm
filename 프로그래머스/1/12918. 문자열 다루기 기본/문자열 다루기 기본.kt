class Solution {
    fun solution(s: String): Boolean {
        if(s.length == 4 || s.length == 6) {
            if(s.toIntOrNull() != null) return true
        }
        return false
    }
}