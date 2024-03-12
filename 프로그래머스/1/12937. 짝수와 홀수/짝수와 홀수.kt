class Solution {
    fun solution(num: Int): String {
        var result = ""
        if(num % 2 == 0) {
            result = "Even"
        } else {
            result = "Odd"
        }
        
        return result
    }
}