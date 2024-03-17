class Solution {
    fun solution(num: Int): Int {
        var answer = num
        var cnt = 0
        
        if(num == 1) return 0
        
        while(answer > 1) {
            if(answer % 2 == 0) {
                answer = answer / 2
                cnt++
                
                if(answer == 1) {
                    return cnt
                } 
            } else {
                answer = answer * 3 + 1
                cnt++
                
                if(answer == 1) {
                    return cnt
                }
            }
        }
        
        return -1
    }
}