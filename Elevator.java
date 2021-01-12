package elevatorSystem;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static elevatorSystem.Main.*;
 
public class Elevator {
    /**
     * 엘리베이터에 Guest를 적재하는 역할을 하는 리스트
     */
    private List<Guest> inElevator = new ArrayList<Guest>();
    /**
     * 엘리베이터의 현재 상태를 실시간으로 브리핑
     */
    private String stateBriefing;
    /**
     * 엘리베이터 문의 열고 닫힌 상태
     */
    private boolean doorState;
    /**
     * 현재 적재된 중량
     */
    private float currentWeight;
    /**
     * 현재 엘리베이터가 위치한 층
     */
    private int currentLayer;
    /**
     * 엘리베이터의 목적지
     */
    private int destination;
    /**
     * 엘리베이터의 현재 운행상태 PAUSE, GOING_UP, GOING_DOWN 3가지로 나눠짐
     */
    private int state;
    
    private static final int PAUSE = 0;
    private static final int GOING_UP = 1;
    private static final int GOING_DOWN = 2;
    /**
     * 층간거리, 엘리베이터 이동 속도, 엘리베이터 최대 적재중량
     */
    private static final int LAYER_DISTANCE = 12;
    private static final int ELEVATOR_SPEED = 6;
    private static final float MAX_WEIGHT = 1000;
    /**
     * 현재 엘리베이터에 적재된 중량의 비율을 나타냄
     */
    private static final int PER_0_33_LOAD = 0;
    private static final int PER_33_66_LOAD = 1;
    private static final int PER_66_100_LOAD = 2;
    
    public Elevator() {
        this.currentLayer = 1;
    }
    
    public String getBriefing() {
        return stateBriefing;
    }
    public float getCurrentWeight() {
        return currentWeight;
    }
    public int getCurrentLayer() {
        return currentLayer;
    }
    public boolean getDoorState() {
        return doorState;
    }
 
    /**
     * 엘리베이터 알고리즘
     * 1. 현재층에서 내릴사람이 있는지 엘리베이터 내부를 확인한다.
     * 2. 현재층에서 탑승할 사람이 있는지 확인한다.(탑승시에 중량을 확인한다.)
     * 3-1. 탑승한 사람이 있으면 목적지를 결정한 후에 목적지를 설정한다.
     * 3-2. 탑승이 끝난후에도 엘리베이터가 비어있다면, 건물에 엘리베이터 기다리는 사람을 탐색한다.
     * 4. 건물에도 엘리베이터를 기다리는 사람이 없고 탑승자도 없다면 엘리베이터 운행을 끝낸다.
     * 5. 설정된 목적지가 있다면 목적지로 출발한다. (층마다 알고리즘 1,2 를 실행시킨다.)
     * @throws InterruptedException
     */
    public void goElevator() throws InterruptedException {
        
        while(layer != null) {
            algorithm1();
            algorithm2();
            
            if(inElevator.size() == 0) {
                if(algorithm3_2()) {
                    //알고리즘 4
                    layer = null;
                    continue;
                }
            }
            else {
                algorithm3_1();
            }
            
            algorithm5();
            
            /** 엘리베이터 운행이 끝난 후 가장 마지막층 일 경우 엘리베이터를 정지 상태로 설정한다.*/
            if(layer.length == currentLayer)
                state = PAUSE;
        }
    }
    
    /**
     * 엘리베이터가 위치한 현재 층에서 목적지가 현재층인 사람을 탐색한다.
     * @throws InterruptedException
     */
    private void algorithm1() throws InterruptedException {
        
        for(int q = 0 ; q < inElevator.size() ; q++)
            
            if(inElevator.get(q).getDestination() == currentLayer) {
                
                commonProcess(inElevator.get(q).getName()+" 하차중");
                
                // 하차완료한 사람의 경과시간 기록
                inElevator.get(q).setWaitTime(elapsedTime);
                
                // 하차완료한 사람을 결과 리스트에 저장
                result.add(inElevator.get(q));
                
                // 하차한 사람의 무게를 엘리베이터 중량에서 뺀다.
                currentWeight -= inElevator.get(q).getWeight();
                
                // 엘리베이터에서 제거
                inElevator.remove(q);
                q--;
            }
    }
    
    /**
     * 엘리베이터에 여유 적재공간이 남아있는지 판단한다.
     * 적재할 공간이 있다면, 층에 대기하고있는 Guest를 순서대로 탑승시킨다.
     * @throws InterruptedException
     */
    private void algorithm2() throws InterruptedException {
        
        for(int q = 0 ; MAX_WEIGHT - currentWeight >= 50 && q < layer[currentLayer - 1].size() ; q++)
            
            if( boardingCheck(layer[currentLayer - 1].get(q)) ) {
                
                commonProcess(layer[currentLayer - 1].get(q).getName()+" 탑승중");
                
                // 엘리베이터 탑승리스트에 탑승한 인원을 추가시킨다.
                inElevator.add(layer[currentLayer - 1].get(q));
                
                // 탑승한 사람의 무게를 엘리베이터 중량에 더한다.
                currentWeight += layer[currentLayer - 1].get(q).getWeight();
                
                // 탑승한 층에서 제거
                layer[currentLayer - 1].remove(q);
                q--;
            }
    }
    
