class Solution {
    fun solution(food: IntArray): String {
        var answer: String = ""
        var answer2: String = ""
        for(i in 1..(food.size - 1)) {
            if((food[i] / 2) != 1) {
                for(j in 1..((food[i] / 2) - 1)) {
                    if(food[i] != 1) {
                        answer = answer.plus(i)
                    }
                }
            }
            if(food[i] != 1) {
                answer = answer.plus(i)
            }
        }
        
        answer = answer.plus(0)
        
        for(i in 1..(food.size - 1)) {
            if((food[i] / 2) != 1) {
                for(j in 1..((food[i] / 2) - 1)) {
                    if(food[i] != 1) {
                        answer2 = answer2.plus(i)
                    }
                }
            }
            if(food[i] != 1) {
                answer2 = answer2.plus(i)
            }
        }
        answer += answer2.toCharArray().sortedDescending().joinToString("")
        
        return answer
    }
}