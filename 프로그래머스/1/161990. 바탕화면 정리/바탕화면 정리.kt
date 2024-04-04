class Solution {
    fun solution(wallpaper: Array<String>): IntArray {
        var xArr = intArrayOf()
        var yArr = intArrayOf()
        for(i in 0 until wallpaper.size) {
            for(j in 0 until wallpaper[i].length) {
                if(wallpaper[i][j].equals('#')) {
                    xArr = xArr.plus(i)
                    yArr = yArr.plus(j)
                }
            }
        }
        
        return intArrayOf(xArr.minOrNull()!!, yArr.minOrNull()!!, xArr.maxOrNull()!! + 1, yArr.maxOrNull()!! + 1)
    }
}

// wallpaper: 컴퓨터 바탕화면의 상태를 나타낸 문자열 배열
// 결과: 파일을 한 번에 삭제하기 위한 최소한의 이동거리의 시작점과 끝 점