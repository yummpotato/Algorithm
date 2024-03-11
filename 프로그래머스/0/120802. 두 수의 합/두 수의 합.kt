class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = -1
        if (num1 >= -50000 && num1 <= 50000) {
            if (num2 >= -50000 && num2 <= 50000) {
                answer = num1 + num2
            }
        }
        return answer
    }
}