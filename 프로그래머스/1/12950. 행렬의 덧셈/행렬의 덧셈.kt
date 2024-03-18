class Solution {
    fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
        var answer = Array<IntArray>(arr1.size){IntArray(arr1[0].size)}
        
        for(i in 0..(arr1.size - 1)) {
            for(j in 0..(arr1[i].size - 1)){
                 answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
        
        return answer
    }
}