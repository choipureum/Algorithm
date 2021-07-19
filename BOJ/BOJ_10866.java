import java.util.*;


public class Main
{
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        int N = sc.nextInt();
        int K = sc.nextInt();
        //1. ds
        Queue<Integer> queue = new LinkedList<>();

        for(int i=1;i<=N;i++)
        {
            queue.add(i);
        }
        int count =0;

        while(queue.size()!= 1)
        {
            count++; //1
            int n = queue.poll();

            if(count == K) //3 == 3
            {
                sb.append(n);
                sb.append(", ");
                count=0;
            }
            else{
                queue.add(n);
            }
        }
        sb.append(queue.poll());
        sb.append(">");
        System.out.println(sb.toString());
    }
}




