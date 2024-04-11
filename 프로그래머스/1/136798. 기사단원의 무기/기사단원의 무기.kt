class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var count = 0
        var arr = intArrayOf()
        
        for(i in 1..number) {
            var root = Math.sqrt(i.toDouble()).toInt()
            count = 0
            for(j in 1..root) {
                if (i % j == 0) {
                    if (i / j == j) count += 1
                    if (i / j != j) count += 2
                }
            }
            arr = arr.plus(count)
        }
        
        for(i in 0 until arr.size) {
            if(arr[i] > limit){
                arr[i] = power
            }
        }
        
        return arr.sum()
    }
}

// N번 기사단원이 구매하는 무기의 공격력: N의 약수의 갯수
// 단, 공격력의 제한 수치가 3, 제한수치를 초과한 기사가 사용할 무기의 공격력: 2 -> 2를 구매해야 함.
// 무기의 공격력 1당 1kg의 철 필요
// number: 기사단원의 수
// limit: 공격력의 제한수치
// power: 제한수치를 초과한 기사가 사용할 무기의 공격력
// 결과: 무기를 만들기 위해 필요한 철의 무게 (무기의 공격력의 총합)