    /** 건물에 엘리베이터를 기다리는 사람이 있는지 탐색한다.*/
    private boolean algorithm3_2() {
        int[] layerArr = Arrays.copyOf(exploreArr(), exploreArr().length);
        
        for(int q = 0 ; q < layer.length ; q ++) {
            
            int layerNumber = layerArr[q];
            if(layer[layerNumber].size() >= 1) {
                
                destination = layerNumber + 1;
                state = destination - currentLayer > 0 ? GOING_UP : GOING_DOWN ;
                return false;
            }
        }
        return true;
    }
    
    /**
     * 현재 엘리베이터의 상태에따라 목적지를 설정한다.
     * GOING_UP 및 GOING_DOWN 상태일 경우 가장 가까운 곳을 목적지로 선정한다.
     * PAUSE 상태일 경우 가장 먼 곳을 목적지로 선정한다.
     */
    private void algorithm3_1() {
        int[] tmpArr = new int[inElevator.size()];
        
        for(int q = 0 ; q < tmpArr.length ; q++)
            tmpArr[q] = inElevator.get(q).getDestination();
        
        Arrays.sort(tmpArr);
        destination = state == GOING_UP ? tmpArr[0] : tmpArr[tmpArr.length - 1];
        state = destination - currentLayer > 0 ? GOING_UP : GOING_DOWN ;
    }
    /**
     * 목적지가 결정되었을 경우에 실행되는 알고리즘.
     * 문을 닫는다.
     * 목적지까지의 거리를 계산한다.
     * 거리계산이 완료되면 stateBriefing에 현 상태를 기록하며 목적지 까지 이동한다.
     * 층마다 알고리즘1 과 2를 실행시켜 내리거나 탈 사람이 있는지 확인한다.
     * @throws InterruptedException
     */
    private void algorithm5() throws InterruptedException {
        doorController(false);
        int distance = Math.abs(destination - currentLayer) * LAYER_DISTANCE;
        int tmpLayer = 0;
        
        while(distance != 0) {
            
            stateBriefing = "이동중 (목적지 : "+destination+"층)";
            Thread.sleep(1000);
            
            //엘리베이터의 현재 적재무게에 따라 스피드를 다르게 설정한다.
            switch((int)(currentWeight / MAX_WEIGHT * 100) / 33) {
            case PER_0_33_LOAD:
                tmpLayer += ELEVATOR_SPEED;
                break;
            case PER_33_66_LOAD:
                tmpLayer += ELEVATOR_SPEED - 2;
                break;
            case PER_66_100_LOAD:
                tmpLayer += ELEVATOR_SPEED - 3;
                break;
            }
            
            if(tmpLayer == LAYER_DISTANCE) {
                distance -= tmpLayer;
                tmpLayer = 0;
                currentLayer += state == GOING_UP ? 1 : -1;
                
                if(distance != 0) {
                    /** 목적지로 이동중에 층마다 탑승이나 하차가 있는지 확인한다.*/
                    algorithm1();
                    algorithm2();
                    doorController(false);
                }
            }
        }
    }
 
    /** 엘리베이터가 정지상태이거나, 진행방향이 같거나, 다른층에 태울사람이 더이상 없을경우 탑승가능하다.*/
    private boolean boardingCheck(Guest guest) {
        if( (MAX_WEIGHT - currentWeight) >= guest.getWeight() )
            return state == PAUSE || state == guest.getState() || algorithm3_2() ? true : false;
        else
            return false;
    }
    
    /** flag를 true로 설정할 경우 문을 열고, false로 설정할 경우 문을 닫는다.
     * 요청들어온 flag와 문의 상태가 일치 한다면 문은 현상태를 유지한다.
     * 문이 열리고 닫히는데에는 1초가 소요된다. */
    private void doorController(boolean flag) throws InterruptedException {
        if(doorState != flag) {
            Thread.sleep(1000);
            doorState = flag;
        }
    }
    
    /** 엘리베이터의 상태에따라 위에서 아래로, 혹은 아래에서 위로 건물을 탐색한다.*/
    private int[] exploreArr() {
        int[] tmpArr = new int[layer.length];
        int index = 0;
        
        switch(state) {
        case PAUSE:
            for(int q = 0 ; q < tmpArr.length ; q++)
                tmpArr[q] = q;
            break;
        case GOING_UP:
            index += exploreUp(tmpArr, index);
            index += exploreDown(tmpArr, index);
            break;
        case GOING_DOWN:
            index += exploreDown(tmpArr, index);
            index += exploreUp(tmpArr, index);
            break;
        }
        return tmpArr;
    }
    
    private int exploreUp(int[] arr, int index) {
 
        for(int q = arr.length - 1 ; q != currentLayer - 1 ; q--) {
            arr[index] = q;
            index ++;
        }
        return index;
    }
    
    private int exploreDown(int[] arr, int index) {
 
        for(int q = 0 ; q != currentLayer - 1 ; q++) {
            arr[index] = q;
            index ++;
        }
        return index;
    }
    
    /** 1.문이 닫혀있을때 문을연다.
     *  2.엘리베이터의 상태를 실시간으로 변경시킨다.*/
    private void commonProcess(String msg) throws InterruptedException {
        doorController(true);
        stateBriefing = msg;
        Thread.sleep(1000);
    }
}
