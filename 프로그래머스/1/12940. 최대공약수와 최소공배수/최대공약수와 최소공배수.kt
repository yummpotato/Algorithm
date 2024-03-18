class Solution {
    fun solution(n: Int, m: Int): IntArray {
        return intArrayOf(gcm(n, m), lcm(n, m))
    }

    fun gcm(a: Int, b: Int): Int { //최대공약수
        var maximum = Math.max(a, b)
        var minimum = Math.min(a, b)

        if (minimum == 0) {
            return maximum
        } else {
            return gcm(minimum, maximum % minimum) //재귀함수
        }
    }

    fun lcm(a: Int, b: Int): Int = //최소공배수
        (a * b) / gcm(a, b)
}