class Solution {
    fun solution(age: Int): Int {
        var answer: Int = 0
        if(age > 0 && age <= 120) {
            answer = (2022 - age) + 1
        }
        return answer
    }
}