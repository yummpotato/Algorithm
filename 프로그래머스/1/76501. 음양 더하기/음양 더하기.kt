class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        for(i in 0..(signs.size - 1)) {
            if(signs[i] == false) {
                absolutes[i] = (-1) * absolutes[i]
            }
        }
        
        return absolutes.sum()
    }
}