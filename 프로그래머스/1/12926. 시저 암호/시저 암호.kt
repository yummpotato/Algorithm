class Solution {
    fun solution(s: String, n: Int): String {
        var answer: String = ""

        for(char in s) {
        if(char == ' ') {
            answer += ' ' //공백이면 공백을 answer에 더하는 것
        } else{ // 알파벳 갯수: 26개
            if(char in 'a'..'z') { // 소문자일 때
                answer += 'a' + (char.code - 'a'.code + n) % 26  //아스키 코드에서 알파벳(소문자)의 값을 넘어가면 다시 알파벳이 되도록
            } else if(char in 'A'..'Z') { // 대문자일 때
                answer += 'A' + (char.code - 'A'.code + n) % 26  //아스키 코드에서 알파벳(대문자)의 값을 넘어가면 다시 알파벳이 되도록
            }
        }
    }
    return answer
    }
}