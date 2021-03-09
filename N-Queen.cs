using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Simulation
{
    //백트래킹(BackTracking) , 깊이 우선 탐색
    class Program
    {
        public static int N = 8;
        public static int[] cols = new int[N + 1];
        
        public static bool queens(int level)
        {
            if (!promising(level))
            {
                return false;
            }
            else if(level == N)
            {
                for(int i = 1; i <= N; i++)
                {
                    Console.WriteLine("("+i+","+cols[i] +")");
                }
                return true;
            }
            else
            {
                for(int i = 1; i <= N; i++)
                {
                    cols[level + 1] = i;
                    if (queens(level + 1))
                    {
                        return true;
                    }
                }
                return false;
            }
        }
        public static bool promising(int level)
        {
            for(int i = 1; i < level; i++)
            {
                if(cols[i] == cols[level])
                {
                    return false;
                }
                else if(level-i == Math.Abs(cols[level]- cols[i]))
                {
                    return false;
                }              
            }
            return true;
        }

        public static void Main(string[] args)
        {
            queens(0);
        }

    }
}
