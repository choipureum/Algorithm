function solution(bridge_length, weight, truck_weights) {
    let answer = 0;
    
    let queue = [];
    let queueSum = 0;
    
    for(let i =0;i<bridge_length;i++){
        queue.push(0);
    }
    
    let now_truck = truck_weights.shift();
    
    queue.unshift(now_truck);
    queue.pop();

    queueSum += now_truck;
    answer++;
    

    while(queueSum){ 
        queueSum -= queue.pop();
        now_truck = truck_weights.shift();
        
        if(now_truck+queueSum<=weight){
            queue.unshift(now_truck);
            queueSum+=now_truck;
        }
        else{
            queue.unshift(0);
            truck_weights.unshift(now_truck);
        }
        answer++;
    }
    return answer;
}
