function PriorityQueue(callback){
    this.queue = [];
    this.length = this.queue.length;
    this.callback = callback;
}

PriorityQueue.prototype.sort = function(callback){
    Array.prototype.sort.call(this.queue, this.callback || callback);
};

PriorityQueue.prototype.offer = function(value){
    this.queue.push(value);
    this.length = this.queue.length;
    this.sort();
};

PriorityQueue.prototype.add = function(value){
    try{
        this.offer(value);
        return true;
    }catch(Exception){
        throw Error('IllegalStateException');
    }
};

PriorityQueue.prototype.poll = function(){
    var result;
    
    if( this.queue.length > 0 )
        result = this.queue.shift();
    else
        result = null;
    
    this.length = this.queue.length;
    return result;
};

PriorityQueue.prototype.remove = function(){
    this.poll();
};

PriorityQueue.prototype.clear = function(){
    this.queue = [];
    this.length = 0;
};

function solution(jobs) {
    var answer = 0;    
    
    jobs.sort(function(a, b){
        return a[0] - b[0];
    });
    
    var now = 0;    
    var total = 0; 
    var index = 0;  
    
    var priorityQueue = new PriorityQueue(function(a, b){
        return a[1] - b[1];
    });

    while( index < jobs.length || priorityQueue.length > 0 ){
        if( index < jobs.length && now >= jobs[index][0] ){
            priorityQueue.offer(jobs[index]);
            index = index + 1;
            continue;
        }
        
        if( !priorityQueue.length ){
            now = jobs[index][0];
        }else{
            var data = priorityQueue.poll();   
            now = now + data[1];    
            total = now - data[0];
            answer = answer + total;
            console.log(now + " "+ total);
        }
    }

    answer = parseInt(answer / jobs.length);
    return answer;
}

const jobs = [[0, 3], [1, 9], [2, 6]];
console.log(solution(jobs)); //9
