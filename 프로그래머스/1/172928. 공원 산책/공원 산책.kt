class Solution {
    fun solution(park: Array<String>, routes: Array<String>): IntArray {
        var answer: IntArray = intArrayOf(0,0)
        var order = HashMap<String,IntArray>() //상하좌우
        order.put("N", intArrayOf(-1,0))
        order.put("S", intArrayOf(1,0))
        order.put("W", intArrayOf(0,-1))
        order.put("E", intArrayOf(0,1))

        // 시작좌표
        for(i in 0 until park.size){
            for(j in 0 until park[i].length){
                if(park[i][j] == 'S'){
                    answer = intArrayOf(i,j)
                }
            }
        }
        
        routes.forEach {
            var move = order[it.split(" ")[0]] //방향
            var count = it.split(" ")[1].toInt() // 이동 횟수
            var nr = answer[0] // (x, y)의 x
            var nc = answer[1] // (x, y)의 y

            for(i in 1 .. count){
                nr += move!![0]
                nc += move!![1]
                if(nr < 0 || nc < 0 || nr >= park.size || nc >= park[0].length || park[nr][nc] == 'X'){
                    nr = answer[0]
                    nc = answer[1]
                    break
                }
            }
            answer[0] = nr
            answer[1] = nc
        }

        return answer
    }
}