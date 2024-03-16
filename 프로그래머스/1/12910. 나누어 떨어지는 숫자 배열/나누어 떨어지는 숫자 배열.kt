class Solution {
    fun solution(arr: IntArray, divisor: Int): List<Int> {
        var answer = arr.filter{ it % divisor == 0 }
        
        if(answer.size == 0) return listOf(-1)
        
        return answer.sorted()
    }
}