class Solution {
    fun solution(n: Int): String {
        var answer = ""
        var su = "수"
        var bak = "박"
        
        for(i in 1..n) {
            if(i % 2 == 0) {
                answer = answer + bak
            } else {
                answer = answer + su
            }
        }
        
        return answer
    }
}