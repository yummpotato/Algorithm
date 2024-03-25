class Solution {
    fun solution(name: Array<String>, yearning: IntArray, photo: Array<Array<String>>): IntArray {
        var answer: IntArray = IntArray(photo.size)
        
        // 이름 배열: name, 그리움 점수 배열: yearning, 사진에 찍힌 인물의 이름 2차원 배열: photo
        // 결과: 추억 점수 배열
        for(i in 0..(photo.lastIndex)) {
            for(j in photo[i]) {
                if(name.contains(j)) {
                    for(k in 0..(name.lastIndex)) {
                        if(name[k] == j) {
                            answer[i] += yearning[k]
                        }
                    } 
                }
            }
        }
        return answer
    }
}