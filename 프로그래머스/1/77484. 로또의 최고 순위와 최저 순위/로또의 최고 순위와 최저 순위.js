function solution(lottos, win_nums) {
    var answer = [];
    var same = 0;
    var unknown = 0;
    
    var max = 0;
    var min = 0;
    
    lottos.forEach((lotto) => {
        win_nums.forEach((win) => {
            {lotto == win ? same++ : null}
        })
        
        {lotto == 0 ? unknown++ : null}
    })
    
    switch(same) {
        case 6: max = 1; min = 1; break;
        case 5: {
            min = 2; 
            {unknown == 1 ? max = 1 : max = 2}
            break;
        }
        case 4: { 
            min = 3; 
            if(unknown == 1) {
                max = 2;
                break;
            } else if(unknown ==  2) {
                max = 1;
                break;
            } max = 3;
            break;
        }
        case 3: { 
            min = 4; 
            if(unknown == 1) {
                max = 3;
                break;
            } else if(unknown ==  2) {
                max = 2;
                break;
            } else if(unknown == 3) {
                max = 1;
                break;
            } max = 4;
            break;
        }
        case 2: { 
            min = 5; 
            if(unknown == 1) {
                max = 4;
                break;
            } else if(unknown ==  2) {
                max = 3;
                break;
            } else if(unknown == 3) {
                max = 2;
                break;
            } else if(unknown == 4) {
                max = 1;
                break;
            } max = 5;
            break;
        }
        case 1: { 
            min = 6;
            if(unknown == 1) {
                max = 5;
                break;
            } else if(unknown ==  2) {
                max = 4;
                break;
            } else if(unknown == 3) {
                max = 3;
                break;
            } else if(unknown == 4) {
                max = 2;
                break;
            } else if(unknown == 5) {
                max = 1;
                break;
            } max = 6;
            break;
        }
        case 0: { 
            min = 6;
            if(unknown == 1) {
                max = 6;
                break;
            } else if(unknown ==  2) {
                max = 5;
                break;
            } else if(unknown == 3) {
                max = 4;
                break;
            } else if(unknown == 4) {
                max = 3;
                break;
            } else if(unknown == 5) {
                max = 2;
                break;
            } else if(unknown == 6) {
                max = 1;
                break;
            }
            max = 6;
            break;
        }
    }
    return [max, min];
}

// 알아볼 수 없는 번호: 0으로 표기
// lottos: 로또 번호를 담은 배열
// win_nums: 당첨 번호를 담은 배열
// 동일한 숫자가 담겨 있지 않음.
// 결과: [당첨 가능한 최고 순위, 최저 순위]