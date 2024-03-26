// n: 1미터 길이의 구역 갯수, m: 롤러의 길이, section: 구역들의 번호 배열
// 결과: 페인트칠해야 하는 최소 횟수
// if, m == 4 -> 4m까지 칠할 수 있음.
class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 1 // 롤러가 움직인 횟수(결과)
        var start = section[0] // 롤러의 시작 지점 위치
        for(i in 0 until section.size){ //칠해야 할 구역
            //현재 롤러가 움직인 범위 내에 있는 경우:
            if(section[i] <= start + m -1){ 
                continue
            }
            //현재 롤러가 움직인 범위 밖에 있는 경우:
            else{
                //롤러의 시작 지점을 칠해야 할 구역으로 움직이고
                start = section[i]
                //칠하기
                answer++
            }
        }
        return answer
    }
}