class Solution {
    fun solution(players: Array<String>, callings: Array<String>): Array<String> {
        var nameToRank = mutableMapOf<String, Int>()
        players.forEachIndexed { index, player -> nameToRank[player] = index }
        callings.forEach { player -> 
            var findIndex = nameToRank[player]!!
            var switchedPlayer = players[findIndex - 1]

            //원래 배열 자리바꾸기
            players[findIndex] = switchedPlayer
            players[findIndex - 1] = player

            //Map update
            nameToRank[player] = nameToRank[player]!! - 1
            nameToRank[switchedPlayer] = nameToRank[switchedPlayer]!! + 1
        }
        return players
    }
}