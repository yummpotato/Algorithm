class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var count = 1
        
        while(count < n) {
            if(n % count == 1) {
                answer = count
                break
            } 
            count++
        }
        
        return answer
    }
}