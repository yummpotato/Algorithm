class Solution {
    fun solution(left: Int, right: Int): Int {
        var cnt = 0 
        var result = 0
        
        for(i in left..right) {
            for(j in 1..i) {
                if(i % j == 0) {
                    cnt++
                }
            }
            
            if(cnt % 2 == 0) {
                result = result + i
            } else {
                result = result - i
            }
            cnt = 0
        }
        return result
    }
}