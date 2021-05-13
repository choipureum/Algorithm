import java.util.*;

public class MergeInterval {
	public static void main(String[] args) {
		MergeInterval e = new MergeInterval();
		Ex_Interval in1 = new Ex_Interval(1,3);
		Ex_Interval in2 = new Ex_Interval(2,6);
		Ex_Interval in3 = new Ex_Interval(15,18);
		Ex_Interval in4 = new Ex_Interval(8,10);
		List<Ex_Interval> intervals = new ArrayList<Ex_Interval>();
		intervals.add(in1);
		intervals.add(in2);
		intervals.add(in3);
		intervals.add(in4);
		
		List<Ex_Interval> list = e.merge(intervals);
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).start + " "+list.get(i).end);
		}
		
	}
	public List<Ex_Interval> merge(List<Ex_Interval> intervals){
		if(intervals.isEmpty())return intervals;
		//1 sorting
		Collections.sort(intervals, (a,b) -> a.start - b.start); //람다표현 오름차순
		//1 ds
		List<Ex_Interval> result = new ArrayList<Ex_Interval>();
		
		//2 merge
			//
		Ex_Interval before = intervals.get(0); //[1,3]
		
		for(int i=1;i<intervals.size();i++) {
			Ex_Interval current = intervals.get(i);
			if(before.end >= current.start) { //merge하는경우
				before.end = Math.max(before.end, current.end); //[2,6]
			}else {
				result.add(before);
				before = current;
			}	
		}
		//result에 before가 없다면
		if(!result.contains(before)) {
			result.add(before);
		}
		return result;
	}
	
	
	
}

class Ex_Interval{
	int start;
	int end;
	
	public Ex_Interval() {
		// TODO Auto-generated constructor stub
		this.start =0;
		this.end =0;
	}
	public Ex_Interval(int s,int e) {
		this.start =s;
		this.end=e;
	}
}
