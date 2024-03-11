class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        if (num1 > 0 && num1 <= 100) {
            if (num2 > 0 && num2 <= 100) {
                val res = num1.toFloat() / num2.toFloat()
                val res2 = res * 1000
                answer = res2.toInt()
            }
        }
        return answer
    }
}