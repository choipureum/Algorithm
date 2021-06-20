// you can also use imports, for example:
import java.util.*;
import java.util.Comparator;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int[] A) {
        Circle[] list = new Circle[A.length];
        for(int i=0;i<A.length;i++)
        {
            Circle circle = new Circle(i,A[i]);
            list[i] = circle;
        }
        int points =0;
        Arrays.sort(list,(a,b)-> a.left -b.left);

        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(points > 10_000_000)
                {
                    return -1;
                }
                if(list[i].right < list[j].left)
                {
                    break;
                }
                if(list[j].left >= list[i].left && list[i].right >= list[j].left)
                {
                    points ++;
                }
            }

        }
        return points;      
    }

    
}

class Circle
{
    int left;
    int right;
    
    public Circle(int pos,int length){
        this.left = pos-length;
        this.right = pos+length;
    }
}
