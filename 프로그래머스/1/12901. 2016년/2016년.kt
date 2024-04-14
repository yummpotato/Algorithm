class Solution {
    fun solution(a: Int, b: Int): String {
        var month = intArrayOf(31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31)
        var week = arrayOf("THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED")
        
        var x = (0 until (a - 1)).map{
            month[it]
        }.sum() + b
        
        return week[x % 7]
    }
}