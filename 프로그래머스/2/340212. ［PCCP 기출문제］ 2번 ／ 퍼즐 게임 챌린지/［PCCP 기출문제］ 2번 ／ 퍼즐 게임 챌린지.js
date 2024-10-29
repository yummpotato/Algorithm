function solution(diffs, times, limit) {
    let left = 1;
    let right = 100000;
    
    while(left <= right) {
        // 이진 탐색을 위한 mid 선언
        const mid = Math.floor((left + right) / 2);
        if(calcul(mid)) right = mid - 1; // 최댓값 바꾸기
        else left = mid + 1; // 최솟값 바꾸기
    }
    
    // 문제 해결이 가능한 난이도인지 판별
    function calcul(level) {
        let curTimeSum = 0; // 총 계산 시간
        for(let i = 0; i < diffs.length; i++) {
            const prevTime = i > 0 ? times[i - 1] : 0;
            const curDiff = diffs[i];
            const curTime = times[i];
            // 내 숙련도로 현재 문제를 깬다면
            if(level >= curDiff) {
                curTimeSum += curTime;
            } else {
                // 문제 틀리는 횟수
                const wrongCnt = curDiff - level;
                // 소비될 시간
                curTimeSum += (prevTime + curTime) * wrongCnt + curTime;
            }
        }
        return curTimeSum <= limit;
    }
    return left;
}