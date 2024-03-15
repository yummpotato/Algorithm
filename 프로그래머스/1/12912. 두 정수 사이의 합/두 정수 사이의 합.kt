class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        
        when(true) {
            a == b -> return a.toLong()
            a > b -> return calcul(a, b)
            a < b -> return calcul(b, a)
        }
        
        return answer
    }
    
    fun calcul(a: Int, b: Int): Long {
        var max = (a - b) + 1
        var min = b + 1
        var result: Long = 0
        
        for(i in b..a) {
            result += i
        }
        return result
    }
}