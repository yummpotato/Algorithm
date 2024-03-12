class Solution {
    fun solution(n: Int): Int {
        var arr = ArrayList<Int>(0)
        var cnt = 1
        
        while(cnt <= n) {
            if(n % cnt == 0) {
                arr.add(cnt)
            }
            cnt++
        }
        
        return arr.sum() 
    }
}