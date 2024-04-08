class Solution {
    fun solution(s: String, skip: String, index: Int): String {
        var result = ""

        s.forEach {char ->
            var newChar = char
            var count = index
            while (count > 0) {
                ++newChar
                if (newChar > 'z') newChar = 'a' // 알파벳 범위 넘어가면 원래대로 되돌려 놓기
                if (!skip.contains(newChar)) count--
            } 
            result += newChar
        }

        return result
    }
}